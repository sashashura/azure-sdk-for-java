// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** App properties used for validation. */
@Fluent
public final class ValidateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateProperties.class);

    /*
     * ARM resource ID of an App Service plan that would host the app.
     */
    @JsonProperty(value = "serverFarmId")
    private String serverFarmId;

    /*
     * Name of the target SKU for the App Service plan.
     */
    @JsonProperty(value = "skuName")
    private String skuName;

    /*
     * <code>true</code> if App Service plan is for Linux workers; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "needLinuxWorkers")
    private Boolean needLinuxWorkers;

    /*
     * <code>true</code> if App Service plan is for Spot instances; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isSpot")
    private Boolean isSpot;

    /*
     * Target capacity of the App Service plan (number of VMs).
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /*
     * Name of App Service Environment where app or App Service plan should be
     * created.
     */
    @JsonProperty(value = "hostingEnvironment")
    private String hostingEnvironment;

    /*
     * <code>true</code> if App Service plan is running as a windows container
     */
    @JsonProperty(value = "isXenon")
    private Boolean isXenon;

    /**
     * Get the serverFarmId property: ARM resource ID of an App Service plan that would host the app.
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId property: ARM resource ID of an App Service plan that would host the app.
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the skuName property: Name of the target SKU for the App Service plan.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: Name of the target SKU for the App Service plan.
     *
     * @param skuName the skuName value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Get the needLinuxWorkers property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the needLinuxWorkers value.
     */
    public Boolean needLinuxWorkers() {
        return this.needLinuxWorkers;
    }

    /**
     * Set the needLinuxWorkers property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Linux workers;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param needLinuxWorkers the needLinuxWorkers value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withNeedLinuxWorkers(Boolean needLinuxWorkers) {
        this.needLinuxWorkers = needLinuxWorkers;
        return this;
    }

    /**
     * Get the isSpot property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isSpot value.
     */
    public Boolean isSpot() {
        return this.isSpot;
    }

    /**
     * Set the isSpot property: &lt;code&gt;true&lt;/code&gt; if App Service plan is for Spot instances; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isSpot the isSpot value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }

    /**
     * Get the capacity property: Target capacity of the App Service plan (number of VMs).
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Target capacity of the App Service plan (number of VMs).
     *
     * @param capacity the capacity value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the hostingEnvironment property: Name of App Service Environment where app or App Service plan should be
     * created.
     *
     * @return the hostingEnvironment value.
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment property: Name of App Service Environment where app or App Service plan should be
     * created.
     *
     * @param hostingEnvironment the hostingEnvironment value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /**
     * Get the isXenon property: &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set the isXenon property: &lt;code&gt;true&lt;/code&gt; if App Service plan is running as a windows container.
     *
     * @param isXenon the isXenon value to set.
     * @return the ValidateProperties object itself.
     */
    public ValidateProperties withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}