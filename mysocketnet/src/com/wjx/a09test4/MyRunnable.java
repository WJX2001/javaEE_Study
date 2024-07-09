package com.wjx.a09test4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {

  Socket socket;

  public MyRunnable(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try {
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
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      // 5.释放资源
     if(socket != null) {
       try {
         socket.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
    }
  }
}
