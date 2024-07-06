package com.wjx.a09threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

  // 表示这个类所有的对象，都共享ticket数据
  static int ticket = 0;

  // 创建一个锁
  static Lock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true) {
      // 加锁
      lock.lock();
      try {
        if (ticket < 100) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          ticket++;
          System.out.println(getName() + "正在卖第" + ticket + "张票");
        } else {
          break;
        }
      } finally {
        lock.unlock();
      }
    }
  }
}
