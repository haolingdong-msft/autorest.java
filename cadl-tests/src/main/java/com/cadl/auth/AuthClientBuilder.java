// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.auth;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.AzureKeyCredentialTrait;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.AzureKeyCredentialPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
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
import com.azure.core.util.serializer.JacksonAdapter;
import com.cadl.auth.implementation.AuthClientImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the AuthClient type. */
@ServiceClientBuilder(serviceClients = {AuthClient.class, AuthAsyncClient.class})
public final class AuthClientBuilder
        implements HttpTrait<AuthClientBuilder>,
                ConfigurationTrait<AuthClientBuilder>,
                TokenCredentialTrait<AuthClientBuilder>,
                AzureKeyCredentialTrait<AuthClientBuilder>,
                EndpointTrait<AuthClientBuilder> {
    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private static final String[] DEFAULT_SCOPES = new String[] {"https://api.example.com/.default"};

    @Generated private static final Map<String, String> PROPERTIES = CoreUtils.getProperties("cadl-auth.properties");

    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the AuthClientBuilder. */
    @Generated
    public AuthClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated private HttpClient httpClient;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated private HttpLogOptions httpLogOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated private ClientOptions clientOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated private RetryOptions retryOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated private Configuration configuration;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    @Generated private TokenCredential tokenCredential;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The AzureKeyCredential used for authentication.
     */
    @Generated private AzureKeyCredential azureKeyCredential;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder credential(AzureKeyCredential azureKeyCredential) {
        this.azureKeyCredential = azureKeyCredential;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated private String endpoint;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AuthClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the AuthClientBuilder.
     */
    @Generated
    public AuthClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of AuthClientImpl with the provided parameters.
     *
     * @return an instance of AuthClientImpl.
     */
    @Generated
    private AuthClientImpl buildInnerClient() {
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        AuthClientImpl client =
                new AuthClientImpl(localPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint);
        return client;
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        localClientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        policies.add(new CookiePolicy());
        if (azureKeyCredential != null) {
            policies.add(new AzureKeyCredentialPolicy("x-ms-api-key", azureKeyCredential));
        }
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .clientOptions(localClientOptions)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of AuthAsyncClient class.
     *
     * @return an instance of AuthAsyncClient.
     */
    @Generated
    public AuthAsyncClient buildAsyncClient() {
        return new AuthAsyncClient(buildInnerClient().getAuthOps());
    }

    /**
     * Builds an instance of AuthClient class.
     *
     * @return an instance of AuthClient.
     */
    @Generated
    public AuthClient buildClient() {
        return new AuthClient(new AuthAsyncClient(buildInnerClient().getAuthOps()));
    }
}
