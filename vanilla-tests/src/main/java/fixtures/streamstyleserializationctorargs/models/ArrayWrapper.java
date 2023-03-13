// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationctorargs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/** The ArrayWrapper model. */
@Fluent
public final class ArrayWrapper implements JsonSerializable<ArrayWrapper> {
    /*
     * The array property.
     */
    private List<String> array;

    /** Creates an instance of ArrayWrapper class. */
    public ArrayWrapper() {}

    /**
     * Get the array property: The array property.
     *
     * @return the array value.
     */
    public List<String> getArray() {
        return this.array;
    }

    /**
     * Set the array property: The array property.
     *
     * @param array the array value to set.
     * @return the ArrayWrapper object itself.
     */
    public ArrayWrapper setArray(List<String> array) {
        this.array = array;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("array", this.array, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArrayWrapper from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArrayWrapper if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArrayWrapper.
     */
    public static ArrayWrapper fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    ArrayWrapper deserializedArrayWrapper = new ArrayWrapper();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("array".equals(fieldName)) {
                            List<String> array = reader.readArray(reader1 -> reader1.getString());
                            deserializedArrayWrapper.array = array;
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedArrayWrapper;
                });
    }
}