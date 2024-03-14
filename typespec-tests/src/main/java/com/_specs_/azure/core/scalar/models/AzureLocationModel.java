// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.scalar.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AzureLocationModel model.
 */
@Immutable
public final class AzureLocationModel implements JsonSerializable<AzureLocationModel> {
    /*
     * The location property.
     */
    @Generated
    private final String location;

    /**
     * Creates an instance of AzureLocationModel class.
     * 
     * @param location the location value to set.
     */
    @Generated
    public AzureLocationModel(String location) {
        this.location = location;
    }

    /**
     * Get the location property: The location property.
     * 
     * @return the location value.
     */
    @Generated
    public String getLocation() {
        return this.location;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureLocationModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureLocationModel if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureLocationModel.
     */
    @Generated
    public static AzureLocationModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String location = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new AzureLocationModel(location);
        });
    }
}