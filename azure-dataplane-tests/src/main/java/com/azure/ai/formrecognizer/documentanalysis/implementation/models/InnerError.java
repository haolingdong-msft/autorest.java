// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <!-- start generated doc -->
 * Detailed error.
 * <!-- end generated doc -->
 */
@Fluent
public final class InnerError {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Detailed error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Creates an instance of InnerError class.
     */
    public InnerError() {
    }

    /**
     * Get the code property: Error code.
     * 
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     * 
     * @param code the code value to set.
     * @return the InnerError object itself.
     */
    public InnerError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     * 
     * @param message the message value to set.
     * @return the InnerError object itself.
     */
    public InnerError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the innererror property: Detailed error.
     * 
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: Detailed error.
     * 
     * @param innererror the innererror value to set.
     * @return the InnerError object itself.
     */
    public InnerError setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }
}
