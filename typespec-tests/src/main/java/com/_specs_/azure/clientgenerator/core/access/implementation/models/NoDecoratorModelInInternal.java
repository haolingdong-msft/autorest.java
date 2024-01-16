// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.clientgenerator.core.access.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * <!-- start generated doc -->
 * Used in an internal operation, should be generated but not exported.
 * <!-- end generated doc -->
 */
@Immutable
public final class NoDecoratorModelInInternal implements JsonSerializable<NoDecoratorModelInInternal> {
    /*
     * The name property.
     */
    @Generated
    private final String name;

    /**
     * Creates an instance of NoDecoratorModelInInternal class.
     * 
     * @param name the name value to set.
     */
    @Generated
    private NoDecoratorModelInInternal(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NoDecoratorModelInInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NoDecoratorModelInInternal if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NoDecoratorModelInInternal.
     */
    public static NoDecoratorModelInInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new NoDecoratorModelInInternal(name);
        });
    }
}
