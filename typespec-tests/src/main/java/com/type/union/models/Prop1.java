// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

/**
 * Defines values for Prop1.
 */
public enum Prop1 {
    /**
     * Enum value a.
     */
    A("a"),

    /**
     * Enum value b.
     */
    B("b"),

    /**
     * Enum value c.
     */
    C("c");

    /**
     * The actual serialized value for a Prop1 instance.
     */
    private final String value;

    Prop1(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Prop1 instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed Prop1 object, or null if unable to parse.
     */
    public static Prop1 fromString(String value) {
        if (value == null) {
            return null;
        }
        Prop1[] items = Prop1.values();
        for (Prop1 item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}