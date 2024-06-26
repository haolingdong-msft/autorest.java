// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.longrunning.models;

/**
 * Enum describing allowed operation states.
 */
public enum OperationState {
    /**
     * The operation has not started.
     */
    NOT_STARTED("NotStarted"),

    /**
     * The operation is in progress.
     */
    RUNNING("Running"),

    /**
     * The operation has completed successfully.
     */
    SUCCEEDED("Succeeded"),

    /**
     * The operation has failed.
     */
    FAILED("Failed"),

    /**
     * The operation has been canceled by the user.
     */
    CANCELED("Canceled");

    /**
     * The actual serialized value for a OperationState instance.
     */
    private final String value;

    OperationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed OperationState object, or null if unable to parse.
     */
    public static OperationState fromString(String value) {
        if (value == null) {
            return null;
        }
        OperationState[] items = OperationState.values();
        for (OperationState item : items) {
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
