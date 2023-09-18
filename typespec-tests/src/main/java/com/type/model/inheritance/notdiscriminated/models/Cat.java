// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.model.inheritance.notdiscriminated.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The second level model in the normal multiple levels inheritance. */
@Immutable
public class Cat extends Pet {
    /*
     * The age property.
     */
    @Generated
    @JsonProperty(value = "age")
    private int age;

    /**
     * Creates an instance of Cat class.
     *
     * @param name the name value to set.
     * @param age the age value to set.
     */
    @Generated
    @JsonCreator
    public Cat(@JsonProperty(value = "name") String name, @JsonProperty(value = "age") int age) {
        super(name);
        this.age = age;
    }

    /**
     * Get the age property: The age property.
     *
     * @return the age value.
     */
    @Generated
    public int getAge() {
        return this.age;
    }
}