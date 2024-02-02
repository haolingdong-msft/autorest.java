// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.cadl.armresourceprovider.fluent.CustomTemplateResourceInterfacesClient;
import com.cadl.armresourceprovider.fluent.models.CustomTemplateResourceInner;
import com.cadl.armresourceprovider.models.CustomTemplateResourceInterfacesUpdateResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in CustomTemplateResourceInterfacesClient.
 */
public final class CustomTemplateResourceInterfacesClientImpl implements CustomTemplateResourceInterfacesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final CustomTemplateResourceInterfacesService service;

    /**
     * The service client containing this operation class.
     */
    private final ArmResourceProviderClientImpl client;

    /**
     * Initializes an instance of CustomTemplateResourceInterfacesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    CustomTemplateResourceInterfacesClientImpl(ArmResourceProviderClientImpl client) {
        this.service = RestProxy.create(CustomTemplateResourceInterfacesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArmResourceProviderClientCustomTemplateResourceInterfaces to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArmResourceProviderC")
    public interface CustomTemplateResourceInterfacesService {
        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Cadl.ArmResourceProvider/customTemplateResources/{customTemplateResourceName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> createOrUpdate(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("customTemplateResourceName") String customTemplateResourceName,
            @HeaderParam("accept") String accept, @BodyParam("application/json") CustomTemplateResourceInner resource,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Cadl.ArmResourceProvider/customTemplateResources/{customTemplateResourceName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<CustomTemplateResourceInterfacesUpdateResponse> update(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("customTemplateResourceName") String customTemplateResourceName,
            @HeaderParam("accept") String accept, @BodyParam("application/json") CustomTemplateResourceInner resource,
            Context context);
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type along
     * with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (customTemplateResourceName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter customTemplateResourceName is required and cannot be null."));
        }
        if (resource == null) {
            return Mono.error(new IllegalArgumentException("Parameter resource is required and cannot be null."));
        } else {
            resource.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, customTemplateResourceName, accept, resource,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type along
     * with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (customTemplateResourceName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter customTemplateResourceName is required and cannot be null."));
        }
        if (resource == null) {
            return Mono.error(new IllegalArgumentException("Parameter resource is required and cannot be null."));
        } else {
            resource.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), this.client.getApiVersion(),
            this.client.getSubscriptionId(), resourceGroupName, customTemplateResourceName, accept, resource, context);
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of concrete tracked resource types can be created by aliasing this
     * type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<CustomTemplateResourceInner>, CustomTemplateResourceInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String customTemplateResourceName, CustomTemplateResourceInner resource) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = createOrUpdateWithResponseAsync(resourceGroupName, customTemplateResourceName, resource);
        return this.client.<CustomTemplateResourceInner, CustomTemplateResourceInner>getLroResult(mono,
            this.client.getHttpPipeline(), CustomTemplateResourceInner.class, CustomTemplateResourceInner.class,
            this.client.getContext());
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of concrete tracked resource types can be created by aliasing this
     * type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<CustomTemplateResourceInner>, CustomTemplateResourceInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String customTemplateResourceName, CustomTemplateResourceInner resource,
        Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = createOrUpdateWithResponseAsync(resourceGroupName, customTemplateResourceName, resource, context);
        return this.client.<CustomTemplateResourceInner, CustomTemplateResourceInner>getLroResult(mono,
            this.client.getHttpPipeline(), CustomTemplateResourceInner.class, CustomTemplateResourceInner.class,
            context);
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of concrete tracked resource types can be created by aliasing this
     * type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<CustomTemplateResourceInner>, CustomTemplateResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String customTemplateResourceName, CustomTemplateResourceInner resource) {
        return this.beginCreateOrUpdateAsync(resourceGroupName, customTemplateResourceName, resource).getSyncPoller();
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of concrete tracked resource types can be created by aliasing this
     * type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<CustomTemplateResourceInner>, CustomTemplateResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String customTemplateResourceName, CustomTemplateResourceInner resource,
        Context context) {
        return this.beginCreateOrUpdateAsync(resourceGroupName, customTemplateResourceName, resource, context)
            .getSyncPoller();
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomTemplateResourceInner> createOrUpdateAsync(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource) {
        return beginCreateOrUpdateAsync(resourceGroupName, customTemplateResourceName, resource).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomTemplateResourceInner> createOrUpdateAsync(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource, Context context) {
        return beginCreateOrUpdateAsync(resourceGroupName, customTemplateResourceName, resource, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomTemplateResourceInner createOrUpdate(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource) {
        return createOrUpdateAsync(resourceGroupName, customTemplateResourceName, resource).block();
    }

    /**
     * Create a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomTemplateResourceInner createOrUpdate(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource, Context context) {
        return createOrUpdateAsync(resourceGroupName, customTemplateResourceName, resource, context).block();
    }

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomTemplateResourceInterfacesUpdateResponse> updateWithResponseAsync(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (customTemplateResourceName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter customTemplateResourceName is required and cannot be null."));
        }
        if (resource == null) {
            return Mono.error(new IllegalArgumentException("Parameter resource is required and cannot be null."));
        } else {
            resource.validate();
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.update(this.client.getEndpoint(), this.client.getApiVersion(),
            this.client.getSubscriptionId(), resourceGroupName, customTemplateResourceName, accept, resource, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomTemplateResourceInterfacesUpdateResponse> updateWithResponseAsync(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (customTemplateResourceName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter customTemplateResourceName is required and cannot be null."));
        }
        if (resource == null) {
            return Mono.error(new IllegalArgumentException("Parameter resource is required and cannot be null."));
        } else {
            resource.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, customTemplateResourceName, accept, resource, context);
    }

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CustomTemplateResourceInner> updateAsync(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource) {
        return updateWithResponseAsync(resourceGroupName, customTemplateResourceName, resource)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomTemplateResourceInterfacesUpdateResponse updateWithResponse(String resourceGroupName,
        String customTemplateResourceName, CustomTemplateResourceInner resource, Context context) {
        return updateWithResponseAsync(resourceGroupName, customTemplateResourceName, resource, context).block();
    }

    /**
     * Update a CustomTemplateResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param customTemplateResourceName arm resource name for path.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return concrete tracked resource types can be created by aliasing this type using a specific property type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CustomTemplateResourceInner update(String resourceGroupName, String customTemplateResourceName,
        CustomTemplateResourceInner resource) {
        return updateWithResponse(resourceGroupName, customTemplateResourceName, resource, Context.NONE).getValue();
    }
}
