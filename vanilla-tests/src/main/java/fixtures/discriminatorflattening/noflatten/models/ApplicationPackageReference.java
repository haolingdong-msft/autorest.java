// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.discriminatorflattening.noflatten.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Link to an application package inside the batch account.
 */
@Fluent
public final class ApplicationPackageReference implements JsonSerializable<ApplicationPackageReference> {
    /*
     * The ID of the application package to install. This must be inside the same batch account as the pool. This can
     * either be a reference to a specific version or the default version if one exists.
     */
    private String id;

    /*
     * If this is omitted, and no default version is specified for this application, the request fails with the error
     * code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
     */
    private String version;

    /**
     * Creates an instance of ApplicationPackageReference class.
     */
    public ApplicationPackageReference() {
    }

    /**
     * Get the id property: The ID of the application package to install. This must be inside the same batch account as
     * the pool. This can either be a reference to a specific version or the default version if one exists.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the application package to install. This must be inside the same batch account as
     * the pool. This can either be a reference to a specific version or the default version if one exists.
     * 
     * @param id the id value to set.
     * @return the ApplicationPackageReference object itself.
     */
    public ApplicationPackageReference setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the version property: If this is omitted, and no default version is specified for this application, the
     * request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly,
     * the HTTP status code is 409.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: If this is omitted, and no default version is specified for this application, the
     * request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly,
     * the HTTP status code is 409.
     * 
     * @param version the version value to set.
     * @return the ApplicationPackageReference object itself.
     */
    public ApplicationPackageReference setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getId() == null) {
            throw new IllegalArgumentException("Missing required property id in model ApplicationPackageReference");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationPackageReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationPackageReference if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationPackageReference.
     */
    public static ApplicationPackageReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationPackageReference deserializedApplicationPackageReference = new ApplicationPackageReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationPackageReference.id = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedApplicationPackageReference.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationPackageReference;
        });
    }
}
