// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.union;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ServiceVersion;

/**
 * Service version of UnionClient.
 */
public enum UnionServiceVersion implements ServiceVersion {
    @Generated
    /**
     * Enum value 2022-03-01-preview.
     */
    V2022_03_01_PREVIEW("2022-03-01-preview");

    @Generated
    /**
     * Enum value 2022-06-01-preview.
     */
    V2022_06_01_PREVIEW("2022-06-01-preview");

    @Generated
    private final String version;

    @Generated
    UnionServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Generated
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link UnionServiceVersion}.
     */
    @Generated
    public static UnionServiceVersion getLatest() {
        return V2022_06_01_PREVIEW;
    }
}
