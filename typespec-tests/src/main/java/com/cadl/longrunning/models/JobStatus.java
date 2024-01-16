// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.longrunning.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for JobStatus.
 */
public final class JobStatus extends ExpandableStringEnum<JobStatus> {
    /**
     * Static value notStarted for JobStatus.
     */
    @Generated
    public static final JobStatus NOT_STARTED = fromString("notStarted");

    /**
     * Static value running for JobStatus.
     */
    @Generated
    public static final JobStatus RUNNING = fromString("running");

    /**
     * Static value succeeded for JobStatus.
     */
    @Generated
    public static final JobStatus SUCCEEDED = fromString("succeeded");

    /**
     * Static value failed for JobStatus.
     */
    @Generated
    public static final JobStatus FAILED = fromString("failed");

    /**
     * Static value canceled for JobStatus.
     */
    @Generated
    public static final JobStatus CANCELED = fromString("canceled");

    /**
     * Creates a new instance of JobStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public JobStatus() {
    }

    /**
     * Creates or finds a JobStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JobStatus.
     */
    @Generated
    public static JobStatus fromString(String name) {
        return fromString(name, JobStatus.class);
    }

    /**
     * Gets known JobStatus values.
     * 
     * @return known JobStatus values.
     */
    @Generated
    public static Collection<JobStatus> values() {
        return values(JobStatus.class);
    }
}
