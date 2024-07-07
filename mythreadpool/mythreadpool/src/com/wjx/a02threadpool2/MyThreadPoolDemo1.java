package com.wjx.a02threadpool2;

import java.util.concurrent.*;

public class MyThreadPoolDemo1 {
  public static void main(String[] args) {

    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
      3,      // 核心线程数量，能小于0
      6,                  // 最大线程数，不能小于0，最大数量>=核心线程数量
      60,                 // 空闲线程最大存活时间
      TimeUnit.SECONDS,   // 时间单位
      new ArrayBlockingQueue<>(3), // 任务队列
      Executors.defaultThreadFactory(),   // 创建线程工厂
      new ThreadPoolExecutor.AbortPolicy() // 任务的拒绝策略
    );
  }
}
