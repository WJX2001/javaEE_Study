package com.wjx.a12practice.practiceDemo1;

import com.wjx.a08threadsafe2.MyRunnable;

public class ThreadDemo {
  public static void main(String[] args) {
    /*
    * 使用java实现 一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒，
    * 要求：请用多线程模拟卖票过程并打印剩余电影票的数量
    * */

    MyRunnable mr = new MyRunnable();
    Thread t1 = new Thread(mr);
    Thread t2 = new Thread(mr);

    t1.setName("窗口1");
    t2.setName("窗口2");

    t1.start();
    t2.start();
  }
}
