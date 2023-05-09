// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.multipleapiversion;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ServiceVersion;

/**
 * Service version of SecondClient.
 */
public enum SecondServiceVersion implements ServiceVersion {
    @Generated
    /**
     * Enum value 2022-10-01-preview.
     */
    V2022_10_01_PREVIEW("2022-10-01-preview");

    @Generated
    /**
     * Enum value 2022-12-01-preview.
     */
    V2022_12_01_PREVIEW("2022-12-01-preview");

    @Generated
    private final String version;

    @Generated
    SecondServiceVersion(String version) {
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
     * @return The latest {@link SecondServiceVersion}.
     */
    @Generated
    public static SecondServiceVersion getLatest() {
        return V2022_12_01_PREVIEW;
    }
}
