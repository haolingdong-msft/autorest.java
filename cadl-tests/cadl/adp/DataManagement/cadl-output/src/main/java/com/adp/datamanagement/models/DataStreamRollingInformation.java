// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data stream rolling information. */
@Immutable
public final class DataStreamRollingInformation {
    /*
     * Data stream rolling strategy
     */
    @JsonProperty(value = "strategy", required = true)
    private DataStreamRollingStrategy strategy;

    /*
     * Data stream rolling unit
     */
    @JsonProperty(value = "unit", required = true)
    private DataStreamRollingUnit unit;

    /*
     * Data stream rolling value
     */
    @JsonProperty(value = "value", required = true)
    private int value;

    /**
     * Creates an instance of DataStreamRollingInformation class.
     *
     * @param strategy the strategy value to set.
     * @param unit the unit value to set.
     * @param value the value value to set.
     */
    @JsonCreator
    public DataStreamRollingInformation(
            @JsonProperty(value = "strategy", required = true) DataStreamRollingStrategy strategy,
            @JsonProperty(value = "unit", required = true) DataStreamRollingUnit unit,
            @JsonProperty(value = "value", required = true) int value) {
        this.strategy = strategy;
        this.unit = unit;
        this.value = value;
    }

    /**
     * Get the strategy property: Data stream rolling strategy.
     *
     * @return the strategy value.
     */
    public DataStreamRollingStrategy getStrategy() {
        return this.strategy;
    }

    /**
     * Get the unit property: Data stream rolling unit.
     *
     * @return the unit value.
     */
    public DataStreamRollingUnit getUnit() {
        return this.unit;
    }

    /**
     * Get the value property: Data stream rolling value.
     *
     * @return the value value.
     */
    public int getValue() {
        return this.value;
    }
}
