// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The server capability. */
@Fluent
public final class ServerVersionCapability {
    /*
     * The server version name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of supported database editions.
     */
    @JsonProperty(value = "supportedEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<EditionCapability> supportedEditions;

    /*
     * The list of supported elastic pool editions.
     */
    @JsonProperty(value = "supportedElasticPoolEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ElasticPoolEditionCapability> supportedElasticPoolEditions;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the name property: The server version name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedEditions property: The list of supported database editions.
     *
     * @return the supportedEditions value.
     */
    public List<EditionCapability> supportedEditions() {
        return this.supportedEditions;
    }

    /**
     * Get the supportedElasticPoolEditions property: The list of supported elastic pool editions.
     *
     * @return the supportedElasticPoolEditions value.
     */
    public List<ElasticPoolEditionCapability> supportedElasticPoolEditions() {
        return this.supportedElasticPoolEditions;
    }

    /**
     * Get the status property: The status of the capability.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     *
     * @param reason the reason value to set.
     * @return the ServerVersionCapability object itself.
     */
    public ServerVersionCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedEditions() != null) {
            supportedEditions().forEach(e -> e.validate());
        }
        if (supportedElasticPoolEditions() != null) {
            supportedElasticPoolEditions().forEach(e -> e.validate());
        }
    }
}
