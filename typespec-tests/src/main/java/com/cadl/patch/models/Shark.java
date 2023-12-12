// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.patch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.cadl.patch.implementation.JsonMergePatchHelper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * The second level model in polymorphic multiple levels inheritance and it defines a new discriminator.
 */
@Fluent
public class Shark extends Fish {
    /*
     * The sharktype property.
     */
    @Generated
    private final String sharktype;

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setSharkAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of Shark class.
     * 
     * @param age the age value to set.
     * @param sharktype the sharktype value to set.
     */
    @Generated
    public Shark(int age, String sharktype) {
        super(age);
        this.sharktype = sharktype;
    }

    /**
     * Get the sharktype property: The sharktype property.
     * 
     * @return the sharktype value.
     */
    @Generated
    public String getSharktype() {
        return this.sharktype;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public Shark setColor(String color) {
        super.setColor(color);
        this.updatedProperties.add("color");
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeIntField("age", getAge());
            jsonWriter.writeStringField("color", getColor());
            jsonWriter.writeStringField("sharktype", this.sharktype);
            return jsonWriter.writeEndObject();
        }
    }

    public JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("age", getAge());
        if (getColor() != null) {
            jsonWriter.writeStringField("color", getColor());
        } else if (updatedProperties.contains("color")) {
            jsonWriter.writeNullField("color");
        }
        if (this.sharktype != null) {
            jsonWriter.writeStringField("sharktype", this.sharktype);
        } else if (updatedProperties.contains("sharktype")) {
            jsonWriter.writeNullField("sharktype");
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Shark from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Shark if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the Shark.
     */
    public static Shark fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("sharktype".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if (discriminatorValue == null || "shark".equals(discriminatorValue)) {
                return fromJsonKnownDiscriminator(readerToUse);
            } else if ("saw".equals(discriminatorValue)) {
                return SawShark.fromJson(readerToUse.reset());
            } else if ("goblin".equals(discriminatorValue)) {
                return GoblinShark.fromJson(readerToUse.reset());
            } else {
                return fromJsonKnownDiscriminator(readerToUse.reset());
            }
        });
    }

    static Shark fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            String name = null;
            int age = 0;
            String color = null;
            String sharktype = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sharktype".equals(fieldName)) {
                    sharktype = reader.getString();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("age".equals(fieldName)) {
                    age = reader.getInt();
                } else if ("color".equals(fieldName)) {
                    color = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            Shark deserializedShark = new Shark(age, sharktype);
            deserializedShark.setId(id);
            deserializedShark.setName(name);
            deserializedShark.setColor(color);

            return deserializedShark;
        });
    }
}
