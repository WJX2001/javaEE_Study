package com.wjx.a01threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
  public static void main(String[] args) {
    /*
    * newCachedTreadPool()  创建一个没有上限的线程池
    * newFixedThreadPool()  创建有上限的线程池
    * */


    // 1. 获取线程池对象
    ExecutorService pool1 = Executors.newCachedThreadPool();

    // 2. 提交任务
    pool1.submit(new MyRunnable());
    pool1.submit(new MyRunnable());

    // 3. 销毁线程池
    pool1.shutdown();
  }
}
