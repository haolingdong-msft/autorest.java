// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.type.property.valuetypes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model with a int property. */
@Immutable
public final class IntProperty {
    /*
     * Property
     */
    @JsonProperty(value = "property", required = true)
    private int property;

    /**
     * Creates an instance of IntProperty class.
     *
     * @param property the property value to set.
     */
    @JsonCreator
    public IntProperty(@JsonProperty(value = "property", required = true) int property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    public int getProperty() {
        return this.property;
    }
}