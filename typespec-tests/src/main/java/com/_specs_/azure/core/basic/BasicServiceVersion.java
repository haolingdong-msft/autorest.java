// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.core.basic;

import com.azure.core.util.ServiceVersion;

/** Service version of BasicClient. */
public enum BasicServiceVersion implements ServiceVersion {
    /** Enum value 2022-12-01-preview. */
    V2022_12_01_PREVIEW("2022-12-01-preview");

    private final String version;

    BasicServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link BasicServiceVersion}.
     */
    public static BasicServiceVersion getLatest() {
        return V2022_12_01_PREVIEW;
    }
}
