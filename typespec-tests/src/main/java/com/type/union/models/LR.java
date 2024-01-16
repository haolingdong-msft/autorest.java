// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * <!-- start generated doc -->
 * Defines values for LR.
 * <!-- end generated doc -->
 */
public final class LR extends ExpandableStringEnum<LR> {
    /**
     * Static value left for LR.
     */
    @Generated
    public static final LR LEFT = fromString("left");

    /**
     * Static value right for LR.
     */
    @Generated
    public static final LR RIGHT = fromString("right");

    /**
     * Creates a new instance of LR value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public LR() {
    }

    /**
     * Creates or finds a LR from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LR.
     */
    @Generated
    public static LR fromString(String name) {
        return fromString(name, LR.class);
    }

    /**
     * Gets known LR values.
     * 
     * @return known LR values.
     */
    @Generated
    public static Collection<LR> values() {
        return values(LR.class);
    }
}
