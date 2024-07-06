package com.wjx.a12practice.practiceDemo6;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

  public static void main(String[] args) {

    // 创建奖池
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list,10,5,20,50,100,200,800,2,80,300);

    // 创建线程
    Thread t1 = new MyThread1(list);
    Thread t2 = new MyThread1(list);

    // 设置名字
    t1.setName("抽奖箱1");
    t2.setName("抽奖箱2");

    t1.start();
    t2.start();

  }
}
