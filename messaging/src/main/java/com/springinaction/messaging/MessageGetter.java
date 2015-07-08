package com.springinaction.messaging;

public class MessageGetter {
  public void echo(String string) {

    System.out.println("GOT A MESSAGE:  " + string);
  }

  public void echo(){
    System.out.println("GOT A MESSAGE:  ");
  }

  public void echo(Book book){

    System.out.println("GOT A MESSAGE:  "+ book.toString());
  }
}
