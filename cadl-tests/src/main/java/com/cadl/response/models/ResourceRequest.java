// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.response.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The template for adding updateable properties. */
@Fluent
public final class ResourceRequest {
    /*
     * The type property.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of ResourceRequest class.
     *
     * @param type the type value to set.
     */
    @JsonCreator
    public ResourceRequest(@JsonProperty(value = "type", required = true) String type) {
        this.type = type;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }
}