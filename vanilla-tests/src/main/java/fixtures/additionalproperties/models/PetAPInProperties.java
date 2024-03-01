// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.additionalproperties.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The PetAPInProperties model.
 */
@Fluent
public final class PetAPInProperties implements JsonSerializable<PetAPInProperties> {
    /*
     * The id property.
     */
    private int id;

    /*
     * The name property.
     */
    private String name;

    /*
     * The status property.
     */
    private Boolean status;

    /*
     * Dictionary of <number>
     */
    private Map<String, Float> additionalProperties;

    /**
     * Creates an instance of PetAPInProperties class.
     */
    public PetAPInProperties() {
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     * 
     * @param id the id value to set.
     * @return the PetAPInProperties object itself.
     */
    public PetAPInProperties setId(int id) {
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
     * @return the PetAPInProperties object itself.
     */
    public PetAPInProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    public Boolean isStatus() {
        return this.status;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;number&gt;.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Float> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;number&gt;.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the PetAPInProperties object itself.
     */
    public PetAPInProperties setAdditionalProperties(Map<String, Float> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeIntField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeMapField("additionalProperties", this.additionalProperties,
            (writer, element) -> writer.writeFloat(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PetAPInProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PetAPInProperties if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PetAPInProperties.
     */
    public static PetAPInProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PetAPInProperties deserializedPetAPInProperties = new PetAPInProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPetAPInProperties.id = reader.getInt();
                } else if ("name".equals(fieldName)) {
                    deserializedPetAPInProperties.name = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedPetAPInProperties.status = reader.getNullable(JsonReader::getBoolean);
                } else if ("additionalProperties".equals(fieldName)) {
                    Map<String, Float> additionalProperties = reader.readMap(reader1 -> reader1.getFloat());
                    deserializedPetAPInProperties.additionalProperties = additionalProperties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPetAPInProperties;
        });
    }
}
