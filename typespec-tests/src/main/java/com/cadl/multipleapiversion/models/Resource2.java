// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.multipleapiversion.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * <!-- start generated doc -->
 * The Resource2 model.
 * <!-- end generated doc -->
 */
@Immutable
public final class Resource2 implements JsonSerializable<Resource2> {
    /*
     * The id property.
     */
    @Generated
    private String id;

    /*
     * The name property.
     */
    @Generated
    private String name;

    /*
     * The type property.
     */
    @Generated
    private final String type;

    /**
     * Creates an instance of Resource2 class.
     * 
     * @param type the type value to set.
     */
    @Generated
    private Resource2(String type) {
        this.type = type;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
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

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Resource2 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Resource2 if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Resource2.
     */
    public static Resource2 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            String name = null;
            String type = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            Resource2 deserializedResource2 = new Resource2(type);
            deserializedResource2.id = id;
            deserializedResource2.name = name;

            return deserializedResource2;
        });
    }
}
