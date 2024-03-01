// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Description of the field semantic schema using a JSON Schema style syntax.
 */
@Fluent
public final class DocumentFieldSchema implements JsonSerializable<DocumentFieldSchema> {
    /*
     * Semantic data type of the field value.
     */
    private DocumentFieldType type;

    /*
     * Field description.
     */
    private String description;

    /*
     * Example field content.
     */
    private String example;

    /*
     * Field type schema of each array element.
     */
    private DocumentFieldSchema items;

    /*
     * Named sub-fields of the object field.
     */
    private Map<String, DocumentFieldSchema> properties;

    /**
     * Creates an instance of DocumentFieldSchema class.
     */
    public DocumentFieldSchema() {
    }

    /**
     * Get the type property: Semantic data type of the field value.
     * 
     * @return the type value.
     */
    public DocumentFieldType getType() {
        return this.type;
    }

    /**
     * Set the type property: Semantic data type of the field value.
     * 
     * @param type the type value to set.
     * @return the DocumentFieldSchema object itself.
     */
    public DocumentFieldSchema setType(DocumentFieldType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the description property: Field description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Field description.
     * 
     * @param description the description value to set.
     * @return the DocumentFieldSchema object itself.
     */
    public DocumentFieldSchema setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the example property: Example field content.
     * 
     * @return the example value.
     */
    public String getExample() {
        return this.example;
    }

    /**
     * Set the example property: Example field content.
     * 
     * @param example the example value to set.
     * @return the DocumentFieldSchema object itself.
     */
    public DocumentFieldSchema setExample(String example) {
        this.example = example;
        return this;
    }

    /**
     * Get the items property: Field type schema of each array element.
     * 
     * @return the items value.
     */
    public DocumentFieldSchema getItems() {
        return this.items;
    }

    /**
     * Set the items property: Field type schema of each array element.
     * 
     * @param items the items value to set.
     * @return the DocumentFieldSchema object itself.
     */
    public DocumentFieldSchema setItems(DocumentFieldSchema items) {
        this.items = items;
        return this;
    }

    /**
     * Get the properties property: Named sub-fields of the object field.
     * 
     * @return the properties value.
     */
    public Map<String, DocumentFieldSchema> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Named sub-fields of the object field.
     * 
     * @param properties the properties value to set.
     * @return the DocumentFieldSchema object itself.
     */
    public DocumentFieldSchema setProperties(Map<String, DocumentFieldSchema> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("example", this.example);
        jsonWriter.writeJsonField("items", this.items);
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentFieldSchema from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentFieldSchema if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentFieldSchema.
     */
    public static DocumentFieldSchema fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DocumentFieldSchema deserializedDocumentFieldSchema = new DocumentFieldSchema();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedDocumentFieldSchema.type = DocumentFieldType.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedDocumentFieldSchema.description = reader.getString();
                } else if ("example".equals(fieldName)) {
                    deserializedDocumentFieldSchema.example = reader.getString();
                } else if ("items".equals(fieldName)) {
                    deserializedDocumentFieldSchema.items = DocumentFieldSchema.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    Map<String, DocumentFieldSchema> properties
                        = reader.readMap(reader1 -> DocumentFieldSchema.fromJson(reader1));
                    deserializedDocumentFieldSchema.properties = properties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDocumentFieldSchema;
        });
    }
}
