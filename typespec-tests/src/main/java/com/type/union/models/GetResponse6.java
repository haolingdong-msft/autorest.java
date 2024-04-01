// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The GetResponse6 model.
 */
@Immutable
public final class GetResponse6 implements JsonSerializable<GetResponse6> {
    /*
     * The prop property.
     */
    @Generated
    private final GetResponseProp4 prop;

    /**
     * Creates an instance of GetResponse6 class.
     * 
     * @param prop the prop value to set.
     */
    @Generated
    private GetResponse6(GetResponseProp4 prop) {
        this.prop = prop;
    }

    /**
     * Get the prop property: The prop property.
     * 
     * @return the prop value.
     */
    @Generated
    public GetResponseProp4 getProp() {
        return this.prop;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("prop", this.prop == null ? null : this.prop.toLong());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetResponse6 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetResponse6 if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetResponse6.
     */
    @Generated
    public static GetResponse6 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetResponseProp4 prop = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prop".equals(fieldName)) {
                    prop = GetResponseProp4.fromLong(reader.getLong());
                } else {
                    reader.skipChildren();
                }
            }
            return new GetResponse6(prop);
        });
    }
}
