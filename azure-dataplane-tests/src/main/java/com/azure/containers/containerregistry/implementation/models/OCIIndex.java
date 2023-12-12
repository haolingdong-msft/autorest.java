// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.OciAnnotations;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Returns the requested OCI index file.
 */
@Fluent
public final class OCIIndex extends Manifest {
    /*
     * List of OCI image layer information
     */
    private List<ManifestListAttributes> manifests;

    /*
     * Additional information provided through arbitrary metadata.
     */
    private OciAnnotations annotations;

    /**
     * Creates an instance of OCIIndex class.
     */
    public OCIIndex() {
    }

    /**
     * Get the manifests property: List of OCI image layer information.
     * 
     * @return the manifests value.
     */
    public List<ManifestListAttributes> getManifests() {
        return this.manifests;
    }

    /**
     * Set the manifests property: List of OCI image layer information.
     * 
     * @param manifests the manifests value to set.
     * @return the OCIIndex object itself.
     */
    public OCIIndex setManifests(List<ManifestListAttributes> manifests) {
        this.manifests = manifests;
        return this;
    }

    /**
     * Get the annotations property: Additional information provided through arbitrary metadata.
     * 
     * @return the annotations value.
     */
    public OciAnnotations getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: Additional information provided through arbitrary metadata.
     * 
     * @param annotations the annotations value to set.
     * @return the OCIIndex object itself.
     */
    public OCIIndex setAnnotations(OciAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OCIIndex setSchemaVersion(Integer schemaVersion) {
        super.setSchemaVersion(schemaVersion);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("schemaVersion", getSchemaVersion());
        jsonWriter.writeArrayField("manifests", this.manifests, (writer, element) -> {
            if (element != null) {
                writer.writeJson(element);
            } else {
                writer.writeNull();
            }
        });
        jsonWriter.writeJsonField("annotations", this.annotations);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OCIIndex from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OCIIndex if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the OCIIndex.
     */
    public static OCIIndex fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OCIIndex deserializedOCIIndex = new OCIIndex();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schemaVersion".equals(fieldName)) {
                    deserializedOCIIndex.setSchemaVersion(reader.getNullable(JsonReader::getInt));
                } else if ("manifests".equals(fieldName)) {
                    List<ManifestListAttributes> manifests
                        = reader.readArray(reader1 -> ManifestListAttributes.fromJson(reader1));
                    deserializedOCIIndex.manifests = manifests;
                } else if ("annotations".equals(fieldName)) {
                    deserializedOCIIndex.annotations = OciAnnotations.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOCIIndex;
        });
    }
}
