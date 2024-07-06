package com.wjx.a05threadmethod2;

public class ThreadDemo {
  public static void main(String[] args) {

    /*
    *  setDaemon 设置守护线程
    *  细节：
    *     当其他的非守护线程执行完毕之后，守护线程会陆续结束
    * */

    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();

    t1.setName("女神");
    t2.setName("备胎");

    // 把第二个线程设置为守护线程（备胎线程）
    t2.setDaemon(true);

    t1.start();
    t2.start();


  }
}
