// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Extensible enum. Indicates the action type. "Internal" refers to actions that are for internal only APIs.
 */
public enum ActionType {
    /**
     * Enum value Internal.
     */
    INTERNAL("Internal");

    /**
     * The actual serialized value for a ActionType instance.
     */
    private final String value;

    ActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ActionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static ActionType fromString(String value) {
        if (value == null) {
            return null;
        }
        ActionType[] items = ActionType.values();
        for (ActionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
