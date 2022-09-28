// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.lro.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the AzureLroClient type. */
public final class AzureLroClientImpl {
    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The PollingSuccessImpl object to access its operations. */
    private final PollingSuccessImpl pollingSuccess;

    /**
     * Gets the PollingSuccessImpl object to access its operations.
     *
     * @return the PollingSuccessImpl object.
     */
    public PollingSuccessImpl getPollingSuccess() {
        return this.pollingSuccess;
    }

    /** Initializes an instance of AzureLroClient client. */
    public AzureLroClientImpl() {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of AzureLroClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AzureLroClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of AzureLroClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     */
    public AzureLroClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.pollingSuccess = new PollingSuccessImpl(this);
    }
}
