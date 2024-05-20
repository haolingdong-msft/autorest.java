// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ManifestListAttributes model.
 */
@Fluent
public final class ManifestListAttributes implements JsonSerializable<ManifestListAttributes> {
    /*
     * The MIME type of the referenced object. This will generally be application/vnd.docker.image.manifest.v2+json, but
     * it could also be application/vnd.docker.image.manifest.v1+json
     */
    private String mediaType;

    /*
     * The size in bytes of the object
     */
    private Long size;

    /*
     * The digest of the content, as defined by the Registry V2 HTTP API Specification
     */
    private String digest;

    /*
     * The platform object describes the platform which the image in the manifest runs on. A full list of valid
     * operating system and architecture values are listed in the Go language documentation for $GOOS and $GOARCH
     */
    private Platform platform;

    /**
     * Creates an instance of ManifestListAttributes class.
     */
    public ManifestListAttributes() {
    }

    /**
     * Get the mediaType property: The MIME type of the referenced object. This will generally be
     * application/vnd.docker.image.manifest.v2+json, but it could also be
     * application/vnd.docker.image.manifest.v1+json.
     * 
     * @return the mediaType value.
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType property: The MIME type of the referenced object. This will generally be
     * application/vnd.docker.image.manifest.v2+json, but it could also be
     * application/vnd.docker.image.manifest.v1+json.
     * 
     * @param mediaType the mediaType value to set.
     * @return the ManifestListAttributes object itself.
     */
    public ManifestListAttributes setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the size property: The size in bytes of the object.
     * 
     * @return the size value.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Set the size property: The size in bytes of the object.
     * 
     * @param size the size value to set.
     * @return the ManifestListAttributes object itself.
     */
    public ManifestListAttributes setSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the digest property: The digest of the content, as defined by the Registry V2 HTTP API Specification.
     * 
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: The digest of the content, as defined by the Registry V2 HTTP API Specification.
     * 
     * @param digest the digest value to set.
     * @return the ManifestListAttributes object itself.
     */
    public ManifestListAttributes setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the platform property: The platform object describes the platform which the image in the manifest runs on. A
     * full list of valid operating system and architecture values are listed in the Go language documentation for $GOOS
     * and $GOARCH.
     * 
     * @return the platform value.
     */
    public Platform getPlatform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform object describes the platform which the image in the manifest runs on. A
     * full list of valid operating system and architecture values are listed in the Go language documentation for $GOOS
     * and $GOARCH.
     * 
     * @param platform the platform value to set.
     * @return the ManifestListAttributes object itself.
     */
    public ManifestListAttributes setPlatform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("mediaType", this.mediaType);
        jsonWriter.writeNumberField("size", this.size);
        jsonWriter.writeStringField("digest", this.digest);
        jsonWriter.writeJsonField("platform", this.platform);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManifestListAttributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManifestListAttributes if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManifestListAttributes.
     */
    public static ManifestListAttributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManifestListAttributes deserializedManifestListAttributes = new ManifestListAttributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("mediaType".equals(fieldName)) {
                    deserializedManifestListAttributes.mediaType = reader.getString();
                } else if ("size".equals(fieldName)) {
                    deserializedManifestListAttributes.size = reader.getNullable(JsonReader::getLong);
                } else if ("digest".equals(fieldName)) {
                    deserializedManifestListAttributes.digest = reader.getString();
                } else if ("platform".equals(fieldName)) {
                    deserializedManifestListAttributes.platform = Platform.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManifestListAttributes;
        });
    }
}
