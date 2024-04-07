// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.internal.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ResponseInternal model.
 */
@Immutable
public final class ResponseInternal implements JsonSerializable<ResponseInternal> {
    /*
     * The property property.
     */
    @Generated
    private final ResponseInternalInner property;

    /**
     * Creates an instance of ResponseInternal class.
     * 
     * @param property the property value to set.
     */
    @Generated
    private ResponseInternal(ResponseInternalInner property) {
        this.property = property;
    }

    /**
     * Get the property property: The property property.
     * 
     * @return the property value.
     */
    @Generated
    public ResponseInternalInner getProperty() {
        return this.property;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("property", this.property);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResponseInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponseInternal if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResponseInternal.
     */
    @Generated
    public static ResponseInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResponseInternalInner property = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    property = ResponseInternalInner.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ResponseInternal(property);
        });
    }
}
