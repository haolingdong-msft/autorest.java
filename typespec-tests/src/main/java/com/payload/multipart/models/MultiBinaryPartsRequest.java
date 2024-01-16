// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.payload.multipart.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;

/**
 * <!-- start generated doc -->
 * The MultiBinaryPartsRequest model.
 * <!-- end generated doc -->
 */
@Fluent
public final class MultiBinaryPartsRequest {
    /*
     * The profileImage property.
     */
    @Generated
    private final BinaryData profileImage;

    /*
     * The filename for profileImage
     */
    @Generated
    private String profileImageFilename = "profileImage";

    /*
     * The picture property.
     */
    @Generated
    private BinaryData picture;

    /*
     * The filename for picture
     */
    @Generated
    private String pictureFilename = "picture";

    /**
     * Creates an instance of MultiBinaryPartsRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    @Generated
    public MultiBinaryPartsRequest(BinaryData profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    @Generated
    public BinaryData getProfileImage() {
        return this.profileImage;
    }

    /**
     * Get the profileImageFilename property: The filename for profileImage.
     * 
     * @return the profileImageFilename value.
     */
    @Generated
    public String getProfileImageFilename() {
        return this.profileImageFilename;
    }

    /**
     * Set the profileImageFilename property: The filename for profileImage.
     * 
     * @param profileImageFilename the profileImageFilename value to set.
     * @return the MultiBinaryPartsRequest object itself.
     */
    @Generated
    public MultiBinaryPartsRequest setProfileImageFilename(String profileImageFilename) {
        this.profileImageFilename = profileImageFilename;
        return this;
    }

    /**
     * Get the picture property: The picture property.
     * 
     * @return the picture value.
     */
    @Generated
    public BinaryData getPicture() {
        return this.picture;
    }

    /**
     * Set the picture property: The picture property.
     * 
     * @param picture the picture value to set.
     * @return the MultiBinaryPartsRequest object itself.
     */
    @Generated
    public MultiBinaryPartsRequest setPicture(BinaryData picture) {
        this.picture = picture;
        return this;
    }

    /**
     * Get the pictureFilename property: The filename for picture.
     * 
     * @return the pictureFilename value.
     */
    @Generated
    public String getPictureFilename() {
        return this.pictureFilename;
    }

    /**
     * Set the pictureFilename property: The filename for picture.
     * 
     * @param pictureFilename the pictureFilename value to set.
     * @return the MultiBinaryPartsRequest object itself.
     */
    @Generated
    public MultiBinaryPartsRequest setPictureFilename(String pictureFilename) {
        this.pictureFilename = pictureFilename;
        return this;
    }
}
