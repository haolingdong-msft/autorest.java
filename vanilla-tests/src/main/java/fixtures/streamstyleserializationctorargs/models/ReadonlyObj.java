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

/** The ReadonlyObj model. */
@Fluent
public final class ReadonlyObj implements JsonSerializable<ReadonlyObj> {
    /*
     * The id property.
     */
    private String id;

    /*
     * The size property.
     */
    private Integer size;

    /** Creates an instance of ReadonlyObj class. */
    public ReadonlyObj() {}

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the size property: The size property.
     *
     * @return the size value.
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * Set the size property: The size property.
     *
     * @param size the size value to set.
     * @return the ReadonlyObj object itself.
     */
    public ReadonlyObj setSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeNumberField("size", this.size);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReadonlyObj from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReadonlyObj if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReadonlyObj.
     */
    public static ReadonlyObj fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    ReadonlyObj deserializedReadonlyObj = new ReadonlyObj();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            deserializedReadonlyObj.id = reader.getString();
                        } else if ("size".equals(fieldName)) {
                            deserializedReadonlyObj.size = reader.getNullable(JsonReader::getInt);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedReadonlyObj;
                });
    }
}