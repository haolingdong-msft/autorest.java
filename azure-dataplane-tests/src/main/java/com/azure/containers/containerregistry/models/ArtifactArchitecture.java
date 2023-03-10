// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** The artifact platform's architecture. */
public final class ArtifactArchitecture extends ExpandableStringEnum<ArtifactArchitecture> {
    /** i386. */
    public static final ArtifactArchitecture I386 = fromString("386");

    /** AMD64. */
    public static final ArtifactArchitecture AMD64 = fromString("amd64");

    /** ARM. */
    public static final ArtifactArchitecture ARM = fromString("arm");

    /** ARM64. */
    public static final ArtifactArchitecture ARM64 = fromString("arm64");

    /** MIPS. */
    public static final ArtifactArchitecture MIPS = fromString("mips");

    /** MIPSLE. */
    public static final ArtifactArchitecture MIPS_LE = fromString("mipsle");

    /** MIPS64. */
    public static final ArtifactArchitecture MIPS64 = fromString("mips64");

    /** MIPS64LE. */
    public static final ArtifactArchitecture MIPS64LE = fromString("mips64le");

    /** PPC64. */
    public static final ArtifactArchitecture PPC64 = fromString("ppc64");

    /** PPC64LE. */
    public static final ArtifactArchitecture PPC64LE = fromString("ppc64le");

    /** RISCv64. */
    public static final ArtifactArchitecture RISC_V64 = fromString("riscv64");

    /** s390x. */
    public static final ArtifactArchitecture S390X = fromString("s390x");

    /** Wasm. */
    public static final ArtifactArchitecture WASM = fromString("wasm");

    /**
     * Creates a new instance of ArtifactArchitecture value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ArtifactArchitecture() {}

    /**
     * Creates or finds a ArtifactArchitecture from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArtifactArchitecture.
     */
    public static ArtifactArchitecture fromString(String name) {
        return fromString(name, ArtifactArchitecture.class);
    }

    /**
     * Gets known ArtifactArchitecture values.
     *
     * @return known ArtifactArchitecture values.
     */
    public static Collection<ArtifactArchitecture> values() {
        return values(ArtifactArchitecture.class);
    }
}
