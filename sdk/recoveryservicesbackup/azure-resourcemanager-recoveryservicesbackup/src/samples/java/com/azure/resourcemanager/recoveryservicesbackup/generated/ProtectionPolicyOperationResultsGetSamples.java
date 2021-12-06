// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for ProtectionPolicyOperationResults Get. */
public final class ProtectionPolicyOperationResultsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2021-07-01/examples/AzureIaasVm/ProtectionPolicyOperationResults_Get.json
     */
    /**
     * Sample code: Get Protection Policy Operation Results.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectionPolicyOperationResults(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicyOperationResults()
            .getWithResponse(
                "NetSDKTestRsVault",
                "SwaggerTestRg",
                "testPolicy1",
                "00000000-0000-0000-0000-000000000000",
                Context.NONE);
    }
}