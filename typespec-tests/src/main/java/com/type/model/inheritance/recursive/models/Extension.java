// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.recursive.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * extension.
 */
@Fluent
public final class Extension extends Element {
    /*
     * The level property.
     */
    @Generated
    private final int level;

    /**
     * Creates an instance of Extension class.
     * 
     * @param level the level value to set.
     */
    @Generated
    public Extension(int level) {
        this.level = level;
    }

    /**
     * Get the level property: The level property.
     * 
     * @return the level value.
     */
    @Generated
    public int getLevel() {
        return this.level;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public Extension setExtension(List<Extension> extension) {
        super.setExtension(extension);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("extension", getExtension(), (writer, element) -> {
            if (element != null) {
                writer.writeJson(element);
            } else {
                writer.writeNull();
            }
        });
        jsonWriter.writeIntField("level", this.level);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Extension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Extension if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Extension.
     */
    public static Extension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<Extension> extension = null;
            int level = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("extension".equals(fieldName)) {
                    extension = reader.readArray(reader1 -> Extension.fromJson(reader1));
                } else if ("level".equals(fieldName)) {
                    level = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            Extension deserializedExtension = new Extension(level);
            deserializedExtension.setExtension(extension);

            return deserializedExtension;
        });
    }
}
