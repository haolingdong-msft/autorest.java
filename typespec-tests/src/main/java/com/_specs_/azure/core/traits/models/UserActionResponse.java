// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.core.traits.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * User action response.
 */
@Immutable
public final class UserActionResponse implements JsonSerializable<UserActionResponse> {
    /*
     * User action result.
     */
    @Generated
    private final String userActionResult;

    /**
     * Creates an instance of UserActionResponse class.
     * 
     * @param userActionResult the userActionResult value to set.
     */
    @Generated
    private UserActionResponse(String userActionResult) {
        this.userActionResult = userActionResult;
    }

    /**
     * Get the userActionResult property: User action result.
     * 
     * @return the userActionResult value.
     */
    @Generated
    public String getUserActionResult() {
        return this.userActionResult;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("userActionResult", this.userActionResult);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserActionResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserActionResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UserActionResponse.
     */
    public static UserActionResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean userActionResultFound = false;
            String userActionResult = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userActionResult".equals(fieldName)) {
                    userActionResult = reader.getString();
                    userActionResultFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (userActionResultFound) {
                return new UserActionResponse(userActionResult);
            }
            throw new IllegalStateException("Missing required property: userActionResult");
        });
    }
}
