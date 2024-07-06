package com.wjx.a06threadmethod5;

public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {

    /*
    *   插入线程/插队线程
    * */

    MyThread t = new MyThread();
    t.setName("土豆");
    t.start();

    // 把t这个线程插入到当前线程之前
    t.join();

    // 执行在main线程当中
    for (int i = 0; i < 10; i++) {
      System.out.println("main线程"+i);
    }
  }
}
