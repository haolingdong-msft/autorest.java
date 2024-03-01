// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.httpinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The B model.
 */
@Fluent
public final class B extends MyException {
    /*
     * The textStatusCode property.
     */
    private String textStatusCode;

    /**
     * Creates an instance of B class.
     */
    public B() {
    }

    /**
     * Get the textStatusCode property: The textStatusCode property.
     * 
     * @return the textStatusCode value.
     */
    public String getTextStatusCode() {
        return this.textStatusCode;
    }

    /**
     * Set the textStatusCode property: The textStatusCode property.
     * 
     * @param textStatusCode the textStatusCode value to set.
     * @return the B object itself.
     */
    public B setTextStatusCode(String textStatusCode) {
        this.textStatusCode = textStatusCode;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public B setStatusCode(String statusCode) {
        super.setStatusCode(statusCode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("statusCode", getStatusCode());
        jsonWriter.writeStringField("textStatusCode", this.textStatusCode);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of B from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of B if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the B.
     */
    public static B fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            B deserializedB = new B();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("statusCode".equals(fieldName)) {
                    deserializedB.setStatusCode(reader.getString());
                } else if ("textStatusCode".equals(fieldName)) {
                    deserializedB.textStatusCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedB;
        });
    }
}
