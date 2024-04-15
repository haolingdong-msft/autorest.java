// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.flatten.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.cadl.flatten.models.FileDataFileDetails;

/**
 * The UploadFileRequest model.
 */
@Immutable
public final class UploadFileRequest {
    /*
     * The file_data property.
     */
    @Generated
    private final FileDataFileDetails fileData;

    /*
     * The readOnly property.
     */
    @Generated
    private String readOnly;

    /*
     * The constant property.
     */
    @Generated
    private final String constant = "constant";

    /**
     * Creates an instance of UploadFileRequest class.
     * 
     * @param fileData the fileData value to set.
     */
    @Generated
    public UploadFileRequest(FileDataFileDetails fileData) {
        this.fileData = fileData;
    }

    /**
     * Get the fileData property: The file_data property.
     * 
     * @return the fileData value.
     */
    @Generated
    public FileDataFileDetails getFileData() {
        return this.fileData;
    }

    /**
     * Get the readOnly property: The readOnly property.
     * 
     * @return the readOnly value.
     */
    @Generated
    public String getReadOnly() {
        return this.readOnly;
    }

    /**
     * Get the constant property: The constant property.
     * 
     * @return the constant value.
     */
    @Generated
    public String getConstant() {
        return this.constant;
    }
}