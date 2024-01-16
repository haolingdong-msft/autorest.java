// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.custombaseuri.paging.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * <!-- start generated doc -->
 * The ProductResult model.
 * <!-- end generated doc -->
 */
@Fluent
public final class ProductResult {
    /*
     * The values property.
     */
    @JsonProperty(value = "values")
    private List<Product> values;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ProductResult class.
     */
    public ProductResult() {
    }

    /**
     * Get the values property: The values property.
     * 
     * @return the values value.
     */
    public List<Product> getValues() {
        return this.values;
    }

    /**
     * Set the values property: The values property.
     * 
     * @param values the values value to set.
     * @return the ProductResult object itself.
     */
    public ProductResult setValues(List<Product> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ProductResult object itself.
     */
    public ProductResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValues() != null) {
            getValues().forEach(e -> e.validate());
        }
    }
}
