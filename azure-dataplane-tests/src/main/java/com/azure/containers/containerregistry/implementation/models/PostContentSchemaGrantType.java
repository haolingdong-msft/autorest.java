// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * <!-- start generated doc -->
 * Can take a value of access_token_refresh_token, or access_token, or refresh_token.
 * <!-- end generated doc -->
 */
public final class PostContentSchemaGrantType extends ExpandableStringEnum<PostContentSchemaGrantType> {
    /**
     * Static value access_token_refresh_token for PostContentSchemaGrantType.
     */
    public static final PostContentSchemaGrantType ACCESS_TOKEN_REFRESH_TOKEN
        = fromString("access_token_refresh_token");

    /**
     * Static value access_token for PostContentSchemaGrantType.
     */
    public static final PostContentSchemaGrantType ACCESS_TOKEN = fromString("access_token");

    /**
     * Static value refresh_token for PostContentSchemaGrantType.
     */
    public static final PostContentSchemaGrantType REFRESH_TOKEN = fromString("refresh_token");

    /**
     * Creates a new instance of PostContentSchemaGrantType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PostContentSchemaGrantType() {
    }

    /**
     * Creates or finds a PostContentSchemaGrantType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PostContentSchemaGrantType.
     */
    public static PostContentSchemaGrantType fromString(String name) {
        return fromString(name, PostContentSchemaGrantType.class);
    }

    /**
     * Gets known PostContentSchemaGrantType values.
     * 
     * @return known PostContentSchemaGrantType values.
     */
    public static Collection<PostContentSchemaGrantType> values() {
        return values(PostContentSchemaGrantType.class);
    }
}
