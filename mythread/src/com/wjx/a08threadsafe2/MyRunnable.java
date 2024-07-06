package com.wjx.a08threadsafe2;

public class MyRunnable implements Runnable {

  int ticket = 0;

  @Override
  public void run() {

    // 1.循环
    while (true) {
      if(method()) {
        break;
      }
    }
  }

  // 改造同步方法
  private synchronized boolean method() {
    // 3.判断共享数据是否到了末尾,如果到了末尾
    if (ticket == 100) {
      return true;
    } else {
      // 4.判断共享数据是否到了末尾，如果没有到末尾
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      ticket++;
      System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
    }
    return false;
  }

}
