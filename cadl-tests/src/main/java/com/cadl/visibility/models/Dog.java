// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.visibility.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Dog model. */
@Immutable
public final class Dog {
    /*
     * The id property.
     */
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int id;

    /*
     * The secretName property.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of Dog class.
     *
     * @param id the id value to set.
     * @param secretName the secretName value to set.
     * @param name the name value to set.
     */
    @JsonCreator
    public Dog(
            @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY) int id,
            @JsonProperty(value = "secretName", required = true) String secretName,
            @JsonProperty(value = "name", required = true) String name) {
        this.id = id;
        this.secretName = secretName;
        this.name = name;
    }

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Get the secretName property: The secretName property.
     *
     * @return the secretName value.
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
