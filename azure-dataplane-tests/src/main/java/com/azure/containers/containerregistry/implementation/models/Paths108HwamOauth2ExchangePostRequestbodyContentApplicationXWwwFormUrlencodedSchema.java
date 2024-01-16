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
 * <!-- start generated doc -->
 * The Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema model.
 * <!-- end generated doc -->
 */
@Fluent
public final class Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
    implements JsonSerializable<Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema> {
    /*
     * Can take a value of access_token_refresh_token, or access_token, or refresh_token
     */
    private PostContentSchemaGrantType grantType;

    /*
     * Indicates the name of your Azure container registry.
     */
    private String service;

    /*
     * AAD tenant associated to the AAD credentials.
     */
    private String tenant;

    /*
     * AAD refresh token, mandatory when grant_type is access_token_refresh_token or refresh_token
     */
    private String refreshToken;

    /*
     * AAD access token, mandatory when grant_type is access_token_refresh_token or access_token.
     */
    private String aadAccessToken;

    /**
     * Creates an instance of Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
     * class.
     */
    public Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema() {
    }

    /**
     * Get the grantType property: Can take a value of access_token_refresh_token, or access_token, or refresh_token.
     * 
     * @return the grantType value.
     */
    public PostContentSchemaGrantType getGrantType() {
        return this.grantType;
    }

    /**
     * Set the grantType property: Can take a value of access_token_refresh_token, or access_token, or refresh_token.
     * 
     * @param grantType the grantType value to set.
     * @return the Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
        setGrantType(PostContentSchemaGrantType grantType) {
        this.grantType = grantType;
        return this;
    }

    /**
     * Get the service property: Indicates the name of your Azure container registry.
     * 
     * @return the service value.
     */
    public String getService() {
        return this.service;
    }

    /**
     * Set the service property: Indicates the name of your Azure container registry.
     * 
     * @param service the service value to set.
     * @return the Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
        setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the tenant property: AAD tenant associated to the AAD credentials.
     * 
     * @return the tenant value.
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: AAD tenant associated to the AAD credentials.
     * 
     * @param tenant the tenant value to set.
     * @return the Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
        setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the refreshToken property: AAD refresh token, mandatory when grant_type is access_token_refresh_token or
     * refresh_token.
     * 
     * @return the refreshToken value.
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: AAD refresh token, mandatory when grant_type is access_token_refresh_token or
     * refresh_token.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
        setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the aadAccessToken property: AAD access token, mandatory when grant_type is access_token_refresh_token or
     * access_token.
     * 
     * @return the aadAccessToken value.
     */
    public String getAadAccessToken() {
        return this.aadAccessToken;
    }

    /**
     * Set the aadAccessToken property: AAD access token, mandatory when grant_type is access_token_refresh_token or
     * access_token.
     * 
     * @param aadAccessToken the aadAccessToken value to set.
     * @return the Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema object itself.
     */
    public Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
        setAadAccessToken(String aadAccessToken) {
        this.aadAccessToken = aadAccessToken;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("grant_type", this.grantType == null ? null : this.grantType.toString());
        jsonWriter.writeStringField("service", this.service);
        jsonWriter.writeStringField("tenant", this.tenant);
        jsonWriter.writeStringField("refresh_token", this.refreshToken);
        jsonWriter.writeStringField("access_token", this.aadAccessToken);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema from the
     * JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema if the
     * JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the
     * Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema.
     */
    public static Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
        fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema
                = new Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("grant_type".equals(fieldName)) {
                    deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema.grantType
                        = PostContentSchemaGrantType.fromString(reader.getString());
                } else if ("service".equals(fieldName)) {
                    deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema.service
                        = reader.getString();
                } else if ("tenant".equals(fieldName)) {
                    deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema.tenant
                        = reader.getString();
                } else if ("refresh_token".equals(fieldName)) {
                    deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema.refreshToken
                        = reader.getString();
                } else if ("access_token".equals(fieldName)) {
                    deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema.aadAccessToken
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPaths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema;
        });
    }
}
