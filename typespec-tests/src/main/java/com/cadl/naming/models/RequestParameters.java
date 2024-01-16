// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.naming.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * <!-- start generated doc -->
 * The RequestParameters model.
 * <!-- end generated doc -->
 */
@Immutable
public final class RequestParameters implements JsonSerializable<RequestParameters> {
    /*
     * The type property.
     */
    @Generated
    private final RequestType type;

    /**
     * Creates an instance of RequestParameters class.
     * 
     * @param type the type value to set.
     */
    @Generated
    public RequestParameters(RequestType type) {
        this.type = type;
    }

    /**
     * Get the type property: The type property.
     * 
     * @return the type value.
     */
    @Generated
    public RequestType getType() {
        return this.type;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RequestParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RequestParameters if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RequestParameters.
     */
    public static RequestParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RequestType type = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    type = RequestType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new RequestParameters(type);
        });
    }
}
