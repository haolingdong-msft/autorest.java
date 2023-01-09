// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.openai.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Settings for the standard scale type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "scale_type")
@JsonTypeName("standard")
@Immutable
public final class StandardScaleSettings extends ScaleSettings {
    /** Creates an instance of StandardScaleSettings class. */
    public StandardScaleSettings() {}
}
