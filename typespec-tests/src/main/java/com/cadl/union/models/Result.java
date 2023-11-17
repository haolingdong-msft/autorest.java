// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.union.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Result model.
 */
@Fluent
public class Result implements JsonSerializable<Result> {
    /*
     * The name property.
     */
    @Generated
    private final String name;

    /*
     * The result property.
     */
    @Generated
    private Result result;

    /*
     * The data property.
     */
    @Generated
    private final BinaryData data;

    /**
     * Creates an instance of Result class.
     * 
     * @param name the name value to set.
     * @param data the data value to set.
     */
    @Generated
    public Result(String name, BinaryData data) {
        this.name = name;
        this.data = data;
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
     * Get the result property: The result property.
     * 
     * @return the result value.
     */
    @Generated
    public Result getResult() {
        return this.result;
    }

    /**
     * Set the result property: The result property.
     * 
     * @param result the result value to set.
     * @return the Result object itself.
     */
    @Generated
    public Result setResult(Result result) {
        this.result = result;
        return this;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Generated
    public BinaryData getData() {
        return this.data;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeUntypedField("data", this.data.toObject(Object.class));
        jsonWriter.writeJsonField("result", this.result);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Result from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Result if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Result.
     */
    public static Result fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean dataFound = false;
            BinaryData data = null;
            Result result = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("data".equals(fieldName)) {
                    data = BinaryData.fromObject(reader.readUntyped());
                    dataFound = true;
                } else if ("result".equals(fieldName)) {
                    result = Result.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && dataFound) {
                Result deserializedResult = new Result(name, data);
                deserializedResult.result = result;

                return deserializedResult;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!dataFound) {
                missingProperties.add("data");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}