package com.wjx.a08test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
  public static void main(String[] args) throws IOException {
    // 1.创建对象 并绑定端口
    ServerSocket ss = new ServerSocket(10000);

    // 2.等待客户端来连接
    Socket socket = ss.accept();

    // 3.读取数据并保存到本地文件中

    // TODO: 读取
    // 首先拿到读取的数据
    BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
    String name = UUID.randomUUID().toString().replace("-", "");
    // 从网络拿到的数据立刻放到本地文件中
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mysocketnet/serverdir/" + name + ".png"));
    int len;
    byte[] bytes = new byte[1024];
    while ((len = bis.read(bytes)) != -1) {
      bos.write(bytes, 0, len);
    }

    // 4.回写数据
    // socket.getOutputStream() 连接通道里获得的输出流
    // 转成字符流
    // 最后用缓冲流进行包裹
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

    bw.write("上传成功");
    bw.newLine();
    bw.flush();

    // 5.释放资源
    socket.close();
    ss.close();
  }
}
