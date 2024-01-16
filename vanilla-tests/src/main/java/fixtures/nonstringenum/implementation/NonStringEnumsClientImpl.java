// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.nonstringenum.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the NonStringEnumsClient type.
 */
public final class NonStringEnumsClientImpl {
    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
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
     * The IntsImpl object to access its operations.
     */
    private final IntsImpl ints;

    /**
     * Gets the IntsImpl object to access its operations.
     * 
     * @return the IntsImpl object.
     */
    public IntsImpl getInts() {
        return this.ints;
    }

    /**
     * The FloatOperationsImpl object to access its operations.
     */
    private final FloatOperationsImpl floatOperations;

    /**
     * Gets the FloatOperationsImpl object to access its operations.
     * 
     * @return the FloatOperationsImpl object.
     */
    public FloatOperationsImpl getFloatOperations() {
        return this.floatOperations;
    }

    /**
     * Initializes an instance of NonStringEnumsClient client.
     * 
     * @param host server parameter.
     */
    public NonStringEnumsClientImpl(String host) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of NonStringEnumsClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
    public NonStringEnumsClientImpl(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of NonStringEnumsClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
    public NonStringEnumsClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.ints = new IntsImpl(this);
        this.floatOperations = new FloatOperationsImpl(this);
    }
}
