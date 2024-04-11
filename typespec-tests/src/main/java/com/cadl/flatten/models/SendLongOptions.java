// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.flatten.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;

/**
 * Options for sendLong API.
 */
@Fluent
public final class SendLongOptions {
    /*
     * The name property.
     */
    @Generated
    private final String name;

    /*
     * The filter property.
     */
    @Generated
    private String filter;

    /*
     * The user property.
     */
    @Generated
    private User user;

    /*
     * The input property.
     */
    @Generated
    private final String input;

    /*
     * The dataInt property.
     */
    @Generated
    private final int dataInt;

    /*
     * The dataIntOptional property.
     */
    @Generated
    private Integer dataIntOptional;

    /*
     * The dataLong property.
     */
    @Generated
    private Long dataLong;

    /*
     * The data_float property.
     */
    @Generated
    private Double dataFloat;

    /*
     * The item's title
     */
    @Generated
    private final String title;

    /*
     * A longer description of the todo item in markdown format
     */
    @Generated
    private String description;

    /*
     * The status of the todo item
     */
    @Generated
    private final Status status;

    /*
     * The _dummy property.
     */
    @Generated
    private String dummy;

    /**
     * Creates an instance of SendLongOptions class.
     * 
     * @param name the name value to set.
     * @param input the input value to set.
     * @param dataInt the dataInt value to set.
     * @param title the title value to set.
     * @param status the status value to set.
     */
    @Generated
    public SendLongOptions(String name, String input, int dataInt, String title, Status status) {
        this.name = name;
        this.input = input;
        this.dataInt = dataInt;
        this.title = title;
        this.status = status;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the filter property: The filter property.
     * 
     * @return the filter value.
     */
    @Generated
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: The filter property.
     * 
     * @param filter the filter value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the user property: The user property.
     * 
     * @return the user value.
     */
    @Generated
    public User getUser() {
        return this.user;
    }

    /**
     * Set the user property: The user property.
     * 
     * @param user the user value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get the input property: The input property.
     * 
     * @return the input value.
     */
    @Generated
    public String getInput() {
        return this.input;
    }

    /**
     * Get the dataInt property: The dataInt property.
     * 
     * @return the dataInt value.
     */
    @Generated
    public int getDataInt() {
        return this.dataInt;
    }

    /**
     * Get the dataIntOptional property: The dataIntOptional property.
     * 
     * @return the dataIntOptional value.
     */
    @Generated
    public Integer getDataIntOptional() {
        return this.dataIntOptional;
    }

    /**
     * Set the dataIntOptional property: The dataIntOptional property.
     * 
     * @param dataIntOptional the dataIntOptional value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setDataIntOptional(Integer dataIntOptional) {
        this.dataIntOptional = dataIntOptional;
        return this;
    }

    /**
     * Get the dataLong property: The dataLong property.
     * 
     * @return the dataLong value.
     */
    @Generated
    public Long getDataLong() {
        return this.dataLong;
    }

    /**
     * Set the dataLong property: The dataLong property.
     * 
     * @param dataLong the dataLong value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setDataLong(Long dataLong) {
        this.dataLong = dataLong;
        return this;
    }

    /**
     * Get the dataFloat property: The data_float property.
     * 
     * @return the dataFloat value.
     */
    @Generated
    public Double getDataFloat() {
        return this.dataFloat;
    }

    /**
     * Set the dataFloat property: The data_float property.
     * 
     * @param dataFloat the dataFloat value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setDataFloat(Double dataFloat) {
        this.dataFloat = dataFloat;
        return this;
    }

    /**
     * Get the title property: The item's title.
     * 
     * @return the title value.
     */
    @Generated
    public String getTitle() {
        return this.title;
    }

    /**
     * Get the description property: A longer description of the todo item in markdown format.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A longer description of the todo item in markdown format.
     * 
     * @param description the description value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status property: The status of the todo item.
     * 
     * @return the status value.
     */
    @Generated
    public Status getStatus() {
        return this.status;
    }

    /**
     * Get the dummy property: The _dummy property.
     * 
     * @return the dummy value.
     */
    @Generated
    public String getDummy() {
        return this.dummy;
    }

    /**
     * Set the dummy property: The _dummy property.
     * 
     * @param dummy the dummy value to set.
     * @return the SendLongOptions object itself.
     */
    @Generated
    public SendLongOptions setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
}
