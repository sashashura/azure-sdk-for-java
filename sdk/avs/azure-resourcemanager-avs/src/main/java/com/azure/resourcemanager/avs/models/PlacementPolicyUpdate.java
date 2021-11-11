// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.models.PlacementPolicyUpdateProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An update of a DRS placement policy resource. */
@Fluent
public final class PlacementPolicyUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PlacementPolicyUpdate.class);

    /*
     * The properties of a placement policy resource that may be updated
     */
    @JsonProperty(value = "properties")
    private PlacementPolicyUpdateProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a placement policy resource that may be updated.
     *
     * @return the innerProperties value.
     */
    private PlacementPolicyUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: Whether the placement policy is enabled or disabled.
     *
     * @return the state value.
     */
    public PlacementPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Whether the placement policy is enabled or disabled.
     *
     * @param state the state value to set.
     * @return the PlacementPolicyUpdate object itself.
     */
    public PlacementPolicyUpdate withState(PlacementPolicyState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PlacementPolicyUpdateProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the vmMembers property: Virtual machine members list.
     *
     * @return the vmMembers value.
     */
    public List<String> vmMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().vmMembers();
    }

    /**
     * Set the vmMembers property: Virtual machine members list.
     *
     * @param vmMembers the vmMembers value to set.
     * @return the PlacementPolicyUpdate object itself.
     */
    public PlacementPolicyUpdate withVmMembers(List<String> vmMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PlacementPolicyUpdateProperties();
        }
        this.innerProperties().withVmMembers(vmMembers);
        return this;
    }

    /**
     * Get the hostMembers property: Host members list.
     *
     * @return the hostMembers value.
     */
    public List<String> hostMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().hostMembers();
    }

    /**
     * Set the hostMembers property: Host members list.
     *
     * @param hostMembers the hostMembers value to set.
     * @return the PlacementPolicyUpdate object itself.
     */
    public PlacementPolicyUpdate withHostMembers(List<String> hostMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PlacementPolicyUpdateProperties();
        }
        this.innerProperties().withHostMembers(hostMembers);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}