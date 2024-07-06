package com.wjx.a12practice.practiceDemo1;

public class MyRunnable implements Runnable {

  static int tickets = 1000;

  @Override
  public void run() {
    while (true) {
      synchronized (MyRunnable.class) {
        if (tickets > 0) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          tickets--;
          System.out.println(Thread.currentThread().getName()+"正在卖第" + tickets + "张票");

        }else {
          System.out.println("票卖完了");
          break;
        }
      }
    }
  }
}
