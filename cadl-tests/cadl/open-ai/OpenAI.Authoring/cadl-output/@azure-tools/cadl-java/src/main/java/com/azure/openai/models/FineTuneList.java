// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.openai.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FineTuneList model. */
@Immutable
public final class FineTuneList {
    /*
     * Defines the type of this object
     */
    @JsonProperty(value = "object")
    private String object = "fine-tune";

    /*
     * The list of FineTunes
     */
    @JsonProperty(value = "data")
    private List<FineTune> data;

    /** Creates an instance of FineTuneList class. */
    private FineTuneList() {
        object = "fine-tune";
    }

    /**
     * Get the object property: Defines the type of this object.
     *
     * @return the object value.
     */
    public String getObject() {
        return this.object;
    }

    /**
     * Get the data property: The list of FineTunes.
     *
     * @return the data value.
     */
    public List<FineTune> getData() {
        return this.data;
    }
}
