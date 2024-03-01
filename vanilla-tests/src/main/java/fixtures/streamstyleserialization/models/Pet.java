// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Pet model.
 */
@Fluent
public class Pet implements JsonSerializable<Pet> {
    /*
     * The id property.
     */
    private Integer id;

    /*
     * The name property.
     */
    private String name;

    /**
     * Creates an instance of Pet class.
     */
    public Pet() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     * 
     * @param id the id value to set.
     * @return the Pet object itself.
     */
    public Pet setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the Pet object itself.
     */
    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Pet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Pet if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the Pet.
     */
    public static Pet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Pet deserializedPet = new Pet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPet.id = reader.getNullable(JsonReader::getInt);
                } else if ("name".equals(fieldName)) {
                    deserializedPet.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPet;
        });
    }
}
