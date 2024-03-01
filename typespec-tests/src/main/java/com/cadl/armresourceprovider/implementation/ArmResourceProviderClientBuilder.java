// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/**
 * A builder for creating a new instance of the ArmResourceProviderClientImpl type.
 */
@ServiceClientBuilder(serviceClients = { ArmResourceProviderClientImpl.class })
public final class ArmResourceProviderClientBuilder {
    /*
     * Server parameter
     */
    private String endpoint;

    /**
     * Sets Server parameter.
     * 
     * @param endpoint the endpoint value.
     * @return the ArmResourceProviderClientBuilder.
     */
    public ArmResourceProviderClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The ID of the target subscription.
     */
    private String subscriptionId;

    /**
     * Sets The ID of the target subscription.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the ArmResourceProviderClientBuilder.
     */
    public ArmResourceProviderClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the ArmResourceProviderClientBuilder.
     */
    public ArmResourceProviderClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the ArmResourceProviderClientBuilder.
     */
    public ArmResourceProviderClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The default poll interval for long-running operation
     */
    private Duration defaultPollInterval;

    /**
     * Sets The default poll interval for long-running operation.
     * 
     * @param defaultPollInterval the defaultPollInterval value.
     * @return the ArmResourceProviderClientBuilder.
     */
    public ArmResourceProviderClientBuilder defaultPollInterval(Duration defaultPollInterval) {
        this.defaultPollInterval = defaultPollInterval;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     * 
     * @param serializerAdapter the serializerAdapter value.
     * @return the ArmResourceProviderClientBuilder.
     */
    public ArmResourceProviderClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of ArmResourceProviderClientImpl with the provided parameters.
     * 
     * @return an instance of ArmResourceProviderClientImpl.
     */
    public ArmResourceProviderClientImpl buildClient() {
        AzureEnvironment localEnvironment = (environment != null) ? environment : AzureEnvironment.AZURE;
        HttpPipeline localPipeline = (pipeline != null)
            ? pipeline
            : new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build();
        Duration localDefaultPollInterval
            = (defaultPollInterval != null) ? defaultPollInterval : Duration.ofSeconds(30);
        SerializerAdapter localSerializerAdapter = (serializerAdapter != null)
            ? serializerAdapter
            : SerializerFactory.createDefaultManagementSerializerAdapter();
        ArmResourceProviderClientImpl client = new ArmResourceProviderClientImpl(localPipeline, localSerializerAdapter,
            localDefaultPollInterval, localEnvironment, this.endpoint, this.subscriptionId);
        return client;
    }
}
