// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.adp.datamanagement.implementation.models;

import com.adp.datamanagement.models.UploadDataFile;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged collection of UploadDataFile items. */
@Immutable
public final class PagedUploadDataFile {
    /*
     * The UploadDataFile items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<UploadDataFile> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of PagedUploadDataFile class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    private PagedUploadDataFile(@JsonProperty(value = "value", required = true) List<UploadDataFile> value) {
        this.value = value;
    }

    /**
     * Get the value property: The UploadDataFile items on this page.
     *
     * @return the value value.
     */
    public List<UploadDataFile> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
