// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.scalar.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * <!-- start generated doc -->
 * Initializes a new instance of the ScalarClient type.
 * <!-- end generated doc -->
 */
public final class ScalarClientImpl {
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
     * The StringOperationsImpl object to access its operations.
     */
    private final StringOperationsImpl stringOperations;

    /**
     * Gets the StringOperationsImpl object to access its operations.
     * 
     * @return the StringOperationsImpl object.
     */
    public StringOperationsImpl getStringOperations() {
        return this.stringOperations;
    }

    /**
     * The BooleanOperationsImpl object to access its operations.
     */
    private final BooleanOperationsImpl booleanOperations;

    /**
     * Gets the BooleanOperationsImpl object to access its operations.
     * 
     * @return the BooleanOperationsImpl object.
     */
    public BooleanOperationsImpl getBooleanOperations() {
        return this.booleanOperations;
    }

    /**
     * The UnknownsImpl object to access its operations.
     */
    private final UnknownsImpl unknowns;

    /**
     * Gets the UnknownsImpl object to access its operations.
     * 
     * @return the UnknownsImpl object.
     */
    public UnknownsImpl getUnknowns() {
        return this.unknowns;
    }

    /**
     * The DecimalTypesImpl object to access its operations.
     */
    private final DecimalTypesImpl decimalTypes;

    /**
     * Gets the DecimalTypesImpl object to access its operations.
     * 
     * @return the DecimalTypesImpl object.
     */
    public DecimalTypesImpl getDecimalTypes() {
        return this.decimalTypes;
    }

    /**
     * The Decimal128TypesImpl object to access its operations.
     */
    private final Decimal128TypesImpl decimal128Types;

    /**
     * Gets the Decimal128TypesImpl object to access its operations.
     * 
     * @return the Decimal128TypesImpl object.
     */
    public Decimal128TypesImpl getDecimal128Types() {
        return this.decimal128Types;
    }

    /**
     * The DecimalVerifiesImpl object to access its operations.
     */
    private final DecimalVerifiesImpl decimalVerifies;

    /**
     * Gets the DecimalVerifiesImpl object to access its operations.
     * 
     * @return the DecimalVerifiesImpl object.
     */
    public DecimalVerifiesImpl getDecimalVerifies() {
        return this.decimalVerifies;
    }

    /**
     * The Decimal128VerifiesImpl object to access its operations.
     */
    private final Decimal128VerifiesImpl decimal128Verifies;

    /**
     * Gets the Decimal128VerifiesImpl object to access its operations.
     * 
     * @return the Decimal128VerifiesImpl object.
     */
    public Decimal128VerifiesImpl getDecimal128Verifies() {
        return this.decimal128Verifies;
    }

    /**
     * Initializes an instance of ScalarClient client.
     */
    public ScalarClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of ScalarClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ScalarClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter());
    }

    /**
     * Initializes an instance of ScalarClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     */
    public ScalarClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.stringOperations = new StringOperationsImpl(this);
        this.booleanOperations = new BooleanOperationsImpl(this);
        this.unknowns = new UnknownsImpl(this);
        this.decimalTypes = new DecimalTypesImpl(this);
        this.decimal128Types = new Decimal128TypesImpl(this);
        this.decimalVerifies = new DecimalVerifiesImpl(this);
        this.decimal128Verifies = new Decimal128VerifiesImpl(this);
    }
}
