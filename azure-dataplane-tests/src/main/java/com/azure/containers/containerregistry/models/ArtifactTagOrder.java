// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Sort options for ordering tags in a collection.
 */
public final class ArtifactTagOrder extends ExpandableStringEnum<ArtifactTagOrder> {
    /**
     * Do not provide an orderby value in the request.
     */
    public static final ArtifactTagOrder NONE = fromString("none");

    /**
     * Order tags by LastUpdatedOn field, from most recently updated to least recently updated.
     */
    public static final ArtifactTagOrder LAST_UPDATED_ON_DESCENDING = fromString("timedesc");

    /**
     * Order tags by LastUpdatedOn field, from least recently updated to most recently updated.
     */
    public static final ArtifactTagOrder LAST_UPDATED_ON_ASCENDING = fromString("timeasc");

    /**
     * Creates a new instance of ArtifactTagOrder value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ArtifactTagOrder() {
    }

    /**
     * Creates or finds a ArtifactTagOrder from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ArtifactTagOrder.
     */
    public static ArtifactTagOrder fromString(String name) {
        return fromString(name, ArtifactTagOrder.class);
    }

    /**
     * Gets known ArtifactTagOrder values.
     * 
     * @return known ArtifactTagOrder values.
     */
    public static Collection<ArtifactTagOrder> values() {
        return values(ArtifactTagOrder.class);
    }
}
