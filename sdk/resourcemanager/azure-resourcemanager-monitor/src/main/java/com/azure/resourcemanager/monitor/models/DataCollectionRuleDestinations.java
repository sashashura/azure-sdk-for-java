// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The specification of destinations. */
@Fluent
public final class DataCollectionRuleDestinations extends DestinationsSpec {
    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleDestinations withLogAnalytics(List<LogAnalyticsDestination> logAnalytics) {
        super.withLogAnalytics(logAnalytics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleDestinations withAzureMonitorMetrics(
        DestinationsSpecAzureMonitorMetrics azureMonitorMetrics) {
        super.withAzureMonitorMetrics(azureMonitorMetrics);
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
    }
}
