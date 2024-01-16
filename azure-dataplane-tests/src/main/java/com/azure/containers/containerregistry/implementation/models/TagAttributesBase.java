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
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <!-- start generated doc -->
 * Tag attribute details.
 * <!-- end generated doc -->
 */
@Fluent
public class TagAttributesBase implements JsonSerializable<TagAttributesBase> {
    /*
     * Tag name
     */
    private String name;

    /*
     * Tag digest
     */
    private String digest;

    /*
     * Tag created time
     */
    private OffsetDateTime createdOn;

    /*
     * Tag last update time
     */
    private OffsetDateTime lastUpdatedOn;

    /*
     * Delete enabled
     */
    private Boolean deleteEnabled;

    /*
     * Write enabled
     */
    private Boolean writeEnabled;

    /*
     * List enabled
     */
    private Boolean listEnabled;

    /*
     * Read enabled
     */
    private Boolean readEnabled;

    /**
     * Creates an instance of TagAttributesBase class.
     */
    public TagAttributesBase() {
    }

    /**
     * Get the name property: Tag name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Tag name.
     * 
     * @param name the name value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the digest property: Tag digest.
     * 
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: Tag digest.
     * 
     * @param digest the digest value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the createdOn property: Tag created time.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: Tag created time.
     * 
     * @param createdOn the createdOn value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the lastUpdatedOn property: Tag last update time.
     * 
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Set the lastUpdatedOn property: Tag last update time.
     * 
     * @param lastUpdatedOn the lastUpdatedOn value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setLastUpdatedOn(OffsetDateTime lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
        return this;
    }

    /**
     * Get the deleteEnabled property: Delete enabled.
     * 
     * @return the deleteEnabled value.
     */
    public Boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    /**
     * Set the deleteEnabled property: Delete enabled.
     * 
     * @param deleteEnabled the deleteEnabled value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setDeleteEnabled(Boolean deleteEnabled) {
        this.deleteEnabled = deleteEnabled;
        return this;
    }

    /**
     * Get the writeEnabled property: Write enabled.
     * 
     * @return the writeEnabled value.
     */
    public Boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    /**
     * Set the writeEnabled property: Write enabled.
     * 
     * @param writeEnabled the writeEnabled value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
        return this;
    }

    /**
     * Get the listEnabled property: List enabled.
     * 
     * @return the listEnabled value.
     */
    public Boolean isListEnabled() {
        return this.listEnabled;
    }

    /**
     * Set the listEnabled property: List enabled.
     * 
     * @param listEnabled the listEnabled value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setListEnabled(Boolean listEnabled) {
        this.listEnabled = listEnabled;
        return this;
    }

    /**
     * Get the readEnabled property: Read enabled.
     * 
     * @return the readEnabled value.
     */
    public Boolean isReadEnabled() {
        return this.readEnabled;
    }

    /**
     * Set the readEnabled property: Read enabled.
     * 
     * @param readEnabled the readEnabled value to set.
     * @return the TagAttributesBase object itself.
     */
    public TagAttributesBase setReadEnabled(Boolean readEnabled) {
        this.readEnabled = readEnabled;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("digest", this.digest);
        jsonWriter.writeStringField("createdTime",
            this.createdOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdOn));
        jsonWriter.writeStringField("lastUpdateTime",
            this.lastUpdatedOn == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdatedOn));
        if (deleteEnabled != null || writeEnabled != null || listEnabled != null || readEnabled != null) {
            jsonWriter.writeStartObject("changeableAttributes");
            jsonWriter.writeBooleanField("deleteEnabled", this.deleteEnabled);
            jsonWriter.writeBooleanField("writeEnabled", this.writeEnabled);
            jsonWriter.writeBooleanField("listEnabled", this.listEnabled);
            jsonWriter.writeBooleanField("readEnabled", this.readEnabled);
            jsonWriter.writeEndObject();
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagAttributesBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagAttributesBase if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TagAttributesBase.
     */
    public static TagAttributesBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagAttributesBase deserializedTagAttributesBase = new TagAttributesBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedTagAttributesBase.name = reader.getString();
                } else if ("digest".equals(fieldName)) {
                    deserializedTagAttributesBase.digest = reader.getString();
                } else if ("createdTime".equals(fieldName)) {
                    deserializedTagAttributesBase.createdOn
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("lastUpdateTime".equals(fieldName)) {
                    deserializedTagAttributesBase.lastUpdatedOn
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("changeableAttributes".equals(fieldName)
                    && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("deleteEnabled".equals(fieldName)) {
                            deserializedTagAttributesBase.deleteEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else if ("writeEnabled".equals(fieldName)) {
                            deserializedTagAttributesBase.writeEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else if ("listEnabled".equals(fieldName)) {
                            deserializedTagAttributesBase.listEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else if ("readEnabled".equals(fieldName)) {
                            deserializedTagAttributesBase.readEnabled = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagAttributesBase;
        });
    }
}
