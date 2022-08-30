// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.models.property.types.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Model with a duration property. */
@Fluent
public final class DurationProperty {
    /*
     * Property
     */
    @JsonProperty(value = "property", required = true)
    private OffsetDateTime property;

    /**
     * Creates an instance of DurationProperty class.
     *
     * @param property the property value to set.
     */
    @JsonCreator
    public DurationProperty(@JsonProperty(value = "property", required = true) OffsetDateTime property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     *
     * @return the property value.
     */
    public OffsetDateTime getProperty() {
        return this.property;
    }
}
