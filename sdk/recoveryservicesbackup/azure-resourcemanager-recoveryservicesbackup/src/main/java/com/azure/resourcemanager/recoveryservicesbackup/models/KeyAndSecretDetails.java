// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BEK is bitlocker key. KEK is encryption key for BEK If the VM was encrypted then we will store following details : 1.
 * Secret(BEK) - Url + Backup Data + vaultId. 2. Key(KEK) - Url + Backup Data + vaultId. 3. EncryptionMechanism BEK and
 * KEK can potentially have different vault ids.
 */
@Fluent
public final class KeyAndSecretDetails {
    /*
     * KEK is encryption key for BEK.
     */
    @JsonProperty(value = "kekDetails")
    private KekDetails kekDetails;

    /*
     * BEK is bitlocker encryption key.
     */
    @JsonProperty(value = "bekDetails")
    private BekDetails bekDetails;

    /*
     * Encryption mechanism: None/ SinglePass/ DoublePass
     */
    @JsonProperty(value = "encryptionMechanism")
    private String encryptionMechanism;

    /**
     * Get the kekDetails property: KEK is encryption key for BEK.
     *
     * @return the kekDetails value.
     */
    public KekDetails kekDetails() {
        return this.kekDetails;
    }

    /**
     * Set the kekDetails property: KEK is encryption key for BEK.
     *
     * @param kekDetails the kekDetails value to set.
     * @return the KeyAndSecretDetails object itself.
     */
    public KeyAndSecretDetails withKekDetails(KekDetails kekDetails) {
        this.kekDetails = kekDetails;
        return this;
    }

    /**
     * Get the bekDetails property: BEK is bitlocker encryption key.
     *
     * @return the bekDetails value.
     */
    public BekDetails bekDetails() {
        return this.bekDetails;
    }

    /**
     * Set the bekDetails property: BEK is bitlocker encryption key.
     *
     * @param bekDetails the bekDetails value to set.
     * @return the KeyAndSecretDetails object itself.
     */
    public KeyAndSecretDetails withBekDetails(BekDetails bekDetails) {
        this.bekDetails = bekDetails;
        return this;
    }

    /**
     * Get the encryptionMechanism property: Encryption mechanism: None/ SinglePass/ DoublePass.
     *
     * @return the encryptionMechanism value.
     */
    public String encryptionMechanism() {
        return this.encryptionMechanism;
    }

    /**
     * Set the encryptionMechanism property: Encryption mechanism: None/ SinglePass/ DoublePass.
     *
     * @param encryptionMechanism the encryptionMechanism value to set.
     * @return the KeyAndSecretDetails object itself.
     */
    public KeyAndSecretDetails withEncryptionMechanism(String encryptionMechanism) {
        this.encryptionMechanism = encryptionMechanism;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kekDetails() != null) {
            kekDetails().validate();
        }
        if (bekDetails() != null) {
            bekDetails().validate();
        }
    }
}
