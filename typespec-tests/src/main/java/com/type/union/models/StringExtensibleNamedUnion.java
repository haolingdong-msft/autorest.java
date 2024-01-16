// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * <!-- start generated doc -->
 * Defines values for StringExtensibleNamedUnion.
 * <!-- end generated doc -->
 */
public final class StringExtensibleNamedUnion extends ExpandableStringEnum<StringExtensibleNamedUnion> {
    /**
     * Static value b for StringExtensibleNamedUnion.
     */
    @Generated
    public static final StringExtensibleNamedUnion B = fromString("b");

    /**
     * Static value c for StringExtensibleNamedUnion.
     */
    @Generated
    public static final StringExtensibleNamedUnion C = fromString("c");

    /**
     * Creates a new instance of StringExtensibleNamedUnion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public StringExtensibleNamedUnion() {
    }

    /**
     * Creates or finds a StringExtensibleNamedUnion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StringExtensibleNamedUnion.
     */
    @Generated
    public static StringExtensibleNamedUnion fromString(String name) {
        return fromString(name, StringExtensibleNamedUnion.class);
    }

    /**
     * Gets known StringExtensibleNamedUnion values.
     * 
     * @return known StringExtensibleNamedUnion values.
     */
    @Generated
    public static Collection<StringExtensibleNamedUnion> values() {
        return values(StringExtensibleNamedUnion.class);
    }
}
