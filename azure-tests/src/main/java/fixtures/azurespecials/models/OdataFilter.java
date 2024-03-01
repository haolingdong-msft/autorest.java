// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.azurespecials.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The OdataFilter model.
 */
@Fluent
public final class OdataFilter implements JsonSerializable<OdataFilter> {
    /*
     * The id property.
     */
    private Integer id;

    /*
     * The name property.
     */
    private String name;

    /**
     * Creates an instance of OdataFilter class.
     */
    public OdataFilter() {
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
     * @return the OdataFilter object itself.
     */
    public OdataFilter setId(Integer id) {
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
     * @return the OdataFilter object itself.
     */
    public OdataFilter setName(String name) {
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
     * Reads an instance of OdataFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OdataFilter if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OdataFilter.
     */
    public static OdataFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OdataFilter deserializedOdataFilter = new OdataFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOdataFilter.id = reader.getNullable(JsonReader::getInt);
                } else if ("name".equals(fieldName)) {
                    deserializedOdataFilter.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOdataFilter;
        });
    }
}
