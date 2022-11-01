// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.adp.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Discovery resource creation parameters. */
@Immutable
public final class DiscoveryCreationParameters {
    /*
     * ID of the external package (for example, the disk which contained data) which was used upon the creation of
     * upload
     */
    @JsonProperty(value = "externalPackageId", access = JsonProperty.Access.WRITE_ONLY)
    private String externalPackageId;

    /** Creates an instance of DiscoveryCreationParameters class. */
    public DiscoveryCreationParameters() {}

    /**
     * Get the externalPackageId property: ID of the external package (for example, the disk which contained data) which
     * was used upon the creation of upload.
     *
     * @return the externalPackageId value.
     */
    public String getExternalPackageId() {
        return this.externalPackageId;
    }
}
