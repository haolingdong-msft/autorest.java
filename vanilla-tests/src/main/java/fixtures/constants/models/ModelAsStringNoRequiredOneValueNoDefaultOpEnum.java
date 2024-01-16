// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ModelAsStringNoRequiredOneValueNoDefaultOpEnum.
 */
public final class ModelAsStringNoRequiredOneValueNoDefaultOpEnum
    extends ExpandableStringEnum<ModelAsStringNoRequiredOneValueNoDefaultOpEnum> {
    /**
     * Static value value1 for ModelAsStringNoRequiredOneValueNoDefaultOpEnum.
     */
    public static final ModelAsStringNoRequiredOneValueNoDefaultOpEnum VALUE1 = fromString("value1");

    /**
     * Creates a new instance of ModelAsStringNoRequiredOneValueNoDefaultOpEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ModelAsStringNoRequiredOneValueNoDefaultOpEnum() {
    }

    /**
     * Creates or finds a ModelAsStringNoRequiredOneValueNoDefaultOpEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ModelAsStringNoRequiredOneValueNoDefaultOpEnum.
     */
    @JsonCreator
    public static ModelAsStringNoRequiredOneValueNoDefaultOpEnum fromString(String name) {
        return fromString(name, ModelAsStringNoRequiredOneValueNoDefaultOpEnum.class);
    }

    /**
     * Gets known ModelAsStringNoRequiredOneValueNoDefaultOpEnum values.
     * 
     * @return known ModelAsStringNoRequiredOneValueNoDefaultOpEnum values.
     */
    public static Collection<ModelAsStringNoRequiredOneValueNoDefaultOpEnum> values() {
        return values(ModelAsStringNoRequiredOneValueNoDefaultOpEnum.class);
    }
}
