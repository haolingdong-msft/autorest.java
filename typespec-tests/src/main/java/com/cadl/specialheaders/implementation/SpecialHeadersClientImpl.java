// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.specialheaders.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.cadl.specialheaders.SpecialHeadersServiceVersion;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the SpecialHeadersClient type.
 * <!-- end generated doc -->
 */
public final class SpecialHeadersClientImpl {
    /**
     * Server parameter.
     */
    private final String endpoint;

    /**
     * Gets Server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final SpecialHeadersServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public SpecialHeadersServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The RepeatabilityHeadersImpl object to access its operations.
     */
    private final RepeatabilityHeadersImpl repeatabilityHeaders;

    /**
     * Gets the RepeatabilityHeadersImpl object to access its operations.
     * 
     * @return the RepeatabilityHeadersImpl object.
     */
    public RepeatabilityHeadersImpl getRepeatabilityHeaders() {
        return this.repeatabilityHeaders;
    }

    /**
     * The EtagHeadersImpl object to access its operations.
     */
    private final EtagHeadersImpl etagHeaders;

    /**
     * Gets the EtagHeadersImpl object to access its operations.
     * 
     * @return the EtagHeadersImpl object.
     */
    public EtagHeadersImpl getEtagHeaders() {
        return this.etagHeaders;
    }

    /**
     * The EtagHeadersOptionalBodiesImpl object to access its operations.
     */
    private final EtagHeadersOptionalBodiesImpl etagHeadersOptionalBodies;

    /**
     * Gets the EtagHeadersOptionalBodiesImpl object to access its operations.
     * 
     * @return the EtagHeadersOptionalBodiesImpl object.
     */
    public EtagHeadersOptionalBodiesImpl getEtagHeadersOptionalBodies() {
        return this.etagHeadersOptionalBodies;
    }

    /**
     * The SkipSpecialHeadersImpl object to access its operations.
     */
    private final SkipSpecialHeadersImpl skipSpecialHeaders;

    /**
     * Gets the SkipSpecialHeadersImpl object to access its operations.
     * 
     * @return the SkipSpecialHeadersImpl object.
     */
    public SkipSpecialHeadersImpl getSkipSpecialHeaders() {
        return this.skipSpecialHeaders;
    }

    /**
     * Initializes an instance of SpecialHeadersClient client.
     * 
     * @param endpoint Server parameter.
     * @param serviceVersion Service version.
     */
    public SpecialHeadersClientImpl(String endpoint, SpecialHeadersServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of SpecialHeadersClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Server parameter.
     * @param serviceVersion Service version.
     */
    public SpecialHeadersClientImpl(HttpPipeline httpPipeline, String endpoint,
        SpecialHeadersServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of SpecialHeadersClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Server parameter.
     * @param serviceVersion Service version.
     */
    public SpecialHeadersClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        SpecialHeadersServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.repeatabilityHeaders = new RepeatabilityHeadersImpl(this);
        this.etagHeaders = new EtagHeadersImpl(this);
        this.etagHeadersOptionalBodies = new EtagHeadersOptionalBodiesImpl(this);
        this.skipSpecialHeaders = new SkipSpecialHeadersImpl(this);
    }
}
