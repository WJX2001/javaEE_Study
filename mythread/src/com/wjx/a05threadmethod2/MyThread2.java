package com.wjx.a05threadmethod2;

public class MyThread2 extends Thread{
  @Override
  public void run() {

    for (int i = 0; i < 100; i++) {
      System.out.println(getName() + "@" + i);
    }
  }
}
