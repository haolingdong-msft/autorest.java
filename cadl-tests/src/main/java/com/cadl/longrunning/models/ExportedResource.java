// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.longrunning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExportedResource model. */
@Immutable
public final class ExportedResource {
    /*
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The resourceUri property.
     */
    @JsonProperty(value = "resourceUri", required = true)
    private String resourceUri;

    /**
     * Creates an instance of ExportedResource class.
     *
     * @param id the id value to set.
     * @param resourceUri the resourceUri value to set.
     */
    @JsonCreator
    private ExportedResource(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "resourceUri", required = true) String resourceUri) {
        this.id = id;
        this.resourceUri = resourceUri;
    }

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the resourceUri property: The resourceUri property.
     *
     * @return the resourceUri value.
     */
    public String getResourceUri() {
        return this.resourceUri;
    }
}
