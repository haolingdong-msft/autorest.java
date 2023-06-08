// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.cadl.partialupdate.models;

import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Color. */
public enum Color {

    /** Enum value White. */
    WHITE("White"),
    /** Enum value Red. */
    @Generated
    RED("Red"),
    /** Enum value Black. */
    BLACK("Black"),
    /** Enum value Blue. */
    @Generated
    BLUE("Blue"),
    /** Enum value Green. */
    @Generated
    GREEN("Green"),
    /** Enum value Yellow. */
    YELLOW("Yellow");

    /** The actual serialized value for a Color instance. */
    @Generated private final String value;

    @Generated
    Color(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Color instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Color object, or null if unable to parse.
     */
    @JsonCreator
    @Generated
    public static Color fromString(String value) {
        if (value == null) {
            return null;
        }
        Color[] items = Color.values();
        for (Color item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    @Generated
    public String toString() {
        return this.value;
    }
}
