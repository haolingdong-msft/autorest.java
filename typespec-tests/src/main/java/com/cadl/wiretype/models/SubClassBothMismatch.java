// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.wiretype.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.Base64Url;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * <!-- start generated doc -->
 * The SubClassBothMismatch model.
 * <!-- end generated doc -->
 */
@Immutable
public final class SubClassBothMismatch extends SuperClassMismatch {
    /*
     * The base64url property.
     */
    @Generated
    private final Base64Url base64url;

    /**
     * Creates an instance of SubClassBothMismatch class.
     * 
     * @param dateTimeRfc7231 the dateTimeRfc7231 value to set.
     * @param base64url the base64url value to set.
     */
    @Generated
    public SubClassBothMismatch(OffsetDateTime dateTimeRfc7231, byte[] base64url) {
        super(dateTimeRfc7231);
        this.base64url = Base64Url.encode(base64url);
    }

    /**
     * Get the base64url property: The base64url property.
     * 
     * @return the base64url value.
     */
    @Generated
    public byte[] getBase64url() {
        if (this.base64url == null) {
            return null;
        }
        return this.base64url.decodedBytes();
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getDateTimeRfc7231() != null) {
            jsonWriter.writeStringField("dateTimeRfc7231",
                Objects.toString(new DateTimeRfc1123(getDateTimeRfc7231()), null));
        }
        jsonWriter.writeStringField("base64url", Objects.toString(this.base64url, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubClassBothMismatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubClassBothMismatch if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SubClassBothMismatch.
     */
    public static SubClassBothMismatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime dateTimeRfc7231 = null;
            byte[] base64url = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dateTimeRfc7231".equals(fieldName)) {
                    DateTimeRfc1123 dateTimeRfc7231Holder
                        = reader.getNullable(nonNullReader -> new DateTimeRfc1123(nonNullReader.getString()));
                    if (dateTimeRfc7231Holder != null) {
                        dateTimeRfc7231 = dateTimeRfc7231Holder.getDateTime();
                    }
                } else if ("base64url".equals(fieldName)) {
                    Base64Url base64urlHolder
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                    if (base64urlHolder != null) {
                        base64url = base64urlHolder.decodedBytes();
                    }
                } else {
                    reader.skipChildren();
                }
            }
            return new SubClassBothMismatch(dateTimeRfc7231, base64url);
        });
    }
}
