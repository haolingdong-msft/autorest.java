// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.nullable.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.type.property.nullable.implementation.JsonMergePatchHelper;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Model with collection models properties.
 */
@Immutable
public final class CollectionsModelProperty {
    /*
     * Required property
     */
    @Generated
    @JsonProperty(value = "requiredProperty")
    private String requiredProperty;

    /*
     * Property
     */
    @Generated
    @JsonProperty(value = "nullableProperty")
    private List<InnerModel> nullableProperty;

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJmp(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setCollectionsModelPropertyAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJmp(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of CollectionsModelProperty class.
     * 
     * @param requiredProperty the requiredProperty value to set.
     * @param nullableProperty the nullableProperty value to set.
     */
    @Generated
    @JsonCreator
    public CollectionsModelProperty(@JsonProperty(value = "requiredProperty") String requiredProperty,
        @JsonProperty(value = "nullableProperty") List<InnerModel> nullableProperty) {
        this.requiredProperty = requiredProperty;
        this.nullableProperty = nullableProperty;
    }

    /**
     * Get the requiredProperty property: Required property.
     * 
     * @return the requiredProperty value.
     */
    @Generated
    public String getRequiredProperty() {
        return this.requiredProperty;
    }

    /**
     * Get the nullableProperty property: Property.
     * 
     * @return the nullableProperty value.
     */
    @Generated
    public List<InnerModel> getNullableProperty() {
        return this.nullableProperty;
    }
}
