// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union;

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
import com.type.union.implementation.UnionClientImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A builder for creating a new instance of the UnionClient type.
 */
@ServiceClientBuilder(
    serviceClients = {
        StringsOnlyClient.class,
        StringExtensibleClient.class,
        StringExtensibleNamedClient.class,
        IntsOnlyClient.class,
        FloatsOnlyClient.class,
        ModelsOnlyClient.class,
        EnumsOnlyClient.class,
        StringAndArrayClient.class,
        MixedLiteralsClient.class,
        MixedTypesClient.class,
        StringsOnlyAsyncClient.class,
        StringExtensibleAsyncClient.class,
        StringExtensibleNamedAsyncClient.class,
        IntsOnlyAsyncClient.class,
        FloatsOnlyAsyncClient.class,
        ModelsOnlyAsyncClient.class,
        EnumsOnlyAsyncClient.class,
        StringAndArrayAsyncClient.class,
        MixedLiteralsAsyncClient.class,
        MixedTypesAsyncClient.class })
public final class UnionClientBuilder implements HttpTrait<UnionClientBuilder>, ConfigurationTrait<UnionClientBuilder>,
    EndpointTrait<UnionClientBuilder> {
    @Generated
    private static final String SDK_NAME = "name";

    @Generated
    private static final String SDK_VERSION = "version";

    @Generated
    private static final Map<String, String> PROPERTIES = CoreUtils.getProperties("type-union.properties");

    @Generated
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Create an instance of the UnionClientBuilder.
     */
    @Generated
    public UnionClientBuilder() {
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
    public UnionClientBuilder pipeline(HttpPipeline pipeline) {
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
    public UnionClientBuilder httpClient(HttpClient httpClient) {
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
    public UnionClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
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
    public UnionClientBuilder clientOptions(ClientOptions clientOptions) {
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
    public UnionClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public UnionClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
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
    public UnionClientBuilder configuration(Configuration configuration) {
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
    public UnionClientBuilder endpoint(String endpoint) {
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
     * @return the UnionClientBuilder.
     */
    @Generated
    public UnionClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of UnionClientImpl with the provided parameters.
     * 
     * @return an instance of UnionClientImpl.
     */
    @Generated
    private UnionClientImpl buildInnerClient() {
        this.validateClient();
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        UnionClientImpl client
            = new UnionClientImpl(localPipeline, JacksonAdapter.createDefaultSerializerAdapter(), this.endpoint);
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
     * Builds an instance of StringsOnlyAsyncClient class.
     * 
     * @return an instance of StringsOnlyAsyncClient.
     */
    @Generated
    public StringsOnlyAsyncClient buildStringsOnlyAsyncClient() {
        return new StringsOnlyAsyncClient(buildInnerClient().getStringsOnlies());
    }

    /**
     * Builds an instance of StringExtensibleAsyncClient class.
     * 
     * @return an instance of StringExtensibleAsyncClient.
     */
    @Generated
    public StringExtensibleAsyncClient buildStringExtensibleAsyncClient() {
        return new StringExtensibleAsyncClient(buildInnerClient().getStringExtensibles());
    }

    /**
     * Builds an instance of StringExtensibleNamedAsyncClient class.
     * 
     * @return an instance of StringExtensibleNamedAsyncClient.
     */
    @Generated
    public StringExtensibleNamedAsyncClient buildStringExtensibleNamedAsyncClient() {
        return new StringExtensibleNamedAsyncClient(buildInnerClient().getStringExtensibleNameds());
    }

    /**
     * Builds an instance of IntsOnlyAsyncClient class.
     * 
     * @return an instance of IntsOnlyAsyncClient.
     */
    @Generated
    public IntsOnlyAsyncClient buildIntsOnlyAsyncClient() {
        return new IntsOnlyAsyncClient(buildInnerClient().getIntsOnlies());
    }

    /**
     * Builds an instance of FloatsOnlyAsyncClient class.
     * 
     * @return an instance of FloatsOnlyAsyncClient.
     */
    @Generated
    public FloatsOnlyAsyncClient buildFloatsOnlyAsyncClient() {
        return new FloatsOnlyAsyncClient(buildInnerClient().getFloatsOnlies());
    }

    /**
     * Builds an instance of ModelsOnlyAsyncClient class.
     * 
     * @return an instance of ModelsOnlyAsyncClient.
     */
    @Generated
    public ModelsOnlyAsyncClient buildModelsOnlyAsyncClient() {
        return new ModelsOnlyAsyncClient(buildInnerClient().getModelsOnlies());
    }

    /**
     * Builds an instance of EnumsOnlyAsyncClient class.
     * 
     * @return an instance of EnumsOnlyAsyncClient.
     */
    @Generated
    public EnumsOnlyAsyncClient buildEnumsOnlyAsyncClient() {
        return new EnumsOnlyAsyncClient(buildInnerClient().getEnumsOnlies());
    }

    /**
     * Builds an instance of StringAndArrayAsyncClient class.
     * 
     * @return an instance of StringAndArrayAsyncClient.
     */
    @Generated
    public StringAndArrayAsyncClient buildStringAndArrayAsyncClient() {
        return new StringAndArrayAsyncClient(buildInnerClient().getStringAndArrays());
    }

    /**
     * Builds an instance of MixedLiteralsAsyncClient class.
     * 
     * @return an instance of MixedLiteralsAsyncClient.
     */
    @Generated
    public MixedLiteralsAsyncClient buildMixedLiteralsAsyncClient() {
        return new MixedLiteralsAsyncClient(buildInnerClient().getMixedLiterals());
    }

    /**
     * Builds an instance of MixedTypesAsyncClient class.
     * 
     * @return an instance of MixedTypesAsyncClient.
     */
    @Generated
    public MixedTypesAsyncClient buildMixedTypesAsyncClient() {
        return new MixedTypesAsyncClient(buildInnerClient().getMixedTypes());
    }

    /**
     * Builds an instance of StringsOnlyClient class.
     * 
     * @return an instance of StringsOnlyClient.
     */
    @Generated
    public StringsOnlyClient buildStringsOnlyClient() {
        return new StringsOnlyClient(buildInnerClient().getStringsOnlies());
    }

    /**
     * Builds an instance of StringExtensibleClient class.
     * 
     * @return an instance of StringExtensibleClient.
     */
    @Generated
    public StringExtensibleClient buildStringExtensibleClient() {
        return new StringExtensibleClient(buildInnerClient().getStringExtensibles());
    }

    /**
     * Builds an instance of StringExtensibleNamedClient class.
     * 
     * @return an instance of StringExtensibleNamedClient.
     */
    @Generated
    public StringExtensibleNamedClient buildStringExtensibleNamedClient() {
        return new StringExtensibleNamedClient(buildInnerClient().getStringExtensibleNameds());
    }

    /**
     * Builds an instance of IntsOnlyClient class.
     * 
     * @return an instance of IntsOnlyClient.
     */
    @Generated
    public IntsOnlyClient buildIntsOnlyClient() {
        return new IntsOnlyClient(buildInnerClient().getIntsOnlies());
    }

    /**
     * Builds an instance of FloatsOnlyClient class.
     * 
     * @return an instance of FloatsOnlyClient.
     */
    @Generated
    public FloatsOnlyClient buildFloatsOnlyClient() {
        return new FloatsOnlyClient(buildInnerClient().getFloatsOnlies());
    }

    /**
     * Builds an instance of ModelsOnlyClient class.
     * 
     * @return an instance of ModelsOnlyClient.
     */
    @Generated
    public ModelsOnlyClient buildModelsOnlyClient() {
        return new ModelsOnlyClient(buildInnerClient().getModelsOnlies());
    }

    /**
     * Builds an instance of EnumsOnlyClient class.
     * 
     * @return an instance of EnumsOnlyClient.
     */
    @Generated
    public EnumsOnlyClient buildEnumsOnlyClient() {
        return new EnumsOnlyClient(buildInnerClient().getEnumsOnlies());
    }

    /**
     * Builds an instance of StringAndArrayClient class.
     * 
     * @return an instance of StringAndArrayClient.
     */
    @Generated
    public StringAndArrayClient buildStringAndArrayClient() {
        return new StringAndArrayClient(buildInnerClient().getStringAndArrays());
    }

    /**
     * Builds an instance of MixedLiteralsClient class.
     * 
     * @return an instance of MixedLiteralsClient.
     */
    @Generated
    public MixedLiteralsClient buildMixedLiteralsClient() {
        return new MixedLiteralsClient(buildInnerClient().getMixedLiterals());
    }

    /**
     * Builds an instance of MixedTypesClient class.
     * 
     * @return an instance of MixedTypesClient.
     */
    @Generated
    public MixedTypesClient buildMixedTypesClient() {
        return new MixedTypesClient(buildInnerClient().getMixedTypes());
    }

    private static final ClientLogger LOGGER = new ClientLogger(UnionClientBuilder.class);
}
