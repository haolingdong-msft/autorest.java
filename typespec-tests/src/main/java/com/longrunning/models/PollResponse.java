// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.longrunning.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The PollResponse model.
 */
@Immutable
public final class PollResponse implements JsonSerializable<PollResponse> {
    /*
     * The operationId property.
     */
    @Generated
    private final String operationId;

    /*
     * The status property.
     */
    @Generated
    private final OperationState status;

    /**
     * Creates an instance of PollResponse class.
     * 
     * @param operationId the operationId value to set.
     * @param status the status value to set.
     */
    @Generated
    private PollResponse(String operationId, OperationState status) {
        this.operationId = operationId;
        this.status = status;
    }

    /**
     * Get the operationId property: The operationId property.
     * 
     * @return the operationId value.
     */
    @Generated
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    @Generated
    public OperationState getStatus() {
        return this.status;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", this.operationId);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PollResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PollResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PollResponse.
     */
    public static PollResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String operationId = null;
            OperationState status = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    operationId = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = OperationState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new PollResponse(operationId, status);
        });
    }
}
