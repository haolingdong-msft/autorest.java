// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.modelflattening.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The Resource model.
 */
@Fluent
public class Resource implements JsonSerializable<Resource> {
    /*
     * Resource Id
     */
    private String id;

    /*
     * Resource Type
     */
    private String type;

    /*
     * Dictionary of <string>
     */
    private Map<String, String> tags;

    /*
     * Resource Location
     */
    private String location;

    /*
     * Resource Name
     */
    private String name;

    /**
     * Creates an instance of Resource class.
     */
    public Resource() {
    }

    /**
     * Get the id property: Resource Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     * 
     * @param id the id value to set.
     * @return the Resource object itself.
     */
    Resource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Resource Type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Resource Type.
     * 
     * @param type the type value to set.
     * @return the Resource object itself.
     */
    Resource setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tags property: Dictionary of &lt;string&gt;.
     * 
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Dictionary of &lt;string&gt;.
     * 
     * @param tags the tags value to set.
     * @return the Resource object itself.
     */
    public Resource setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     * 
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     * 
     * @param location the location value to set.
     * @return the Resource object itself.
     */
    public Resource setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: Resource Name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Resource Name.
     * 
     * @param name the name value to set.
     * @return the Resource object itself.
     */
    Resource setName(String name) {
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Resource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Resource if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the Resource.
     */
    public static Resource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Resource deserializedResource = new Resource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedResource.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedResource.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedResource.tags = tags;
                } else if ("location".equals(fieldName)) {
                    deserializedResource.location = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedResource.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResource;
        });
    }
}
