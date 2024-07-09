package com.wjx.a07Test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
  public static void main(String[] args) throws IOException {

    // 1. 创建Socket对象并连接服务端
    Socket socket = new Socket("127.0.0.1", 10000);

    // 2. 写出数据
    String str = "见到你很高兴";
    OutputStream os = socket.getOutputStream();
    os.write(str.getBytes());

    // 写出一个结束标记
    socket.shutdownOutput();

    // 3. 接收服务端回显的数据
    InputStream is = socket.getInputStream();
    InputStreamReader isr =  new InputStreamReader(is);

    int b;
    while ((b = isr.read()) != -1) {
      System.out.println((char) b);
    }


    // 释放资源
    socket.close();

  }
}
