// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.nesteddiscriminator.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The second level model in polymorphic multiple levels inheritance which contains references to other polymorphic
 * instances.
 */
@Fluent
public final class Salmon extends Fish {
    /*
     * The friends property.
     */
    @Generated
    private List<Fish> friends;

    /*
     * The hate property.
     */
    @Generated
    private Map<String, Fish> hate;

    /*
     * The partner property.
     */
    @Generated
    private Fish partner;

    /**
     * Creates an instance of Salmon class.
     * 
     * @param age the age value to set.
     */
    @Generated
    public Salmon(int age) {
        super(age);
    }

    /**
     * Get the friends property: The friends property.
     * 
     * @return the friends value.
     */
    @Generated
    public List<Fish> getFriends() {
        return this.friends;
    }

    /**
     * Set the friends property: The friends property.
     * 
     * @param friends the friends value to set.
     * @return the Salmon object itself.
     */
    @Generated
    public Salmon setFriends(List<Fish> friends) {
        this.friends = friends;
        return this;
    }

    /**
     * Get the hate property: The hate property.
     * 
     * @return the hate value.
     */
    @Generated
    public Map<String, Fish> getHate() {
        return this.hate;
    }

    /**
     * Set the hate property: The hate property.
     * 
     * @param hate the hate value to set.
     * @return the Salmon object itself.
     */
    @Generated
    public Salmon setHate(Map<String, Fish> hate) {
        this.hate = hate;
        return this;
    }

    /**
     * Get the partner property: The partner property.
     * 
     * @return the partner value.
     */
    @Generated
    public Fish getPartner() {
        return this.partner;
    }

    /**
     * Set the partner property: The partner property.
     * 
     * @param partner the partner value to set.
     * @return the Salmon object itself.
     */
    @Generated
    public Salmon setPartner(Fish partner) {
        this.partner = partner;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", "salmon");
        jsonWriter.writeIntField("age", getAge());
        jsonWriter.writeArrayField("friends", this.friends, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeMapField("hate", this.hate, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("partner", this.partner);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Salmon from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Salmon if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the Salmon.
     */
    public static Salmon fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean ageFound = false;
            int age = 0;
            List<Fish> friends = null;
            Map<String, Fish> hate = null;
            Fish partner = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"salmon".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'salmon'. The found 'kind' was '" + kind
                                + "'.");
                    }
                } else if ("age".equals(fieldName)) {
                    age = reader.getInt();
                    ageFound = true;
                } else if ("friends".equals(fieldName)) {
                    friends = reader.readArray(reader1 -> Fish.fromJson(reader1));
                } else if ("hate".equals(fieldName)) {
                    hate = reader.readMap(reader1 -> Fish.fromJson(reader1));
                } else if ("partner".equals(fieldName)) {
                    partner = Fish.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (ageFound) {
                Salmon deserializedSalmon = new Salmon(age);
                deserializedSalmon.friends = friends;
                deserializedSalmon.hate = hate;
                deserializedSalmon.partner = partner;

                return deserializedSalmon;
            }
            throw new IllegalStateException("Missing required property: age");
        });
    }
}
