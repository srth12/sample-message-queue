package com.github.sunitparekh.messagequeue;

import com.mockrunner.jms.ConfigurationManager;
import com.mockrunner.jms.DestinationManager;
import com.mockrunner.mock.jms.MockQueue;
import com.mockrunner.mock.jms.MockQueueConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@Profile("test")
@Configuration
public class MockJmsConfig {

    @Bean
    public ConnectionFactory connectionFactory(){
        return new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
    }

}
