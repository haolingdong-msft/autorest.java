// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.cadl.armresourceprovider.fluent.models.CustomTemplateResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of CustomTemplateResource.
 */
public interface CustomTemplateResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    CustomTemplateResourceProperties properties();

    /**
     * Gets the identity property: Managed identity.
     * 
     * @return the identity value.
     */
    ManagedIdentityProperties identity();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.cadl.armresourceprovider.fluent.models.CustomTemplateResourceInner object.
     * 
     * @return the inner object.
     */
    CustomTemplateResourceInner innerModel();

    /**
     * The entirety of the CustomTemplateResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The CustomTemplateResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the CustomTemplateResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the CustomTemplateResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties,
            DefinitionStages.WithIdentity, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            CustomTemplateResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomTemplateResource create(Context context);
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(CustomTemplateResourceProperties properties);
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identity..
             * 
             * @param identity Managed identity.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedIdentityProperties identity);
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The request should only proceed if an entity matches this string..
             * 
             * @param ifMatch The request should only proceed if an entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the CustomTemplateResource definition allowing to specify ifNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: The request should only proceed if no entity matches this string..
             * 
             * @param ifNoneMatch The request should only proceed if no entity matches this string.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }

    /**
     * Begins update for the CustomTemplateResource resource.
     * 
     * @return the stage of resource update.
     */
    CustomTemplateResource.Update update();

    /**
     * The template for CustomTemplateResource update.
     */
    interface Update extends UpdateStages.WithIdentity, UpdateStages.WithPropertyRemovedInStable {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        CustomTemplateResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomTemplateResource apply(Context context);
    }

    /**
     * The CustomTemplateResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the CustomTemplateResource update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identity..
             * 
             * @param identity Managed identity.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedIdentityProperties identity);
        }

        /**
         * The stage of the CustomTemplateResource update allowing to specify propertyRemovedInStable.
         */
        interface WithPropertyRemovedInStable {
            /**
             * Specifies the propertyRemovedInStable property: The propertyRemovedInStable property..
             * 
             * @param propertyRemovedInStable The propertyRemovedInStable property.
             * @return the next definition stage.
             */
            Update withPropertyRemovedInStable(String propertyRemovedInStable);
        }
    }
}
