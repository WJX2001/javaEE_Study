package com.wjx.a07threadsafe1;

public class MyThread extends Thread {

  // 表示这个类所有的对象，都共享ticket数据
  static int ticket = 0;

  // 锁对象，一定要是唯一的
  static Object obj = new Object();

  @Override
  public void run() {
    while (true) {
      // 同步代码块 （让同步代码块中的代码轮流执行）
      // 用当前类的字节码文件作为锁
      synchronized (MyThread.class) {
        if (ticket < 100) {
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          ticket++;
          System.out.println(getName() + "正在卖第" + ticket + "张票");
        } else {
          break;
        }
      }
    }
  }
}
