package com.wjx.a08test3;

import java.io.*;
import java.net.Socket;

public class Client {
  public static void main(String[] args) throws IOException {

    // 1.创建Socket对象，并连接服务器
    Socket socket = new Socket("127.0.0.1", 10000);

    // 2.读取本地文件中的数据，并写到服务器中
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mysocketnet/clientdir/img.png"));
    BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
    byte[] bytes = new byte[1024];

    int len;
    // 从本地读多少 就写到服务器中去多少
    while ((len = bis.read(bytes)) != -1) {
      bos.write(bytes,0,len);
    }

    // 往服务器写出结束标记
    socket.shutdownOutput();

    // 3.接收服务器的回写数据
    /*
    * 先获得连接通道里的输入流
    *   然后将其转为字符流
    *   最后用缓冲流进行包裹
    * */
    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String s = br.readLine();
    System.out.println(s);

    // 4.释放资源
    socket.close();
  }
}
