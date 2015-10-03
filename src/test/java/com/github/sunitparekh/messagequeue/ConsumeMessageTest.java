package com.github.sunitparekh.messagequeue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ConsumeMessageTest {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    public void sampleMockMessageTest() throws Exception {
        jmsTemplate.send("sampleQueue", session -> {
            return session.createTextMessage("this is working... wow");
        });
        Thread.sleep(2000);
    }

}