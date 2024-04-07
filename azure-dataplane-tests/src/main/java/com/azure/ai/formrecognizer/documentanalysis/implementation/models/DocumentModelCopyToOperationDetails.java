// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Get Operation response object.
 */
@Fluent
public final class DocumentModelCopyToOperationDetails extends OperationDetails {
    /*
     * Type of operation.
     */
    private String kind = "documentModelCopyTo";

    /*
     * Operation result upon success.
     */
    private DocumentModelDetails result;

    /**
     * Creates an instance of DocumentModelCopyToOperationDetails class.
     */
    public DocumentModelCopyToOperationDetails() {
    }

    /**
     * Get the kind property: Type of operation.
     * 
     * @return the kind value.
     */
    @Override
    public String getKind() {
        return this.kind;
    }

    /**
     * Get the result property: Operation result upon success.
     * 
     * @return the result value.
     */
    public DocumentModelDetails getResult() {
        return this.result;
    }

    /**
     * Set the result property: Operation result upon success.
     * 
     * @param result the result value to set.
     * @return the DocumentModelCopyToOperationDetails object itself.
     */
    public DocumentModelCopyToOperationDetails setResult(DocumentModelDetails result) {
        this.result = result;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setOperationId(String operationId) {
        super.setOperationId(operationId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setStatus(OperationStatus status) {
        super.setStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setPercentCompleted(Integer percentCompleted) {
        super.setPercentCompleted(percentCompleted);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setCreatedDateTime(OffsetDateTime createdDateTime) {
        super.setCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        super.setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setResourceLocation(String resourceLocation) {
        super.setResourceLocation(resourceLocation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setApiVersion(String apiVersion) {
        super.setApiVersion(apiVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentModelCopyToOperationDetails setError(Error error) {
        super.setError(error);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", getOperationId());
        jsonWriter.writeStringField("status", getStatus() == null ? null : getStatus().toString());
        jsonWriter.writeStringField("createdDateTime",
            getCreatedDateTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getCreatedDateTime()));
        jsonWriter.writeStringField("lastUpdatedDateTime",
            getLastUpdatedDateTime() == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getLastUpdatedDateTime()));
        jsonWriter.writeStringField("resourceLocation", getResourceLocation());
        jsonWriter.writeNumberField("percentCompleted", getPercentCompleted());
        jsonWriter.writeStringField("apiVersion", getApiVersion());
        jsonWriter.writeMapField("tags", getTags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("error", getError());
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeJsonField("result", this.result);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentModelCopyToOperationDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentModelCopyToOperationDetails if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentModelCopyToOperationDetails.
     */
    public static DocumentModelCopyToOperationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DocumentModelCopyToOperationDetails deserializedDocumentModelCopyToOperationDetails
                = new DocumentModelCopyToOperationDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operationId".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.setOperationId(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails
                        .setStatus(OperationStatus.fromString(reader.getString()));
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.setCreatedDateTime(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.setLastUpdatedDateTime(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("resourceLocation".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.setResourceLocation(reader.getString());
                } else if ("percentCompleted".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails
                        .setPercentCompleted(reader.getNullable(JsonReader::getInt));
                } else if ("apiVersion".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.setApiVersion(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDocumentModelCopyToOperationDetails.setTags(tags);
                } else if ("error".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.setError(Error.fromJson(reader));
                } else if ("kind".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.kind = reader.getString();
                } else if ("result".equals(fieldName)) {
                    deserializedDocumentModelCopyToOperationDetails.result = DocumentModelDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDocumentModelCopyToOperationDetails;
        });
    }
}
