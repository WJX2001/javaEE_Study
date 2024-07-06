package com.wjx.a11waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

  ArrayBlockingQueue<String> queue;


  // 创建对象的时候 把传入的参数queue赋值给当前的成员变量queue
  public Foodie(ArrayBlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    while (true) {
      // 不断从阻塞队列中获取面条
      try {
        String food = queue.take();
        System.out.println(food);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
