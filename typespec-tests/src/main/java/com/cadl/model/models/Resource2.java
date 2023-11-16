// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.model.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Resource2 model.
 */
@Immutable
public final class Resource2 implements JsonSerializable<Resource2> {
    /*
     * The name property.
     */
    @Generated
    private final String name;

    /*
     * The data2 property.
     */
    @Generated
    private final InputOutputData2 data2;

    /**
     * Creates an instance of Resource2 class.
     * 
     * @param name the name value to set.
     * @param data2 the data2 value to set.
     */
    @Generated
    public Resource2(String name, InputOutputData2 data2) {
        this.name = name;
        this.data2 = data2;
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
     * Get the data2 property: The data2 property.
     * 
     * @return the data2 value.
     */
    @Generated
    public InputOutputData2 getData2() {
        return this.data2;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("data2", this.data2);
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
            boolean nameFound = false;
            String name = null;
            boolean data2Found = false;
            InputOutputData2 data2 = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("data2".equals(fieldName)) {
                    data2 = InputOutputData2.fromJson(reader);
                    data2Found = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && data2Found) {
                return new Resource2(name, data2);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!data2Found) {
                missingProperties.add("data2");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
