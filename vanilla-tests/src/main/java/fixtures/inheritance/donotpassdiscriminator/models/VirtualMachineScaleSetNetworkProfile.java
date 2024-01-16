// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.inheritance.donotpassdiscriminator.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * <!-- start generated doc -->
 * Describes a virtual machine scale set network profile.
 * <!-- end generated doc -->
 */
@Fluent
public final class VirtualMachineScaleSetNetworkProfile {
    /*
     * The list of network configurations.
     */
    @JsonProperty(value = "networkInterfaceConfigurations")
    private List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations;

    /**
     * Creates an instance of VirtualMachineScaleSetNetworkProfile class.
     */
    public VirtualMachineScaleSetNetworkProfile() {
    }

    /**
     * Get the networkInterfaceConfigurations property: The list of network configurations.
     * 
     * @return the networkInterfaceConfigurations value.
     */
    public List<VirtualMachineScaleSetNetworkConfiguration> getNetworkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations;
    }

    /**
     * Set the networkInterfaceConfigurations property: The list of network configurations.
     * 
     * @param networkInterfaceConfigurations the networkInterfaceConfigurations value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile setNetworkInterfaceConfigurations(
        List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getNetworkInterfaceConfigurations() != null) {
            getNetworkInterfaceConfigurations().forEach(e -> e.validate());
        }
    }
}
