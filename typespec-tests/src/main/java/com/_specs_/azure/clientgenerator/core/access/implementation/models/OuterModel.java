// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.clientgenerator.core.access.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Used in internal operations, should be generated but not exported.
 */
@Immutable
public final class OuterModel extends BaseModel {
    /*
     * The inner property.
     */
    @Generated
    private final InnerModel inner;

    /**
     * Creates an instance of OuterModel class.
     * 
     * @param name the name value to set.
     * @param inner the inner value to set.
     */
    @Generated
    private OuterModel(String name, InnerModel inner) {
        super(name);
        this.inner = inner;
    }

    /**
     * Get the inner property: The inner property.
     * 
     * @return the inner value.
     */
    @Generated
    public InnerModel getInner() {
        return this.inner;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeJsonField("inner", this.inner);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OuterModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OuterModel if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OuterModel.
     */
    public static OuterModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean innerFound = false;
            InnerModel inner = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("inner".equals(fieldName)) {
                    inner = InnerModel.fromJson(reader);
                    innerFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && innerFound) {
                return new OuterModel(name, inner);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!innerFound) {
                missingProperties.add("inner");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
