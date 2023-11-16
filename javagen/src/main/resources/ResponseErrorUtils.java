import com.azure.core.models.ResponseError;
import com.azure.core.models.ResponseInnerError;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.util.List;

/**
 * Utility class that handles serializing and deserializing {@link ResponseError} objects.
 */
public final class ResponseErrorUtils {
    /**
     * Writes the object to the passed {@link ResponseError}.
     *
     * @param jsonWriter Where the {@link ResponseError} JSON will be written.
     * @return The {@link JsonWriter} where the JSON was written.
     * @throws IOException If the {@link ResponseError} fails to be written to the {@code jsonWriter}.
     */
    public static JsonWriter toJson(JsonWriter jsonWriter, ResponseError responseError) throws IOException {
        return jsonWriter.writeStartObject()
            .writeStringField("code", responseError.getCode())
            .writeStringField("message", responseError.getMessage())
            .writeEndObject();
    }
    /**
     * Reads a JSON stream into a {@link ResponseError}.
     *
     * @param jsonReader The {@link JsonReader} being read.
     * @return The {@link ResponseError} that the JSON stream represented, or null if it pointed to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If a {@link ResponseError} fails to be read from the {@code jsonReader}.
     */
    public static ResponseError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            // Buffer the next JSON object as ResponseError can take two forms:
            //
            // - A ResponseError object
            // - A ResponseError object wrapped in an "error" node.
            JsonReader bufferedReader = reader.bufferObject();
            bufferedReader.nextToken(); // Get to the START_OBJECT token.
            while (bufferedReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = bufferedReader.getFieldName();
                bufferedReader.nextToken();

                if ("error".equals(fieldName)) {
                    // If the ResponseError was wrapped in the "error" node begin reading it now.
                    return readResponseError(bufferedReader);
                } else {
                    bufferedReader.skipChildren();
                }
            }

            // Otherwise reset the JsonReader and read the whole JSON object.
            return readResponseError(bufferedReader.reset());
        });
    }

    private static ResponseError readResponseError(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String code = null;
            boolean codeFound = false;
            String message = null;
            boolean messageFound = false;

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    code = reader.getString();
                    codeFound = true;
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                    messageFound = true;
                } else {
                    reader.skipChildren();
                }
            }

            if (!codeFound && !messageFound) {
                throw new IllegalStateException("Missing required properties: code, message");
            } else if (!codeFound) {
                throw new IllegalStateException("Missing required property: code");
            } else if (!messageFound) {
                throw new IllegalStateException("Missing required property: message");
            }

            return new ResponseError(code, message);
        });
    }
}
