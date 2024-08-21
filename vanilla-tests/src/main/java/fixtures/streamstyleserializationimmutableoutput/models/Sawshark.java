// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserializationimmutableoutput.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The Sawshark model.
 */
@Fluent
public final class Sawshark extends Shark {
    /*
     * The picture property.
     */
    private byte[] picture;

    /**
     * Creates an instance of Sawshark class.
     */
    public Sawshark() {
        this.fishtype = "sawshark";
    }

    /**
     * Get the picture property: The picture property.
     * 
     * @return the picture value.
     */
    public byte[] getPicture() {
        return CoreUtils.clone(this.picture);
    }

    /**
     * Set the picture property: The picture property.
     * 
     * @param picture the picture value to set.
     * @return the Sawshark object itself.
     */
    public Sawshark setPicture(byte[] picture) {
        this.picture = CoreUtils.clone(picture);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sawshark setAge(Integer age) {
        super.setAge(age);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sawshark setBirthday(OffsetDateTime birthday) {
        super.setBirthday(birthday);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sawshark setSpecies(String species) {
        super.setSpecies(species);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sawshark setLength(float length) {
        super.setLength(length);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sawshark setSiblings(List<Fish> siblings) {
        super.setSiblings(siblings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (getSiblings() != null) {
            getSiblings().forEach(e -> e.validate());
        }
        if (getBirthday() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property birthday in model Sawshark"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sawshark.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeBinaryField("picture", this.picture);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Sawshark from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Sawshark if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Sawshark.
     */
    public static Sawshark fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Sawshark deserializedSawshark = new Sawshark();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (Shark.fromJsonShared(reader, fieldName, deserializedSawshark)) {
                    continue;
                } else if ("picture".equals(fieldName)) {
                    deserializedSawshark.picture = reader.getBinary();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSawshark;
        });
    }
}
