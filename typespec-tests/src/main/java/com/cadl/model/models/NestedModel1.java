// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.model.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * <!-- start generated doc -->
 * The NestedModel1 model.
 * <!-- end generated doc -->
 */
@Immutable
public final class NestedModel1 implements JsonSerializable<NestedModel1> {
    /*
     * The nested2 property.
     */
    @Generated
    private final NestedModel2 nested2;

    /**
     * Creates an instance of NestedModel1 class.
     * 
     * @param nested2 the nested2 value to set.
     */
    @Generated
    public NestedModel1(NestedModel2 nested2) {
        this.nested2 = nested2;
    }

    /**
     * Get the nested2 property: The nested2 property.
     * 
     * @return the nested2 value.
     */
    @Generated
    public NestedModel2 getNested2() {
        return this.nested2;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("nested2", this.nested2);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NestedModel1 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NestedModel1 if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NestedModel1.
     */
    public static NestedModel1 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NestedModel2 nested2 = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nested2".equals(fieldName)) {
                    nested2 = NestedModel2.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new NestedModel1(nested2);
        });
    }
}
