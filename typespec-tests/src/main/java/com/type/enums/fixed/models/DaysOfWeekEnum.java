// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.enums.fixed.models;

import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DaysOfWeekEnum.
 */
public enum DaysOfWeekEnum {
    @Generated
    /**
     * Enum value Monday.
     */
    MONDAY("Monday");

    @Generated
    /**
     * Enum value Tuesday.
     */
    TUESDAY("Tuesday");

    @Generated
    /**
     * Enum value Wednesday.
     */
    WEDNESDAY("Wednesday");

    @Generated
    /**
     * Enum value Thursday.
     */
    THURSDAY("Thursday");

    @Generated
    /**
     * Enum value Friday.
     */
    FRIDAY("Friday");

    @Generated
    /**
     * Enum value Saturday.
     */
    SATURDAY("Saturday");

    @Generated
    /**
     * Enum value Sunday.
     */
    SUNDAY("Sunday");

    /**
     * The actual serialized value for a DaysOfWeekEnum instance.
     */
    @Generated
    private final String value;

    @Generated
    DaysOfWeekEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DaysOfWeekEnum instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DaysOfWeekEnum object, or null if unable to parse.
     */
    @JsonCreator
    @Generated
    public static DaysOfWeekEnum fromString(String value) {
        if (value == null) {
            return null;
        }
        DaysOfWeekEnum[] items = DaysOfWeekEnum.values();
        for (DaysOfWeekEnum item : items) {
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
    @Generated
    public String toString() {
        return this.value;
    }
}
