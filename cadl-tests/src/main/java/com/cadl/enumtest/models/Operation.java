// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.enumtest.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Operation model. */
@Fluent
public final class Operation {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private Name name;

    /*
     * The best property.
     */
    @JsonProperty(value = "best", required = true)
    private boolean best = true;

    /**
     * Creates an instance of Operation class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public Operation(@JsonProperty(value = "name", required = true) Name name) {
        best = true;
        this.name = name;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public Name getName() {
        return this.name;
    }

    /**
     * Get the best property: The best property.
     *
     * @return the best value.
     */
    public boolean isBest() {
        return this.best;
    }
}
