package com.wjx.a09test4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerWithThreadPool {
  public static void main(String[] args) throws IOException {


    // 创建线程池对象
    ThreadPoolExecutor pool = new ThreadPoolExecutor(
      3,  // 核心线程数量
      16,  // 线程池总大小
      60,  // 空闲时间
      TimeUnit.SECONDS, // 空闲时间（单位）
      new ArrayBlockingQueue<>(2), // 队列
      Executors.defaultThreadFactory(),   // 线程工厂
      new ThreadPoolExecutor.AbortPolicy()
    );


    // 1.创建对象 并绑定端口
    ServerSocket ss = new ServerSocket(10000);
    while (true) {
      // 2.等待客户端来连接
      Socket socket = ss.accept();

      // 开启一条线程
      // 一个用户就对应服务端的一条线程
      //new Thread(new MyRunnable(socket)).start();
      pool.submit(new MyRunnable(socket));
    }
  }
}
