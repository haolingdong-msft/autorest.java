// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.valuetypes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Model with model properties.
 */
@Immutable
public final class ModelProperty implements JsonSerializable<ModelProperty> {
    /*
     * Property
     */
    @Generated
    private final InnerModel property;

    /**
     * Creates an instance of ModelProperty class.
     * 
     * @param property the property value to set.
     */
    @Generated
    public ModelProperty(InnerModel property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    @Generated
    public InnerModel getProperty() {
        return this.property;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("property", this.property);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModelProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModelProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ModelProperty.
     */
    public static ModelProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean propertyFound = false;
            InnerModel property = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    property = InnerModel.fromJson(reader);
                    propertyFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (propertyFound) {
                return new ModelProperty(property);
            }
            throw new IllegalStateException("Missing required property: property");
        });
    }
}
