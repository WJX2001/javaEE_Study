package com.wjx.a05tcpdemo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws IOException {
    // TCP 协议 接收数据

    // 1. 创建对象ServerSocket
    ServerSocket ss = new ServerSocket(10000);

    // 2. 监听客户端的连接
    Socket socket = ss.accept();

    // 3.从连接通道中获取输入流读取数据
    //InputStream is = socket.getInputStream();
    //InputStreamReader isr = new InputStreamReader(is);

    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


    int b;
    while ((b = br.read()) != -1) {
      System.out.println((char) b);
    }

    // 4. 释放资源
    socket.close();
    ss.close();
  }
}
