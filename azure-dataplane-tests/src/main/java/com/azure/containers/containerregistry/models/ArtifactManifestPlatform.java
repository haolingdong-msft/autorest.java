// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * <!-- start generated doc -->
 * The artifact's platform, consisting of operating system and architecture.
 * <!-- end generated doc -->
 */
@Immutable
public final class ArtifactManifestPlatform implements JsonSerializable<ArtifactManifestPlatform> {
    /*
     * Manifest digest
     */
    private String digest;

    /*
     * CPU architecture
     */
    private ArtifactArchitecture architecture;

    /*
     * Operating system
     */
    private ArtifactOperatingSystem operatingSystem;

    /**
     * Creates an instance of ArtifactManifestPlatform class.
     */
    public ArtifactManifestPlatform() {
    }

    /**
     * Get the digest property: Manifest digest.
     * 
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Get the architecture property: CPU architecture.
     * 
     * @return the architecture value.
     */
    public ArtifactArchitecture getArchitecture() {
        return this.architecture;
    }

    /**
     * Get the operatingSystem property: Operating system.
     * 
     * @return the operatingSystem value.
     */
    public ArtifactOperatingSystem getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArtifactManifestPlatform from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArtifactManifestPlatform if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ArtifactManifestPlatform.
     */
    public static ArtifactManifestPlatform fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArtifactManifestPlatform deserializedArtifactManifestPlatform = new ArtifactManifestPlatform();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("digest".equals(fieldName)) {
                    deserializedArtifactManifestPlatform.digest = reader.getString();
                } else if ("architecture".equals(fieldName)) {
                    deserializedArtifactManifestPlatform.architecture
                        = ArtifactArchitecture.fromString(reader.getString());
                } else if ("os".equals(fieldName)) {
                    deserializedArtifactManifestPlatform.operatingSystem
                        = ArtifactOperatingSystem.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArtifactManifestPlatform;
        });
    }
}
