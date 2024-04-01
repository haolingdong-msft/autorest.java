// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for GetResponseProp5.
 */
public final class GetResponseProp5 extends ExpandableStringEnum<GetResponseProp5> {
    /**
     * Static value b for GetResponseProp5.
     */
    @Generated
    public static final GetResponseProp5 B = fromString("b");

    /**
     * Static value c for GetResponseProp5.
     */
    @Generated
    public static final GetResponseProp5 C = fromString("c");

    /**
     * Creates a new instance of GetResponseProp5 value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public GetResponseProp5() {
    }

    /**
     * Creates or finds a GetResponseProp5 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GetResponseProp5.
     */
    @Generated
    public static GetResponseProp5 fromString(String name) {
        return fromString(name, GetResponseProp5.class);
    }

    /**
     * Gets known GetResponseProp5 values.
     * 
     * @return known GetResponseProp5 values.
     */
    @Generated
    public static Collection<GetResponseProp5> values() {
        return values(GetResponseProp5.class);
    }
}
