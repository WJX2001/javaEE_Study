package com.wjx.a09test4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws IOException {
    // 1.创建对象 并绑定端口
    ServerSocket ss = new ServerSocket(10000);


    while (true) {
      // 2.等待客户端来连接
      Socket socket = ss.accept();

      // 开启一条线程
      // 一个用户就对应服务端的一条线程
      new Thread(new MyRunnable(socket)).start();
    }

  }
}
