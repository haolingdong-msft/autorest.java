// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of TopLevelArmResourceInterfaces.
 */
public interface TopLevelArmResourceInterfaces {
    /**
     * Get a TopLevelArmResource.
     * 
     * @param resourceGroupName A sequence of textual characters.
     * 
     * The resourceGroupName parameter.
     * @param topLevelArmResourceName A sequence of textual characters.
     * 
     * The topLevelArmResourceName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TopLevelArmResource along with {@link Response}.
     */
    Response<TopLevelArmResource> getByResourceGroupWithResponse(String resourceGroupName,
        String topLevelArmResourceName, Context context);

    /**
     * Get a TopLevelArmResource.
     * 
     * @param resourceGroupName A sequence of textual characters.
     * 
     * The resourceGroupName parameter.
     * @param topLevelArmResourceName A sequence of textual characters.
     * 
     * The topLevelArmResourceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TopLevelArmResource.
     */
    TopLevelArmResource getByResourceGroup(String resourceGroupName, String topLevelArmResourceName);

    /**
     * Delete a TopLevelArmResource.
     * 
     * @param resourceGroupName A sequence of textual characters.
     * 
     * The resourceGroupName parameter.
     * @param topLevelArmResourceName A sequence of textual characters.
     * 
     * The topLevelArmResourceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String topLevelArmResourceName);

    /**
     * Delete a TopLevelArmResource.
     * 
     * @param resourceGroupName A sequence of textual characters.
     * 
     * The resourceGroupName parameter.
     * @param topLevelArmResourceName A sequence of textual characters.
     * 
     * The topLevelArmResourceName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String topLevelArmResourceName, Context context);

    /**
     * List TopLevelArmResource resources by resource group.
     * 
     * @param resourceGroupName A sequence of textual characters.
     * 
     * The resourceGroupName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TopLevelArmResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopLevelArmResource> listByResourceGroup(String resourceGroupName);

    /**
     * List TopLevelArmResource resources by resource group.
     * 
     * @param resourceGroupName A sequence of textual characters.
     * 
     * The resourceGroupName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TopLevelArmResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopLevelArmResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List TopLevelArmResource resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TopLevelArmResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopLevelArmResource> list();

    /**
     * List TopLevelArmResource resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a TopLevelArmResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopLevelArmResource> list(Context context);

    /**
     * Get a TopLevelArmResource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TopLevelArmResource along with {@link Response}.
     */
    TopLevelArmResource getById(String id);

    /**
     * Get a TopLevelArmResource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a TopLevelArmResource along with {@link Response}.
     */
    Response<TopLevelArmResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a TopLevelArmResource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a TopLevelArmResource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TopLevelArmResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new TopLevelArmResource definition.
     */
    TopLevelArmResource.DefinitionStages.Blank define(String name);
}
