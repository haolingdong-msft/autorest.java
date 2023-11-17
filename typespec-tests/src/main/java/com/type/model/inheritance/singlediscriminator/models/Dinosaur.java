// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.singlediscriminator.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Define a base class in the legacy way. Discriminator property is not explicitly defined in the model.
 */
@Immutable
public class Dinosaur implements JsonSerializable<Dinosaur> {
    /*
     * The size property.
     */
    @Generated
    private final int size;

    /**
     * Creates an instance of Dinosaur class.
     * 
     * @param size the size value to set.
     */
    @Generated
    protected Dinosaur(int size) {
        this.size = size;
    }

    /**
     * Get the size property: The size property.
     * 
     * @return the size value.
     */
    @Generated
    public int getSize() {
        return this.size;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("size", this.size);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Dinosaur from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Dinosaur if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the Dinosaur.
     */
    public static Dinosaur fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("kind".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("t-rex".equals(discriminatorValue)) {
                return TRex.fromJson(readerToUse.reset());
            } else {
                return fromJsonKnownDiscriminator(readerToUse.reset());
            }
        });
    }

    static Dinosaur fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int size = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"Dinosaur".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'Dinosaur'. The found 'kind' was '" + kind
                                + "'.");
                    }
                } else if ("size".equals(fieldName)) {
                    size = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new Dinosaur(size);
        });
    }
}
