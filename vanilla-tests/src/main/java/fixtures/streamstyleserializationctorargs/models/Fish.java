// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationctorargs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The Fish model.
 */
@Fluent
public class Fish implements JsonSerializable<Fish> {
    /*
     * The species property.
     */
    private String species;

    /*
     * The length property.
     */
    private final float length;

    /*
     * The siblings property.
     */
    private List<Fish> siblings;

    /**
     * Creates an instance of Fish class.
     * 
     * @param length the length value to set.
     */
    public Fish(float length) {
        this.length = length;
    }

    /**
     * Get the species property: The species property.
     * 
     * @return the species value.
     */
    public String getSpecies() {
        return this.species;
    }

    /**
     * Set the species property: The species property.
     * 
     * @param species the species value to set.
     * @return the Fish object itself.
     */
    public Fish setSpecies(String species) {
        this.species = species;
        return this;
    }

    /**
     * Get the length property: The length property.
     * 
     * @return the length value.
     */
    public float getLength() {
        return this.length;
    }

    /**
     * Get the siblings property: The siblings property.
     * 
     * @return the siblings value.
     */
    public List<Fish> getSiblings() {
        return this.siblings;
    }

    /**
     * Set the siblings property: The siblings property.
     * 
     * @param siblings the siblings value to set.
     * @return the Fish object itself.
     */
    public Fish setSiblings(List<Fish> siblings) {
        this.siblings = siblings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSiblings() != null) {
            getSiblings().forEach(e -> e.validate());
        }
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeFloatField("length", this.length);
        jsonWriter.writeStringField("species", this.species);
        jsonWriter.writeArrayField("siblings", this.siblings, (writer, element) -> {
            if (element != null) {
                writer.writeJson(element);
            } else {
                writer.writeNull();
            }
        });
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Fish from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Fish if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the Fish.
     */
    public static Fish fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("fishtype".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("salmon".equals(discriminatorValue)) {
                return Salmon.fromJsonKnownDiscriminator(readerToUse.reset());
            } else if ("smart_salmon".equals(discriminatorValue)) {
                return SmartSalmon.fromJson(readerToUse.reset());
            } else if ("shark".equals(discriminatorValue)) {
                return Shark.fromJsonKnownDiscriminator(readerToUse.reset());
            } else if ("sawshark".equals(discriminatorValue)) {
                return Sawshark.fromJson(readerToUse.reset());
            } else if ("goblin".equals(discriminatorValue)) {
                return Goblinshark.fromJson(readerToUse.reset());
            } else if ("cookiecuttershark".equals(discriminatorValue)) {
                return Cookiecuttershark.fromJson(readerToUse.reset());
            } else {
                return fromJsonKnownDiscriminator(readerToUse.reset());
            }
        });
    }

    static Fish fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean lengthFound = false;
            float length = 0.0f;
            String species = null;
            List<Fish> siblings = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("length".equals(fieldName)) {
                    length = reader.getFloat();
                    lengthFound = true;
                } else if ("species".equals(fieldName)) {
                    species = reader.getString();
                } else if ("siblings".equals(fieldName)) {
                    siblings = reader.readArray(reader1 -> Fish.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            if (lengthFound) {
                Fish deserializedFish = new Fish(length);
                deserializedFish.species = species;
                deserializedFish.siblings = siblings;

                return deserializedFish;
            }
            throw new IllegalStateException("Missing required property: length");
        });
    }
}
