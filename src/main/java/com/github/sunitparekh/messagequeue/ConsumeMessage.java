package com.github.sunitparekh.messagequeue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage {

    @JmsListener(destination = "sampleQueue")
    public void receiveQueue(String text) {
        System.out.println("**************************");
        System.out.println(text);
    }
}
