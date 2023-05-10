// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.literalservice.models;

import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for OptionalLiteralParam. */
public enum OptionalLiteralParam {
    @Generated
    /** Enum value optionalLiteralParam. */
    OPTIONAL_LITERAL_PARAM("optionalLiteralParam");

    /** The actual serialized value for a OptionalLiteralParam instance. */
    @Generated private final String value;

    @Generated
    OptionalLiteralParam(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OptionalLiteralParam instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OptionalLiteralParam object, or null if unable to parse.
     */
    @JsonCreator
    @Generated
    public static OptionalLiteralParam fromString(String value) {
        if (value == null) {
            return null;
        }
        OptionalLiteralParam[] items = OptionalLiteralParam.values();
        for (OptionalLiteralParam item : items) {
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
