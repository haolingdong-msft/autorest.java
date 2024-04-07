// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the AutoRestSwaggerConstantService type.
 */
public final class AutoRestSwaggerConstantService {
    /**
     * Constant header property on the client that is a required parameter for operation 'constants_putClientConstants'.
     */
    private final boolean headerConstant;

    /**
     * Gets Constant header property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * 
     * @return the headerConstant value.
     */
    public boolean isHeaderConstant() {
        return this.headerConstant;
    }

    /**
     * Constant query property on the client that is a required parameter for operation 'constants_putClientConstants'.
     */
    private final int queryConstant;

    /**
     * Gets Constant query property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * 
     * @return the queryConstant value.
     */
    public int getQueryConstant() {
        return this.queryConstant;
    }

    /**
     * Constant path property on the client that is a required parameter for operation 'constants_putClientConstants'.
     */
    private final String pathConstant;

    /**
     * Gets Constant path property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * 
     * @return the pathConstant value.
     */
    public String getPathConstant() {
        return this.pathConstant;
    }

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
     * The Contants object to access its operations.
     */
    private final Contants contants;

    /**
     * Gets the Contants object to access its operations.
     * 
     * @return the Contants object.
     */
    public Contants getContants() {
        return this.contants;
    }

    /**
     * Initializes an instance of AutoRestSwaggerConstantService client.
     * 
     * @param headerConstant Constant header property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param queryConstant Constant query property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param pathConstant Constant path property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param host server parameter.
     */
    AutoRestSwaggerConstantService(boolean headerConstant, int queryConstant, String pathConstant, String host) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), headerConstant, queryConstant, pathConstant, host);
    }

    /**
     * Initializes an instance of AutoRestSwaggerConstantService client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param headerConstant Constant header property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param queryConstant Constant query property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param pathConstant Constant path property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param host server parameter.
     */
    AutoRestSwaggerConstantService(HttpPipeline httpPipeline, boolean headerConstant, int queryConstant,
        String pathConstant, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), headerConstant, queryConstant, pathConstant,
            host);
    }

    /**
     * Initializes an instance of AutoRestSwaggerConstantService client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param headerConstant Constant header property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param queryConstant Constant query property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param pathConstant Constant path property on the client that is a required parameter for operation
     * 'constants_putClientConstants'.
     * @param host server parameter.
     */
    AutoRestSwaggerConstantService(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        boolean headerConstant, int queryConstant, String pathConstant, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.headerConstant = headerConstant;
        this.queryConstant = queryConstant;
        this.pathConstant = pathConstant;
        this.host = host;
        this.contants = new Contants(this);
    }
}
