package com.springinaction.messaging;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class ConventionalSender {
  public void send(){
    //<start id="conventional_message_sender"/>
    ConnectionFactory cf =
            new ActiveMQConnectionFactory("tcp://localhost:61616");
    Connection conn = null;
    Session session = null;
    try {
      conn = cf.createConnection();
      session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
      Destination destination = new ActiveMQQueue("spitter.queue");
      MessageProducer producer = session.createProducer(destination);
      TextMessage message = session.createTextMessage();

      message.setText("Hello world!");
      producer.send(message);     //<co id="co_sendAMessage"/>
    } catch (JMSException e) {
      e.printStackTrace();
      // handle exception?
    } finally {
      try {
        if (session != null) {
          session.close();
        }
        if (conn != null) {
          conn.close();
        }
      } catch (JMSException ex) {
      }
    }
    //<end id="conventional_message_sender"/>
  }
  public static void main(String[] args) {
      new ConventionalSender().send();
  }
}
