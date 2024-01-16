// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.lro.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <!-- start generated doc -->
 * The LROsPatch200SucceededIgnoreHeadersHeaders model.
 * <!-- end generated doc -->
 */
@Fluent
public final class LROsPatch200SucceededIgnoreHeadersHeaders {
    /*
     * The Azure-AsyncOperation property.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    private static final HttpHeaderName AZURE_ASYNC_OPERATION = HttpHeaderName.fromString("Azure-AsyncOperation");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of LROsPatch200SucceededIgnoreHeadersHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public LROsPatch200SucceededIgnoreHeadersHeaders(HttpHeaders rawHeaders) {
        this.azureAsyncOperation = rawHeaders.getValue(AZURE_ASYNC_OPERATION);
    }

    /**
     * Get the azureAsyncOperation property: The Azure-AsyncOperation property.
     * 
     * @return the azureAsyncOperation value.
     */
    public String getAzureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation property: The Azure-AsyncOperation property.
     * 
     * @param azureAsyncOperation the azureAsyncOperation value to set.
     * @return the LROsPatch200SucceededIgnoreHeadersHeaders object itself.
     */
    public LROsPatch200SucceededIgnoreHeadersHeaders setAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
