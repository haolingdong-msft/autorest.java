// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.flatten.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.cadl.flatten.implementation.JsonMergePatchHelper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * The TodoItemPatch model.
 */
@Fluent
public final class TodoItemPatch implements JsonSerializable<TodoItemPatch> {
    /*
     * The item's title
     */
    @Generated
    private String title;

    /*
     * A longer description of the todo item in markdown format
     */
    @Generated
    private String description;

    /*
     * The status of the todo item
     */
    @Generated
    private TodoItemPatchStatus status;

    @Generated
    private boolean jsonMergePatch;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setTodoItemPatchAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of TodoItemPatch class.
     */
    @Generated
    public TodoItemPatch() {
    }

    /**
     * Get the title property: The item's title.
     * 
     * @return the title value.
     */
    @Generated
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The item's title.
     * 
     * @param title the title value to set.
     * @return the TodoItemPatch object itself.
     */
    @Generated
    public TodoItemPatch setTitle(String title) {
        this.title = title;
        this.updatedProperties.add("title");
        return this;
    }

    /**
     * Get the description property: A longer description of the todo item in markdown format.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A longer description of the todo item in markdown format.
     * 
     * @param description the description value to set.
     * @return the TodoItemPatch object itself.
     */
    @Generated
    public TodoItemPatch setDescription(String description) {
        this.description = description;
        this.updatedProperties.add("description");
        return this;
    }

    /**
     * Get the status property: The status of the todo item.
     * 
     * @return the status value.
     */
    @Generated
    public TodoItemPatchStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the todo item.
     * 
     * @param status the status value to set.
     * @return the TodoItemPatch object itself.
     */
    @Generated
    public TodoItemPatch setStatus(TodoItemPatchStatus status) {
        this.status = status;
        this.updatedProperties.add("status");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("title", this.title);
            jsonWriter.writeStringField("description", this.description);
            jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("title")) {
            if (this.title == null) {
                jsonWriter.writeNullField("title");
            } else {
                jsonWriter.writeStringField("title", this.title);
            }
        }
        if (updatedProperties.contains("description")) {
            if (this.description == null) {
                jsonWriter.writeNullField("description");
            } else {
                jsonWriter.writeStringField("description", this.description);
            }
        }
        if (updatedProperties.contains("status")) {
            if (this.status == null) {
                jsonWriter.writeNullField("status");
            } else {
                jsonWriter.writeStringField("status", this.status.toString());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TodoItemPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TodoItemPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TodoItemPatch.
     */
    @Generated
    public static TodoItemPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TodoItemPatch deserializedTodoItemPatch = new TodoItemPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("title".equals(fieldName)) {
                    deserializedTodoItemPatch.title = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedTodoItemPatch.description = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedTodoItemPatch.status = TodoItemPatchStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTodoItemPatch;
        });
    }
}
