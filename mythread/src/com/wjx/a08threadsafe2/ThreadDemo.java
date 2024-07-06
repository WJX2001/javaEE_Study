package com.wjx.a08threadsafe2;

public class ThreadDemo {
  public static void main(String[] args) {
    // 使用同步方法实现卖票

    MyRunnable mr = new MyRunnable();

    Thread t1 = new Thread(mr);
    Thread t2 = new Thread(mr);
    Thread t3 = new Thread(mr);

    t1.setName("窗口1");
    t2.setName("窗口2");
    t3.setName("窗口3");

    t1.start();
    t2.start();
    t3.start();
  }
}
