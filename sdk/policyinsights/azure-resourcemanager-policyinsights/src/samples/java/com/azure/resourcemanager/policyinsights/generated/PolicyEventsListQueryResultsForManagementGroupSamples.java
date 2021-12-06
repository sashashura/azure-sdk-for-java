// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForManagementGroup. */
public final class PolicyEventsListQueryResultsForManagementGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyEvents_QueryManagementGroupScopeNextLink.json
     */
    /**
     * Sample code: Query at management group scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtManagementGroupScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForManagementGroup(
                "myManagementGroup", null, null, null, null, null, null, null, "WpmWfBSvPhkAK6QD", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyEvents_QueryManagementGroupScope.json
     */
    /**
     * Sample code: Query at management group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForManagementGroup(
                "myManagementGroup", null, null, null, null, null, null, null, null, Context.NONE);
    }
}