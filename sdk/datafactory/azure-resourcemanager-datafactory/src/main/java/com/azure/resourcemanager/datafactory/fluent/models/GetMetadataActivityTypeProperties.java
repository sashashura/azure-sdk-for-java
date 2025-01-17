// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.FormatReadSettings;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** GetMetadata activity properties. */
@Fluent
public final class GetMetadataActivityTypeProperties {
    /*
     * GetMetadata activity dataset reference.
     */
    @JsonProperty(value = "dataset", required = true)
    private DatasetReference dataset;

    /*
     * Fields of metadata to get from dataset.
     */
    @JsonProperty(value = "fieldList")
    private List<Object> fieldList;

    /*
     * GetMetadata activity store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /*
     * GetMetadata activity format settings.
     */
    @JsonProperty(value = "formatSettings")
    private FormatReadSettings formatSettings;

    /**
     * Get the dataset property: GetMetadata activity dataset reference.
     *
     * @return the dataset value.
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: GetMetadata activity dataset reference.
     *
     * @param dataset the dataset value to set.
     * @return the GetMetadataActivityTypeProperties object itself.
     */
    public GetMetadataActivityTypeProperties withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the fieldList property: Fields of metadata to get from dataset.
     *
     * @return the fieldList value.
     */
    public List<Object> fieldList() {
        return this.fieldList;
    }

    /**
     * Set the fieldList property: Fields of metadata to get from dataset.
     *
     * @param fieldList the fieldList value to set.
     * @return the GetMetadataActivityTypeProperties object itself.
     */
    public GetMetadataActivityTypeProperties withFieldList(List<Object> fieldList) {
        this.fieldList = fieldList;
        return this;
    }

    /**
     * Get the storeSettings property: GetMetadata activity store settings.
     *
     * @return the storeSettings value.
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: GetMetadata activity store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the GetMetadataActivityTypeProperties object itself.
     */
    public GetMetadataActivityTypeProperties withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: GetMetadata activity format settings.
     *
     * @return the formatSettings value.
     */
    public FormatReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: GetMetadata activity format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the GetMetadataActivityTypeProperties object itself.
     */
    public GetMetadataActivityTypeProperties withFormatSettings(FormatReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataset() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataset in model GetMetadataActivityTypeProperties"));
        } else {
            dataset().validate();
        }
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetMetadataActivityTypeProperties.class);
}
