// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.basic.models;

import com._specs_.azure.core.basic.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Details about a user.
 */
@Fluent
public final class User implements JsonSerializable<User> {
    /*
     * The user's id.
     */
    @Generated
    private int id;

    /*
     * The user's name.
     */
    @Generated
    private String name;

    /*
     * The user's order list
     */
    @Generated
    private List<UserOrder> orders;

    /*
     * The entity tag for this resource.
     */
    @Generated
    private String etag;

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
        JsonMergePatchHelper.setUserAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of User class.
     */
    @Generated
    public User() {
    }

    /**
     * Get the id property: The user's id.
     * 
     * @return the id value.
     */
    @Generated
    public int getId() {
        return this.id;
    }

    /**
     * Get the name property: The user's name.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The user's name.
     * <p>Required when create the resource.</p>
     * 
     * @param name the name value to set.
     * @return the User object itself.
     */
    @Generated
    public User setName(String name) {
        this.name = name;
        this.updatedProperties.add("name");
        return this;
    }

    /**
     * Get the orders property: The user's order list.
     * 
     * @return the orders value.
     */
    @Generated
    public List<UserOrder> getOrders() {
        return this.orders;
    }

    /**
     * Set the orders property: The user's order list.
     * 
     * @param orders the orders value to set.
     * @return the User object itself.
     */
    @Generated
    public User setOrders(List<UserOrder> orders) {
        this.orders = orders;
        this.updatedProperties.add("orders");
        return this;
    }

    /**
     * Get the etag property: The entity tag for this resource.
     * 
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
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
            jsonWriter.writeStringField("name", this.name);
            jsonWriter.writeArrayField("orders", this.orders, (writer, element) -> writer.writeJson(element));
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("name")) {
            if (this.name == null) {
                jsonWriter.writeNullField("name");
            } else {
                jsonWriter.writeStringField("name", this.name);
            }
        }
        if (updatedProperties.contains("orders")) {
            if (this.orders == null) {
                jsonWriter.writeNullField("orders");
            } else {
                jsonWriter.writeArrayField("orders", this.orders, (writer, element) -> writer.writeJson(element));
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of User from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of User if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the User.
     */
    @Generated
    public static User fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int id = 0;
            String etag = null;
            String name = null;
            List<UserOrder> orders = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getInt();
                } else if ("etag".equals(fieldName)) {
                    etag = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("orders".equals(fieldName)) {
                    orders = reader.readArray(reader1 -> UserOrder.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            User deserializedUser = new User();
            deserializedUser.id = id;
            deserializedUser.etag = etag;
            deserializedUser.name = name;
            deserializedUser.orders = orders;

            return deserializedUser;
        });
    }
}
