// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com._specs_.azure.clientgenerator.core.access;

import com._specs_.azure.clientgenerator.core.access.implementation.AccessClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A builder for creating a new instance of the AccessClient type.
 */
@ServiceClientBuilder(
    serviceClients = {
        PublicOperationClient.class,
        InternalOperationClient.class,
        SharedModelInOperationClient.class,
        RelativeModelInOperationClient.class,
        PublicOperationAsyncClient.class,
        InternalOperationAsyncClient.class,
        SharedModelInOperationAsyncClient.class,
        RelativeModelInOperationAsyncClient.class })
public final class AccessClientBuilder implements HttpTrait<AccessClientBuilder>,
    ConfigurationTrait<AccessClientBuilder>, EndpointTrait<AccessClientBuilder> {
    @Generated
    private static final String SDK_NAME = "name";

    @Generated
    private static final String SDK_VERSION = "version";

    @Generated
    private static final Map<String, String> PROPERTIES
        = CoreUtils.getProperties("_specs_-azure-clientgenerator-core-access.properties");

    @Generated
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Create an instance of the AccessClientBuilder.
     */
    @Generated
    public AccessClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated
    private HttpPipeline pipeline;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder pipeline(HttpPipeline pipeline) {
        if (this.pipeline != null && pipeline == null) {
            LOGGER.atInfo().log("HttpPipeline is being set to 'null' when it was previously configured.");
        }
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated
    private HttpClient httpClient;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated
    private HttpLogOptions httpLogOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated
    private ClientOptions clientOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated
    private RetryOptions retryOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated
    private Configuration configuration;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated
    private String endpoint;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public AccessClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     * 
     * @param retryPolicy the retryPolicy value.
     * @return the AccessClientBuilder.
     */
    @Generated
    public AccessClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of AccessClientImpl with the provided parameters.
     * 
     * @return an instance of AccessClientImpl.
     */
    @Generated
    private AccessClientImpl buildInnerClient() {
        this.validateClient();
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        AccessClientImpl client
            = new AccessClientImpl(localPipeline, JacksonAdapter.createDefaultSerializerAdapter(), this.endpoint);
        return client;
    }

    @Generated
    private void validateClient() {
        // This method is invoked from 'buildInnerClient'/'buildClient' method.
        // Developer can customize this method, to validate that the necessary conditions are met for the new client.
        Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = CoreUtils.createHttpHeadersFromClientOptions(localClientOptions);
        if (headers != null) {
            policies.add(new AddHeadersPolicy(headers));
        }
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(localHttpLogOptions));
        HttpPipeline httpPipeline = new HttpPipelineBuilder().policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .clientOptions(localClientOptions)
            .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of PublicOperationAsyncClient class.
     * 
     * @return an instance of PublicOperationAsyncClient.
     */
    @Generated
    public PublicOperationAsyncClient buildPublicOperationAsyncClient() {
        return new PublicOperationAsyncClient(buildInnerClient().getPublicOperations());
    }

    /**
     * Builds an instance of InternalOperationAsyncClient class.
     * 
     * @return an instance of InternalOperationAsyncClient.
     */
    @Generated
    public InternalOperationAsyncClient buildInternalOperationAsyncClient() {
        return new InternalOperationAsyncClient(buildInnerClient().getInternalOperations());
    }

    /**
     * Builds an instance of SharedModelInOperationAsyncClient class.
     * 
     * @return an instance of SharedModelInOperationAsyncClient.
     */
    @Generated
    public SharedModelInOperationAsyncClient buildSharedModelInOperationAsyncClient() {
        return new SharedModelInOperationAsyncClient(buildInnerClient().getSharedModelInOperations());
    }

    /**
     * Builds an instance of RelativeModelInOperationAsyncClient class.
     * 
     * @return an instance of RelativeModelInOperationAsyncClient.
     */
    @Generated
    public RelativeModelInOperationAsyncClient buildRelativeModelInOperationAsyncClient() {
        return new RelativeModelInOperationAsyncClient(buildInnerClient().getRelativeModelInOperations());
    }

    /**
     * Builds an instance of PublicOperationClient class.
     * 
     * @return an instance of PublicOperationClient.
     */
    @Generated
    public PublicOperationClient buildPublicOperationClient() {
        return new PublicOperationClient(buildInnerClient().getPublicOperations());
    }

    /**
     * Builds an instance of InternalOperationClient class.
     * 
     * @return an instance of InternalOperationClient.
     */
    @Generated
    public InternalOperationClient buildInternalOperationClient() {
        return new InternalOperationClient(buildInnerClient().getInternalOperations());
    }

    /**
     * Builds an instance of SharedModelInOperationClient class.
     * 
     * @return an instance of SharedModelInOperationClient.
     */
    @Generated
    public SharedModelInOperationClient buildSharedModelInOperationClient() {
        return new SharedModelInOperationClient(buildInnerClient().getSharedModelInOperations());
    }

    /**
     * Builds an instance of RelativeModelInOperationClient class.
     * 
     * @return an instance of RelativeModelInOperationClient.
     */
    @Generated
    public RelativeModelInOperationClient buildRelativeModelInOperationClient() {
        return new RelativeModelInOperationClient(buildInnerClient().getRelativeModelInOperations());
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccessClientBuilder.class);
}
