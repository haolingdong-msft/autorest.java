// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <!-- start generated doc -->
 * The BooleanWrapper model.
 * <!-- end generated doc -->
 */
@Fluent
public final class BooleanWrapper {
    /*
     * The field_true property.
     */
    @JsonProperty(value = "field_true")
    private Boolean fieldTrue;

    /*
     * The field_false property.
     */
    @JsonProperty(value = "field_false")
    private Boolean fieldFalse;

    /**
     * Creates an instance of BooleanWrapper class.
     */
    public BooleanWrapper() {
    }

    /**
     * Get the fieldTrue property: The field_true property.
     * 
     * @return the fieldTrue value.
     */
    public Boolean isFieldTrue() {
        return this.fieldTrue;
    }

    /**
     * Set the fieldTrue property: The field_true property.
     * 
     * @param fieldTrue the fieldTrue value to set.
     * @return the BooleanWrapper object itself.
     */
    public BooleanWrapper setFieldTrue(Boolean fieldTrue) {
        this.fieldTrue = fieldTrue;
        return this;
    }

    /**
     * Get the fieldFalse property: The field_false property.
     * 
     * @return the fieldFalse value.
     */
    public Boolean isFieldFalse() {
        return this.fieldFalse;
    }

    /**
     * Set the fieldFalse property: The field_false property.
     * 
     * @param fieldFalse the fieldFalse value to set.
     * @return the BooleanWrapper object itself.
     */
    public BooleanWrapper setFieldFalse(Boolean fieldFalse) {
        this.fieldFalse = fieldFalse;
        return this;
    }
}
