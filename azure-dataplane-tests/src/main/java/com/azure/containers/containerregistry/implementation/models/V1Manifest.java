// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Returns the requested V1 manifest file.
 */
@Fluent
public final class V1Manifest extends Manifest {
    /*
     * CPU architecture
     */
    private String architecture;

    /*
     * Image name
     */
    private String name;

    /*
     * Image tag
     */
    private String tag;

    /*
     * List of layer information
     */
    private List<FsLayer> fsLayers;

    /*
     * Image history
     */
    private List<History> history;

    /*
     * Image signature
     */
    private List<ImageSignature> signatures;

    /**
     * Creates an instance of V1Manifest class.
     */
    public V1Manifest() {
    }

    /**
     * Get the architecture property: CPU architecture.
     * 
     * @return the architecture value.
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * Set the architecture property: CPU architecture.
     * 
     * @param architecture the architecture value to set.
     * @return the V1Manifest object itself.
     */
    public V1Manifest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get the name property: Image name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Image name.
     * 
     * @param name the name value to set.
     * @return the V1Manifest object itself.
     */
    public V1Manifest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tag property: Image tag.
     * 
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: Image tag.
     * 
     * @param tag the tag value to set.
     * @return the V1Manifest object itself.
     */
    public V1Manifest setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the fsLayers property: List of layer information.
     * 
     * @return the fsLayers value.
     */
    public List<FsLayer> getFsLayers() {
        return this.fsLayers;
    }

    /**
     * Set the fsLayers property: List of layer information.
     * 
     * @param fsLayers the fsLayers value to set.
     * @return the V1Manifest object itself.
     */
    public V1Manifest setFsLayers(List<FsLayer> fsLayers) {
        this.fsLayers = fsLayers;
        return this;
    }

    /**
     * Get the history property: Image history.
     * 
     * @return the history value.
     */
    public List<History> getHistory() {
        return this.history;
    }

    /**
     * Set the history property: Image history.
     * 
     * @param history the history value to set.
     * @return the V1Manifest object itself.
     */
    public V1Manifest setHistory(List<History> history) {
        this.history = history;
        return this;
    }

    /**
     * Get the signatures property: Image signature.
     * 
     * @return the signatures value.
     */
    public List<ImageSignature> getSignatures() {
        return this.signatures;
    }

    /**
     * Set the signatures property: Image signature.
     * 
     * @param signatures the signatures value to set.
     * @return the V1Manifest object itself.
     */
    public V1Manifest setSignatures(List<ImageSignature> signatures) {
        this.signatures = signatures;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public V1Manifest setSchemaVersion(Integer schemaVersion) {
        super.setSchemaVersion(schemaVersion);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("schemaVersion", getSchemaVersion());
        jsonWriter.writeStringField("architecture", this.architecture);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("tag", this.tag);
        jsonWriter.writeArrayField("fsLayers", this.fsLayers, (writer, element) -> {
            if (element != null) {
                writer.writeJson(element);
            } else {
                writer.writeNull();
            }
        });
        jsonWriter.writeArrayField("history", this.history, (writer, element) -> {
            if (element != null) {
                writer.writeJson(element);
            } else {
                writer.writeNull();
            }
        });
        jsonWriter.writeArrayField("signatures", this.signatures, (writer, element) -> {
            if (element != null) {
                writer.writeJson(element);
            } else {
                writer.writeNull();
            }
        });
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of V1Manifest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of V1Manifest if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the V1Manifest.
     */
    public static V1Manifest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            V1Manifest deserializedV1Manifest = new V1Manifest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schemaVersion".equals(fieldName)) {
                    deserializedV1Manifest.setSchemaVersion(reader.getNullable(JsonReader::getInt));
                } else if ("architecture".equals(fieldName)) {
                    deserializedV1Manifest.architecture = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedV1Manifest.name = reader.getString();
                } else if ("tag".equals(fieldName)) {
                    deserializedV1Manifest.tag = reader.getString();
                } else if ("fsLayers".equals(fieldName)) {
                    List<FsLayer> fsLayers = reader.readArray(reader1 -> FsLayer.fromJson(reader1));
                    deserializedV1Manifest.fsLayers = fsLayers;
                } else if ("history".equals(fieldName)) {
                    List<History> history = reader.readArray(reader1 -> History.fromJson(reader1));
                    deserializedV1Manifest.history = history;
                } else if ("signatures".equals(fieldName)) {
                    List<ImageSignature> signatures = reader.readArray(reader1 -> ImageSignature.fromJson(reader1));
                    deserializedV1Manifest.signatures = signatures;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedV1Manifest;
        });
    }
}
