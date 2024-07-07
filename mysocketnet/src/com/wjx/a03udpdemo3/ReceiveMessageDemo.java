package com.wjx.a03udpdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {
  public static void main(String[] args) throws IOException {

    // 1.创建对象
    DatagramSocket ds = new DatagramSocket(10086);

    // 2. 接受数据包
    byte[] bytes = new byte[1024];
    DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

   while (true) {
     // 进行接收
     ds.receive(dp);

     // 3.解析数据包
     byte[] data = dp.getData();
     int length = dp.getLength();
     String ip = dp.getAddress().getHostAddress();
     String hostName = dp.getAddress().getHostName();

     // 4.打印数据
     System.out.println("ip为：" + ip + "主机名为：" + hostName + "的人，发送了数据：" + new String(data, 0, length));
   }
  }
}
