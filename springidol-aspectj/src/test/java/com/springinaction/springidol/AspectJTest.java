package com.springinaction.springidol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("spring-aspectj.xml")
@ContextConfiguration("spring-aspectj.xml")
public class AspectJTest {
  @Autowired
  ApplicationContext context;

  @Test
  public void audienceShouldApplaud() throws Exception {
    //ApplicationContext context = new ClassPathXmlApplicationContext("spring-aspectj.xml");
   // ApplicationContext context = new FileSystemXmlApplicationContext("L:\\work\\workspace\\spring_in_action3_code\\springidol-aspectj\\src\\main\\resources\\com\\springinaction\\springidol\\spring-aspectj.xml");
    //todo  ≤‚ ‘spring ◊¢»Îaspectj  Œ¥≥…π¶
    System.out.println("111");
    Performer eddie = (Performer) context.getBean("eddie");
    eddie.perform();
  }

  @Test
  public void eddieShouldBeAContestant() {
    //Contestant eddie = (Contestant) context.getBean("eddie");
    //eddie.receiveAward();
  }
}
