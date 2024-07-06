package com.wjx.a11waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

  ArrayBlockingQueue<String> queue;

  // 创建对象的时候 把传入的参数queue赋值给当前的成员变量queue
  public Cook(ArrayBlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    while (true) {
      // 不断的把面条放到阻塞队列里
      try {
        queue.put("面条");
        System.out.println("厨师放了一碗面条");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
