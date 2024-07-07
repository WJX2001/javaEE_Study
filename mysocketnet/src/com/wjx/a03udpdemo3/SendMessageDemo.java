package com.wjx.a03udpdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo {
  public static void main(String[] args) throws IOException {

    // 1. 创建对象DatagramSocket对象
    DatagramSocket ds = new DatagramSocket();
    Scanner sc = new Scanner(System.in);
    // 2. 打包数据
    while (true) {

      System.out.println("请输入您要说的话");
      String str = sc.nextLine();
      if("886".equals(str)){
        break;
      }
      // 转换成字节数组
      byte[] bytes = str.getBytes();
      InetAddress address = InetAddress.getByName("127.0.0.1");
      int port = 10086;
      DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

      // 3.发送数据
      ds.send(dp);
    }

    // 4.释放资源
    ds.close();
  }
}
