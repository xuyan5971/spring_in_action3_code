package com.springinaction.messaging;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by R9 on 2015/7/8.
 */
public class ConventionalSenderReceiverTest {
    @Test
    public void testSend(){
        new ConventionalSender().send();

        assertEquals(new ConventionalReceiver().receive(),"Hello world!");
    }
}
