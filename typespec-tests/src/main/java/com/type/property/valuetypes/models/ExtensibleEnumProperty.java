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
 * Model with extensible enum properties.
 */
@Immutable
public final class ExtensibleEnumProperty implements JsonSerializable<ExtensibleEnumProperty> {
    /*
     * Property
     */
    @Generated
    private final InnerEnum property;

    /**
     * Creates an instance of ExtensibleEnumProperty class.
     * 
     * @param property the property value to set.
     */
    @Generated
    public ExtensibleEnumProperty(InnerEnum property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    @Generated
    public InnerEnum getProperty() {
        return this.property;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("property", this.property == null ? null : this.property.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensibleEnumProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensibleEnumProperty if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExtensibleEnumProperty.
     */
    public static ExtensibleEnumProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InnerEnum property = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    property = InnerEnum.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new ExtensibleEnumProperty(property);
        });
    }
}
