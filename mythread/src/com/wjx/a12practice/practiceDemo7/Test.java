package com.wjx.a12practice.practiceDemo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

  public static void main(String[] args) {

    // 核心逻辑 获取线程抽奖的最大值（看成运行结果）

    // 创建奖池
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 10, 5, 20, 50, 100, 200, 800, 2, 80, 300);

    // 创建多线程要运行的参数对象
    MyCallable mc = new MyCallable(list);

    // 创建多线程运行结果的管理者对象
    FutureTask<Integer> ft1 = new FutureTask<>(mc);
    FutureTask<Integer> ft2 = new FutureTask<>(mc);

    // 创建线程对象
    Thread t1 = new Thread(ft1);
    Thread t2 = new Thread(ft2);

    // 设置名字
    t1.setName("抽奖箱1");
    t2.setName("抽奖箱2");

    // 开启线程
    t1.start();
    t2.start();

    try {
      // 获取结果
      Integer max1 = ft1.get();
      Integer max2 = ft2.get();

      System.out.println("抽奖箱1的最大值: " + max1);
      System.out.println("抽奖箱2的最大值: " + max2);

    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
}
