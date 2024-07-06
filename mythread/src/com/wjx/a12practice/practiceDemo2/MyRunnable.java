package com.wjx.a12practice.practiceDemo2;

public class MyRunnable implements Runnable {

  private static int gifts = 100;

  @Override
  public void run() {
    while (true) {
      synchronized (MyRunnable.class) { // 更改为 MyRunnable.class
        if (gifts > 10) {
          try {
            Thread.sleep(200); // 增加一些睡眠时间以便更明显地交替执行
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          gifts--;
          System.out.println(Thread.currentThread().getName() + " sent a gift, remaining: " + gifts);
        } else {
          System.out.println("送完了");
          break;
        }
      }
    }
  }
}
