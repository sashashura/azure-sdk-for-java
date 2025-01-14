// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A restorable dropped managed database resource. */
@Fluent
public final class RestorableDroppedManagedDatabaseInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private RestorableDroppedManagedDatabaseProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private RestorableDroppedManagedDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RestorableDroppedManagedDatabaseInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestorableDroppedManagedDatabaseInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     *
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().deletionDate();
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.innerProperties() == null ? null : this.innerProperties().earliestRestoreDate();
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
