// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.model.clientmodel;

import java.util.Set;

/**
 * Access to the client model property.
 */
public interface ClientModelPropertyAccess {

    String getName();

    String getDescription();

    String getGetterName();

    String getSetterName();

    IType getClientType();

    IType getWireType();

    boolean getIsReadOnly();

    boolean getIsReadOnlyForCreate();

    boolean getIsReadOnlyForUpdate();

    boolean isRequired();

    boolean getIsConstant();

    void addImportsTo(Set<String> imports, boolean shouldGenerateXmlSerialization);
}
