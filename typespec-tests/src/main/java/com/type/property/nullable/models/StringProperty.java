// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.nullable.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.type.property.nullable.implementation.JsonMergePatchHelper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Template type for testing models with nullable property. Pass in the type of the property you are looking for.
 */
@Immutable
public final class StringProperty implements JsonSerializable<StringProperty> {
    /*
     * Required property
     */
    @Generated
    private final String requiredProperty;

    /*
     * Property
     */
    @Generated
    private final String nullableProperty;

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setStringPropertyAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of StringProperty class.
     * 
     * @param requiredProperty the requiredProperty value to set.
     * @param nullableProperty the nullableProperty value to set.
     */
    @Generated
    public StringProperty(String requiredProperty, String nullableProperty) {
        this.requiredProperty = requiredProperty;
        this.nullableProperty = nullableProperty;
    }

    /**
     * Get the requiredProperty property: Required property.
     * 
     * @return the requiredProperty value.
     */
    @Generated
    public String getRequiredProperty() {
        return this.requiredProperty;
    }

    /**
     * Get the nullableProperty property: Property.
     * 
     * @return the nullableProperty value.
     */
    @Generated
    public String getNullableProperty() {
        return this.nullableProperty;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("requiredProperty", this.requiredProperty);
            jsonWriter.writeStringField("nullableProperty", this.nullableProperty);
            return jsonWriter.writeEndObject();
        }
    }

    public JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (this.requiredProperty != null) {
            jsonWriter.writeStringField("requiredProperty", this.requiredProperty);
        } else if (updatedProperties.contains("requiredProperty")) {
            jsonWriter.writeNullField("requiredProperty");
        }
        if (this.nullableProperty != null) {
            jsonWriter.writeStringField("nullableProperty", this.nullableProperty);
        } else if (updatedProperties.contains("nullableProperty")) {
            jsonWriter.writeNullField("nullableProperty");
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StringProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StringProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StringProperty.
     */
    public static StringProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String requiredProperty = null;
            String nullableProperty = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("requiredProperty".equals(fieldName)) {
                    requiredProperty = reader.getString();
                } else if ("nullableProperty".equals(fieldName)) {
                    nullableProperty = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new StringProperty(requiredProperty, nullableProperty);
        });
    }
}
