// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.enumservice.models;

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

    /*
     * The age property.
     */
    @JsonProperty(value = "age", required = true)
    private long age = 50L;

    /*
     * The priority property.
     */
    @JsonProperty(value = "priority", required = true)
    private Priority priority;

    /**
     * Creates an instance of Operation class.
     *
     * @param name the name value to set.
     * @param priority the priority value to set.
     */
    @JsonCreator
    public Operation(
            @JsonProperty(value = "name", required = true) Name name,
            @JsonProperty(value = "priority", required = true) Priority priority) {
        best = true;
        age = 50L;
        this.name = name;
        this.priority = priority;
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

    /**
     * Get the age property: The age property.
     *
     * @return the age value.
     */
    public long getAge() {
        return this.age;
    }

    /**
     * Get the priority property: The priority property.
     *
     * @return the priority value.
     */
    public Priority getPriority() {
        return this.priority;
    }
}
