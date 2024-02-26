// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.cadl.partialupdate.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The PartialUpdateModel model.
 */
@Immutable
public final class PartialUpdateModel implements JsonSerializable<PartialUpdateModel> {

    /*
     * The boolean property.
     */
    @Generated
    private final boolean booleanProperty;

    /*
     * The string property.
     */
    @Generated
    private final String string;

    /*
     * The bytes property.
     */
    @Generated
    private final byte[] bytes;

    /*
     * The aggregation function to be applied on the client metric. Allowed functions
     * - ‘percentage’ - for error metric , ‘avg’, ‘p50’, ‘p90’, ‘p95’, ‘p99’, ‘min’,
     * ‘max’ - for response_time_ms and latency metric, ‘avg’ - for requests_per_sec,
     * ‘count’ - for requests
     */
    @Generated
    private String aggregate;

    /**
     * customized property
     */
    private String testProperty;

    /**
     * Creates an instance of PartialUpdateModel class.
     *
     * @param booleanProperty the booleanProperty value to set.
     * @param string the string value to set.
     * @param bytes the bytes value to set.
     */
    @Generated
    private PartialUpdateModel(boolean booleanProperty, String string, byte[] bytes) {
        this.booleanProperty = booleanProperty;
        this.string = string;
        this.bytes = bytes;
    }

    /**
     * Get the booleanProperty property: The boolean property.
     *
     * @return the booleanProperty value.
     */
    @Generated
    public boolean isBooleanProperty() {
        return this.booleanProperty;
    }

    /**
     * Get the string property: The string property.
     *
     * @return the string value.
     */
    @Generated
    public String getString() {
        return this.string;
    }

    /**
     * Get the bytes property: The bytes property.
     *
     * @return the bytes value.
     */
    @Generated
    public byte[] getBytes() {
        return CoreUtils.clone(this.bytes);
    }

    /**
     * Get the aggregate property: The aggregation function to be applied on the client metric. Allowed functions
     * - ‘percentage’ - for error metric , ‘avg’, ‘p50’, ‘p90’, ‘p95’, ‘p99’, ‘min’,
     * ‘max’ - for response_time_ms and latency metric, ‘avg’ - for requests_per_sec,
     * ‘count’ - for requests.
     *
     * @return the aggregate value.
     */
    @Generated
    public String getAggregate() {
        return this.aggregate;
    }

    public void setAggregate(String aggregate) {
        this.aggregate = aggregate;
    }

    public String getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("boolean", this.booleanProperty);
        jsonWriter.writeStringField("string", this.string);
        jsonWriter.writeBinaryField("bytes", this.bytes);
        jsonWriter.writeStringField("aggregate", this.aggregate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PartialUpdateModel from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PartialUpdateModel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PartialUpdateModel.
     */
    public static PartialUpdateModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean booleanProperty = false;
            String string = null;
            byte[] bytes = null;
            String aggregate = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("boolean".equals(fieldName)) {
                    booleanProperty = reader.getBoolean();
                } else if ("string".equals(fieldName)) {
                    string = reader.getString();
                } else if ("bytes".equals(fieldName)) {
                    bytes = reader.getBinary();
                } else if ("aggregate".equals(fieldName)) {
                    aggregate = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            PartialUpdateModel deserializedPartialUpdateModel = new PartialUpdateModel(booleanProperty, string, bytes);
            deserializedPartialUpdateModel.aggregate = aggregate;
            return deserializedPartialUpdateModel;
        });
    }
}
