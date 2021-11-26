// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.BackupSchedule;
import com.azure.resourcemanager.appservice.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a backup which will be performed. */
@Fluent
public final class BackupRequestInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupRequestInner.class);

    /*
     * BackupRequest resource specific properties
     */
    @JsonProperty(value = "properties")
    private BackupRequestProperties innerProperties;

    /**
     * Get the innerProperties property: BackupRequest resource specific properties.
     *
     * @return the innerProperties value.
     */
    private BackupRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public BackupRequestInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the backupName property: Name of the backup.
     *
     * @return the backupName value.
     */
    public String backupName() {
        return this.innerProperties() == null ? null : this.innerProperties().backupName();
    }

    /**
     * Set the backupName property: Name of the backup.
     *
     * @param backupName the backupName value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupName(String backupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withBackupName(backupName);
        return this;
    }

    /**
     * Get the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     *
     * @param enabled the enabled value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the storageAccountUrl property: SAS URL to the container.
     *
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountUrl();
    }

    /**
     * Set the storageAccountUrl property: SAS URL to the container.
     *
     * @param storageAccountUrl the storageAccountUrl value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withStorageAccountUrl(String storageAccountUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withStorageAccountUrl(storageAccountUrl);
        return this;
    }

    /**
     * Get the backupSchedule property: Schedule for the backup if it is executed periodically.
     *
     * @return the backupSchedule value.
     */
    public BackupSchedule backupSchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().backupSchedule();
    }

    /**
     * Set the backupSchedule property: Schedule for the backup if it is executed periodically.
     *
     * @param backupSchedule the backupSchedule value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withBackupSchedule(BackupSchedule backupSchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withBackupSchedule(backupSchedule);
        return this;
    }

    /**
     * Get the databases property: Databases included in the backup.
     *
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.innerProperties() == null ? null : this.innerProperties().databases();
    }

    /**
     * Set the databases property: Databases included in the backup.
     *
     * @param databases the databases value to set.
     * @return the BackupRequestInner object itself.
     */
    public BackupRequestInner withDatabases(List<DatabaseBackupSetting> databases) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupRequestProperties();
        }
        this.innerProperties().withDatabases(databases);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}