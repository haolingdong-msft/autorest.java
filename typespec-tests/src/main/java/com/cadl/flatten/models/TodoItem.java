// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.flatten.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The TodoItem model.
 */
@Immutable
public final class TodoItem implements JsonSerializable<TodoItem> {
    /*
     * The item's unique id
     */
    @Generated
    private long id;

    /*
     * The item's title
     */
    @Generated
    private final String title;

    /*
     * A longer description of the todo item in markdown format
     */
    @Generated
    private String description;

    /*
     * The status of the todo item
     */
    @Generated
    private final SendLongRequestStatus status;

    /*
     * When the todo item was created.
     */
    @Generated
    private OffsetDateTime createdAt;

    /*
     * When the todo item was last updated
     */
    @Generated
    private OffsetDateTime updatedAt;

    /*
     * When the todo item was makred as completed
     */
    @Generated
    private OffsetDateTime completedAt;

    /*
     * The _dummy property.
     */
    @Generated
    private String dummy;

    /**
     * Creates an instance of TodoItem class.
     * 
     * @param title the title value to set.
     * @param status the status value to set.
     */
    @Generated
    private TodoItem(String title, SendLongRequestStatus status) {
        this.title = title;
        this.status = status;
    }

    /**
     * Get the id property: The item's unique id.
     * 
     * @return the id value.
     */
    @Generated
    public long getId() {
        return this.id;
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
     * Get the description property: A longer description of the todo item in markdown format.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the status property: The status of the todo item.
     * 
     * @return the status value.
     */
    @Generated
    public SendLongRequestStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdAt property: When the todo item was created.
     * 
     * @return the createdAt value.
     */
    @Generated
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: When the todo item was last updated.
     * 
     * @return the updatedAt value.
     */
    @Generated
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the completedAt property: When the todo item was makred as completed.
     * 
     * @return the completedAt value.
     */
    @Generated
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Get the dummy property: The _dummy property.
     * 
     * @return the dummy value.
     */
    @Generated
    public String getDummy() {
        return this.dummy;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("_dummy", this.dummy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TodoItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TodoItem if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TodoItem.
     */
    @Generated
    public static TodoItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            long id = 0L;
            String title = null;
            SendLongRequestStatus status = null;
            OffsetDateTime createdAt = null;
            OffsetDateTime updatedAt = null;
            String description = null;
            OffsetDateTime completedAt = null;
            String dummy = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getLong();
                } else if ("title".equals(fieldName)) {
                    title = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = SendLongRequestStatus.fromString(reader.getString());
                } else if ("createdAt".equals(fieldName)) {
                    createdAt = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("updatedAt".equals(fieldName)) {
                    updatedAt = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("completedAt".equals(fieldName)) {
                    completedAt = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("_dummy".equals(fieldName)) {
                    dummy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            TodoItem deserializedTodoItem = new TodoItem(title, status);
            deserializedTodoItem.id = id;
            deserializedTodoItem.createdAt = createdAt;
            deserializedTodoItem.updatedAt = updatedAt;
            deserializedTodoItem.description = description;
            deserializedTodoItem.completedAt = completedAt;
            deserializedTodoItem.dummy = dummy;

            return deserializedTodoItem;
        });
    }
}
