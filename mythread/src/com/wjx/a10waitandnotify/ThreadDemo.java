package com.wjx.a10waitandnotify;

public class ThreadDemo {
  public static void main(String[] args) {
    /*
    * 需求：完成生产者和消费者代码
    *   实现线程轮流交替执行的结果
    * */

    // 创建线程的对象
    Cook c = new Cook();
    Foodie foodie = new Foodie();

    // 给线程设置名字
    c.setName("厨师");
    foodie.setName("吃货");


    // 开启线程
    c.start();
    foodie.start();

  }
}
