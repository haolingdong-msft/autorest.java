// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.optional.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Model with a plaindate property.
 */
@Fluent
public final class PlaindateProperty implements JsonSerializable<PlaindateProperty> {
    /*
     * Property
     */
    @Generated
    private LocalDate property;

    /**
     * Creates an instance of PlaindateProperty class.
     */
    @Generated
    public PlaindateProperty() {
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    @Generated
    public LocalDate getProperty() {
        return this.property;
    }

    /**
     * Set the property property: Property.
     * 
     * @param property the property value to set.
     * @return the PlaindateProperty object itself.
     */
    @Generated
    public PlaindateProperty setProperty(LocalDate property) {
        this.property = property;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("property", Objects.toString(this.property, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PlaindateProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PlaindateProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PlaindateProperty.
     */
    @Generated
    public static PlaindateProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PlaindateProperty deserializedPlaindateProperty = new PlaindateProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    deserializedPlaindateProperty.property
                        = reader.getNullable(nonNullReader -> LocalDate.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPlaindateProperty;
        });
    }
}