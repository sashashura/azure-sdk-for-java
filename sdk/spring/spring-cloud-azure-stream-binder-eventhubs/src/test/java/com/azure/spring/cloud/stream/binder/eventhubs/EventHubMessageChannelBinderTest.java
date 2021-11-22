// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
//package com.azure.spring.cloud.stream.binder.eventhubs;
//
//import com.azure.messaging.eventhubs.models.EventContext;
//import com.azure.spring.cloud.stream.binder.eventhubs.properties.EventHubProducerProperties;
//import com.azure.spring.cloud.stream.binder.eventhubs.provisioning.EventHubProducerDestination;
//import com.azure.spring.eventhubs.core.EventHubClientFactory;
//import com.azure.spring.eventhubs.core.ProducerFactory;
//import com.azure.spring.integration.handler.DefaultMessageHandler;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.cloud.stream.binder.ExtendedProducerProperties;
//import org.springframework.cloud.stream.provisioning.ProducerDestination;
//import org.springframework.expression.Expression;
//import org.springframework.expression.ExpressionParser;
//import org.springframework.expression.spel.standard.SpelExpression;
//import org.springframework.expression.spel.standard.SpelExpressionParser;
//import org.springframework.messaging.MessageChannel;
//
//public class EventHubMessageChannelBinderTest {
//
//    @Mock
//    ProducerFactory producerFactory;
//
//    @Mock
//    EventContext eventContext;
//
//    private EventHubTestBinder binder;
//
//    private String destination = "dest";
//
//    @Mock
//    private MessageChannel messageChannel;
//
//    private ExtendedProducerProperties<EventHubProducerProperties> producerProperties;
//
//    private static final ExpressionParser EXPRESSION_PARSER = new SpelExpressionParser();
//
//    private static final String PARTITION_HEADER = "headers['scst_partition']";
//
//    @BeforeEach
//    public void setUp() {
//        this.binder = new EventHubTestBinder(new EventHubsTestTemplate(producerFactory, () -> eventContext));
//        this.producerProperties = new ExtendedProducerProperties<>(new EventHubProducerProperties());
//    }
//
//    @Test
//    public void testCreateProducerMessageHandlerWithSetPartitionIdExpression() {
//        ProducerDestination producerDestination = new EventHubProducerDestination(destination);
//        Expression payloadExpression = EXPRESSION_PARSER.parseExpression("payload.test");
//        producerProperties.setPartitionKeyExpression(payloadExpression);
//        DefaultMessageHandler messageHandler =
//            (DefaultMessageHandler) this.binder.getBinder()
//                                               .createProducerMessageHandler(producerDestination,
//                                                   producerProperties, messageChannel);
//        Assertions.assertThat(messageHandler)
//                  .extracting("partitionIdExpression")
//                  .returns(PARTITION_HEADER,
//                      exp -> ((SpelExpression) exp).getExpressionString());
//        Assertions.assertThat(messageHandler).hasFieldOrPropertyWithValue("partitionKeyExpression", null);
//    }
//
//    @Test
//    public void testCreateProducerMessageHandlerWithSetPartitionKeyExpression() {
//        ProducerDestination producerDestination = new EventHubProducerDestination(destination);
//        DefaultMessageHandler messageHandler =
//            (DefaultMessageHandler) this.binder.getBinder()
//                                               .createProducerMessageHandler(producerDestination,
//                                                   producerProperties, messageChannel);
//        Assertions.assertThat(messageHandler)
//                  .extracting("partitionKeyExpression")
//                  .returns(true, exp -> exp != null);
//        Assertions.assertThat(messageHandler).hasFieldOrPropertyWithValue("partitionIdExpression", null);
//    }
//}