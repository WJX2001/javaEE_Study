package com.wjx.a12practice.practiceDemo4;

public class Test1 {
  public static void main(String[] args) {

    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();
    MyThread t4 = new MyThread();
    MyThread t5 = new MyThread();

    t1.setName("张三");
    t2.setName("李四");
    t3.setName("王五");
    t4.setName("王六");
    t5.setName("李七");


    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}
