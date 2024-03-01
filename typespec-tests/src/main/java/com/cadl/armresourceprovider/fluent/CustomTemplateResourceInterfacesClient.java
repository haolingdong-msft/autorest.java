// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.cadl.armresourceprovider.fluent.models.CustomTemplateResourceInner;
import com.cadl.armresourceprovider.models.CustomTemplateResourceInterfacesUpdateResponse;

/**
 * An instance of this class provides access to all the operations defined in CustomTemplateResourceInterfacesClient.
 */
public interface CustomTemplateResourceInterfacesClient {
    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CustomTemplateResourceInner>, CustomTemplateResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String customTemplateResourceName, CustomTemplateResourceInner resource);

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CustomTemplateResourceInner>, CustomTemplateResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String customTemplateResourceName, CustomTemplateResourceInner resource,
        Context context);

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomTemplateResourceInner createOrUpdate(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource);

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomTemplateResourceInner createOrUpdate(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource, Context context);

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomTemplateResourceInterfacesUpdateResponse updateWithResponse(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource, Context context);

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomTemplateResourceInner update(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource);
}
