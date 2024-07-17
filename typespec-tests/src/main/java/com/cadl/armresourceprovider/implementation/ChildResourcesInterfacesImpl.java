// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.cadl.armresourceprovider.fluent.ChildResourcesInterfacesClient;
import com.cadl.armresourceprovider.fluent.models.ChildResourceInner;
import com.cadl.armresourceprovider.models.ChildResource;
import com.cadl.armresourceprovider.models.ChildResourcesInterfaces;

public final class ChildResourcesInterfacesImpl implements ChildResourcesInterfaces {
    private static final ClientLogger LOGGER = new ClientLogger(ChildResourcesInterfacesImpl.class);

    private final ChildResourcesInterfacesClient innerClient;

    private final com.cadl.armresourceprovider.ArmResourceProviderManager serviceManager;

    public ChildResourcesInterfacesImpl(ChildResourcesInterfacesClient innerClient,
        com.cadl.armresourceprovider.ArmResourceProviderManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ChildResource> getWithResponse(String resourceGroupName, String topLevelArmResourceName,
        String childResourceName, Context context) {
        Response<ChildResourceInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, topLevelArmResourceName, childResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ChildResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ChildResource get(String resourceGroupName, String topLevelArmResourceName, String childResourceName) {
        ChildResourceInner inner
            = this.serviceClient().get(resourceGroupName, topLevelArmResourceName, childResourceName);
        if (inner != null) {
            return new ChildResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String topLevelArmResourceName, String childResourceName) {
        this.serviceClient().delete(resourceGroupName, topLevelArmResourceName, childResourceName);
    }

    public void delete(String resourceGroupName, String topLevelArmResourceName, String childResourceName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, topLevelArmResourceName, childResourceName, context);
    }

    public void actionWithoutBody(String resourceGroupName, String topLevelArmResourceName, String childResourceName) {
        this.serviceClient().actionWithoutBody(resourceGroupName, topLevelArmResourceName, childResourceName);
    }

    public void actionWithoutBody(String resourceGroupName, String topLevelArmResourceName, String childResourceName,
        Context context) {
        this.serviceClient().actionWithoutBody(resourceGroupName, topLevelArmResourceName, childResourceName, context);
    }

    public PagedIterable<ChildResource> listByTopLevelArmResource(String resourceGroupName,
        String topLevelArmResourceName) {
        PagedIterable<ChildResourceInner> inner
            = this.serviceClient().listByTopLevelArmResource(resourceGroupName, topLevelArmResourceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ChildResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ChildResource> listByTopLevelArmResource(String resourceGroupName,
        String topLevelArmResourceName, Context context) {
        PagedIterable<ChildResourceInner> inner
            = this.serviceClient().listByTopLevelArmResource(resourceGroupName, topLevelArmResourceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ChildResourceImpl(inner1, this.manager()));
    }

    public ChildResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        String childResourceName = ResourceManagerUtils.getValueFromIdByName(id, "childResources");
        if (childResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'childResources'.", id)));
        }
        return this.getWithResponse(resourceGroupName, topLevelArmResourceName, childResourceName, Context.NONE)
            .getValue();
    }

    public Response<ChildResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        String childResourceName = ResourceManagerUtils.getValueFromIdByName(id, "childResources");
        if (childResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'childResources'.", id)));
        }
        return this.getWithResponse(resourceGroupName, topLevelArmResourceName, childResourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        String childResourceName = ResourceManagerUtils.getValueFromIdByName(id, "childResources");
        if (childResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'childResources'.", id)));
        }
        this.delete(resourceGroupName, topLevelArmResourceName, childResourceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        String childResourceName = ResourceManagerUtils.getValueFromIdByName(id, "childResources");
        if (childResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'childResources'.", id)));
        }
        this.delete(resourceGroupName, topLevelArmResourceName, childResourceName, context);
    }

    private ChildResourcesInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.cadl.armresourceprovider.ArmResourceProviderManager manager() {
        return this.serviceManager;
    }

    public ChildResourceImpl define(String name) {
        return new ChildResourceImpl(name, this.manager());
    }
}
