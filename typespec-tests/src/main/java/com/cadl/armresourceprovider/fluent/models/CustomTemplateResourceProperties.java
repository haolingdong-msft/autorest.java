// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.cadl.armresourceprovider.models.Dog;
import com.cadl.armresourceprovider.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Top Level Arm Resource Properties.
 */
@Fluent
public final class CustomTemplateResourceProperties {
    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The dog property.
     */
    @JsonProperty(value = "dog", required = true)
    private Dog dog;

    /**
     * Creates an instance of CustomTemplateResourceProperties class.
     */
    public CustomTemplateResourceProperties() {
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the dog property: The dog property.
     * 
     * @return the dog value.
     */
    public Dog dog() {
        return this.dog;
    }

    /**
     * Set the dog property: The dog property.
     * 
     * @param dog the dog value to set.
     * @return the CustomTemplateResourceProperties object itself.
     */
    public CustomTemplateResourceProperties withDog(Dog dog) {
        this.dog = dog;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dog() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dog in model CustomTemplateResourceProperties"));
        } else {
            dog().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomTemplateResourceProperties.class);
}
