// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.servicebus.factory;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.credential.TokenCredential;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.spring.core.credential.descriptor.AuthenticationDescriptor;
import com.azure.spring.core.credential.descriptor.NamedKeyAuthenticationDescriptor;
import com.azure.spring.core.credential.descriptor.SasAuthenticationDescriptor;
import com.azure.spring.core.credential.descriptor.TokenAuthenticationDescriptor;
import com.azure.spring.core.factory.AbstractAzureAmqpClientBuilderFactory;
import com.azure.spring.core.properties.AzureProperties;
import com.azure.spring.service.servicebus.properties.ServiceBusCommonDescriptor;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * Abstract Service Bus client builder factory, it builds the {@link ServiceBusClientBuilder} sub client.
 */
public abstract class AbstractServiceBusSubClientBuilderFactory<T, P extends ServiceBusCommonDescriptor> extends AbstractAzureAmqpClientBuilderFactory<T> {

    protected final P properties;
    protected final ServiceBusClientBuilder serviceBusClientBuilder;
    protected final boolean shareServiceBusClientBuilder;

    public AbstractServiceBusSubClientBuilderFactory(P properties) {
        this(null, properties);
    }

    public AbstractServiceBusSubClientBuilderFactory(ServiceBusClientBuilder serviceBusClientBuilder,
                                                     P properties) {
        this.properties = properties;
        if (serviceBusClientBuilder != null) {
            this.serviceBusClientBuilder = serviceBusClientBuilder;
            this.shareServiceBusClientBuilder = true;
        } else {
            this.serviceBusClientBuilder = new ServiceBusClientBuilder();
            this.shareServiceBusClientBuilder = false;
        }
    }


    @Override
    protected BiConsumer<T, ProxyOptions> consumeProxyOptions() {
        return (builder, proxy) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.proxyOptions(proxy);
            }
        };
    }

    @Override
    protected BiConsumer<T, AmqpTransportType> consumeAmqpTransportType() {
        return (builder, t) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.transportType(t);
            }
        };
    }

    @Override
    protected BiConsumer<T, AmqpRetryOptions> consumeAmqpRetryOptions() {
        return (builder, retry) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.retryOptions(retry);
            }
        };
    }

    @Override
    protected BiConsumer<T, ClientOptions> consumeClientOptions() {
        return (builder, client) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.clientOptions(client);
            }
        };
    }

    @Override
    protected AzureProperties getAzureProperties() {
        return this.properties;
    }

    @Override
    protected List<AuthenticationDescriptor<?>> getAuthenticationDescriptors(T builder) {
        return Arrays.asList(
            new NamedKeyAuthenticationDescriptor(provider -> {
                if (!this.shareServiceBusClientBuilder) {
                    this.serviceBusClientBuilder.credential(properties.getFQDN(),
                        provider.getCredential());
                }
            }),
            new SasAuthenticationDescriptor(provider -> {
                if (!this.shareServiceBusClientBuilder) {
                    this.serviceBusClientBuilder.credential(properties.getFQDN(),
                        provider.getCredential());
                }
            }),
            new TokenAuthenticationDescriptor(provider -> {
                if (!this.shareServiceBusClientBuilder) {
                    this.serviceBusClientBuilder.credential(properties.getFQDN(),
                        provider.getCredential());
                }
            })
        );
    }

    @Override
    protected BiConsumer<T, Configuration> consumeConfiguration() {
        return (builder, configuration) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.configuration(configuration);
            }
        };
    }

    @Override
    protected BiConsumer<T, TokenCredential> consumeDefaultTokenCredential() {
        return (builder, credential) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.credential(this.properties.getFQDN(), credential);
            }
        };
    }

    @Override
    protected BiConsumer<T, String> consumeConnectionString() {
        return (builder, connectionString) -> {
            if (!this.shareServiceBusClientBuilder) {
                this.serviceBusClientBuilder.connectionString(connectionString);
            }
        };
    }
}