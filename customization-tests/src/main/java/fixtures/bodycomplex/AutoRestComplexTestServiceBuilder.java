// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
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
import com.azure.core.util.serializer.SerializerAdapter;
import fixtures.bodycomplex.implementation.AutoRestComplexTestServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the AutoRestComplexTestService type. */
@ServiceClientBuilder(
        serviceClients = {
            BasicClient.class,
            PrimitiveClient.class,
            ArrayClient.class,
            DictionaryClient.class,
            InheritanceClient.class,
            PolymorphismClient.class,
            PolymorphicrecursiveClient.class,
            ReadonlypropertyClient.class,
            FlattencomplexClient.class,
            BasicAsyncClient.class,
            PrimitiveAsyncClient.class,
            ArrayAsyncClient.class,
            DictionaryAsyncClient.class,
            InheritanceAsyncClient.class,
            PolymorphismAsyncClient.class,
            PolymorphicrecursiveAsyncClient.class,
            ReadonlypropertyAsyncClient.class,
            FlattencomplexAsyncClient.class
        })
public final class AutoRestComplexTestServiceBuilder
        implements HttpTrait<AutoRestComplexTestServiceBuilder>, ConfigurationTrait<AutoRestComplexTestServiceBuilder> {
    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private static final Map<String, String> PROPERTIES = new HashMap<>();

    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the AutoRestComplexTestServiceBuilder. */
    @Generated
    public AutoRestComplexTestServiceBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AutoRestComplexTestServiceBuilder pipeline(HttpPipeline pipeline) {
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
    public AutoRestComplexTestServiceBuilder httpClient(HttpClient httpClient) {
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
    public AutoRestComplexTestServiceBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
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
    public AutoRestComplexTestServiceBuilder clientOptions(ClientOptions clientOptions) {
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
    public AutoRestComplexTestServiceBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AutoRestComplexTestServiceBuilder addPolicy(HttpPipelinePolicy customPolicy) {
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
    public AutoRestComplexTestServiceBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * server parameter
     */
    @Generated private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    @Generated
    public AutoRestComplexTestServiceBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    @Generated private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    @Generated
    public AutoRestComplexTestServiceBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    @Generated private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    @Generated
    public AutoRestComplexTestServiceBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
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
     * @return the AutoRestComplexTestServiceBuilder.
     */
    @Generated
    public AutoRestComplexTestServiceBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of AutoRestComplexTestServiceImpl with the provided parameters.
     *
     * @return an instance of AutoRestComplexTestServiceImpl.
     */
    @Generated
    private AutoRestComplexTestServiceImpl buildInnerClient() {
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        String localHost = (host != null) ? host : "http://localhost:3000";
        String localApiVersion = (apiVersion != null) ? apiVersion : "2016-02-29";
        SerializerAdapter localSerializerAdapter =
                (serializerAdapter != null) ? serializerAdapter : JacksonAdapter.createDefaultSerializerAdapter();
        AutoRestComplexTestServiceImpl client =
                new AutoRestComplexTestServiceImpl(localPipeline, localSerializerAdapter, localHost, localApiVersion);
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
     * Builds an instance of BasicAsyncClient class.
     *
     * @return an instance of BasicAsyncClient.
     */
    @Generated
    public BasicAsyncClient buildBasicAsyncClient() {
        return new BasicAsyncClient(buildInnerClient().getBasics());
    }

    /**
     * Builds an instance of PrimitiveAsyncClient class.
     *
     * @return an instance of PrimitiveAsyncClient.
     */
    @Generated
    public PrimitiveAsyncClient buildPrimitiveAsyncClient() {
        return new PrimitiveAsyncClient(buildInnerClient().getPrimitives());
    }

    /**
     * Builds an instance of ArrayAsyncClient class.
     *
     * @return an instance of ArrayAsyncClient.
     */
    @Generated
    public ArrayAsyncClient buildArrayAsyncClient() {
        return new ArrayAsyncClient(buildInnerClient().getArrays());
    }

    /**
     * Builds an instance of DictionaryAsyncClient class.
     *
     * @return an instance of DictionaryAsyncClient.
     */
    @Generated
    public DictionaryAsyncClient buildDictionaryAsyncClient() {
        return new DictionaryAsyncClient(buildInnerClient().getDictionaries());
    }

    /**
     * Builds an instance of InheritanceAsyncClient class.
     *
     * @return an instance of InheritanceAsyncClient.
     */
    @Generated
    public InheritanceAsyncClient buildInheritanceAsyncClient() {
        return new InheritanceAsyncClient(buildInnerClient().getInheritances());
    }

    /**
     * Builds an instance of PolymorphismAsyncClient class.
     *
     * @return an instance of PolymorphismAsyncClient.
     */
    @Generated
    public PolymorphismAsyncClient buildPolymorphismAsyncClient() {
        return new PolymorphismAsyncClient(buildInnerClient().getPolymorphisms());
    }

    /**
     * Builds an instance of PolymorphicrecursiveAsyncClient class.
     *
     * @return an instance of PolymorphicrecursiveAsyncClient.
     */
    @Generated
    public PolymorphicrecursiveAsyncClient buildPolymorphicrecursiveAsyncClient() {
        return new PolymorphicrecursiveAsyncClient(buildInnerClient().getPolymorphicrecursives());
    }

    /**
     * Builds an instance of ReadonlypropertyAsyncClient class.
     *
     * @return an instance of ReadonlypropertyAsyncClient.
     */
    @Generated
    public ReadonlypropertyAsyncClient buildReadonlypropertyAsyncClient() {
        return new ReadonlypropertyAsyncClient(buildInnerClient().getReadonlyproperties());
    }

    /**
     * Builds an instance of FlattencomplexAsyncClient class.
     *
     * @return an instance of FlattencomplexAsyncClient.
     */
    @Generated
    public FlattencomplexAsyncClient buildFlattencomplexAsyncClient() {
        return new FlattencomplexAsyncClient(buildInnerClient().getFlattencomplexes());
    }

    /**
     * Builds an instance of BasicClient class.
     *
     * @return an instance of BasicClient.
     */
    @Generated
    public BasicClient buildBasicClient() {
        return new BasicClient(buildInnerClient().getBasics());
    }

    /**
     * Builds an instance of PrimitiveClient class.
     *
     * @return an instance of PrimitiveClient.
     */
    @Generated
    public PrimitiveClient buildPrimitiveClient() {
        return new PrimitiveClient(buildInnerClient().getPrimitives());
    }

    /**
     * Builds an instance of ArrayClient class.
     *
     * @return an instance of ArrayClient.
     */
    @Generated
    public ArrayClient buildArrayClient() {
        return new ArrayClient(buildInnerClient().getArrays());
    }

    /**
     * Builds an instance of DictionaryClient class.
     *
     * @return an instance of DictionaryClient.
     */
    @Generated
    public DictionaryClient buildDictionaryClient() {
        return new DictionaryClient(buildInnerClient().getDictionaries());
    }

    /**
     * Builds an instance of InheritanceClient class.
     *
     * @return an instance of InheritanceClient.
     */
    @Generated
    public InheritanceClient buildInheritanceClient() {
        return new InheritanceClient(buildInnerClient().getInheritances());
    }

    /**
     * Builds an instance of PolymorphismClient class.
     *
     * @return an instance of PolymorphismClient.
     */
    @Generated
    public PolymorphismClient buildPolymorphismClient() {
        return new PolymorphismClient(buildInnerClient().getPolymorphisms());
    }

    /**
     * Builds an instance of PolymorphicrecursiveClient class.
     *
     * @return an instance of PolymorphicrecursiveClient.
     */
    @Generated
    public PolymorphicrecursiveClient buildPolymorphicrecursiveClient() {
        return new PolymorphicrecursiveClient(buildInnerClient().getPolymorphicrecursives());
    }

    /**
     * Builds an instance of ReadonlypropertyClient class.
     *
     * @return an instance of ReadonlypropertyClient.
     */
    @Generated
    public ReadonlypropertyClient buildReadonlypropertyClient() {
        return new ReadonlypropertyClient(buildInnerClient().getReadonlyproperties());
    }

    /**
     * Builds an instance of FlattencomplexClient class.
     *
     * @return an instance of FlattencomplexClient.
     */
    @Generated
    public FlattencomplexClient buildFlattencomplexClient() {
        return new FlattencomplexClient(buildInnerClient().getFlattencomplexes());
    }
}
