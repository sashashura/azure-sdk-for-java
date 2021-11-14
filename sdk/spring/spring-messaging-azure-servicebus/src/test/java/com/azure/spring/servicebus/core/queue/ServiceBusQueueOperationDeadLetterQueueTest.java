// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.core.queue;

import com.azure.spring.messaging.checkpoint.CheckpointConfig;
import com.azure.spring.messaging.checkpoint.CheckpointMode;
import com.azure.spring.messaging.support.pojo.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

public class ServiceBusQueueOperationDeadLetterQueueTest extends ServiceBusQueueOperationSendSubscribeTest {

    private AutoCloseable closeable;

    @BeforeEach
    public void setup() {
        this.closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void close() throws Exception {
        closeable.close();
    }

    @Test
    public void testSendDeadLetterQueueWithoutManualCheckpointModel() {
        subscribe(destination, m -> sendSubscribeOperation.deadLetter(destination, m, "reason", "desc"), User.class);

        sendSubscribeOperation.sendAsync(destination, userMessage);
        verifyDeadLetterCalledTimes(1);
        verifyCompleteCalledTimes(1);
    }

    @Test
    public void testSendDeadLetterQueueWithManualCheckpointModel() {
        setCheckpointConfig(new CheckpointConfig(CheckpointMode.MANUAL));

        subscribe(destination, m -> sendSubscribeOperation.deadLetter(destination, m, "reason", "desc"), User.class);

        sendSubscribeOperation.sendAsync(destination, userMessage);

        verifyDeadLetterCalledTimes(1);
        verifyCompleteCalledTimes(0);
    }

}