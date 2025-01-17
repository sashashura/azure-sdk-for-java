// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents an Asset used as a JobOutput. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.JobOutputAsset")
@Fluent
public final class JobOutputAsset extends JobOutput {
    /*
     * The name of the output Asset.
     */
    @JsonProperty(value = "assetName", required = true)
    private String assetName;

    /**
     * Get the assetName property: The name of the output Asset.
     *
     * @return the assetName value.
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the assetName property: The name of the output Asset.
     *
     * @param assetName the assetName value to set.
     * @return the JobOutputAsset object itself.
     */
    public JobOutputAsset withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobOutputAsset withPresetOverride(Preset presetOverride) {
        super.withPresetOverride(presetOverride);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JobOutputAsset withLabel(String label) {
        super.withLabel(label);
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
        if (assetName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property assetName in model JobOutputAsset"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobOutputAsset.class);
}
