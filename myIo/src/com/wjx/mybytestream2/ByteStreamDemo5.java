package com.wjx.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
  public static void main(String[] args) throws IOException {

    // 记录开始时间
    long startTime = System.currentTimeMillis();

    // 练习：文件拷贝

    // 1. 创建对象
    FileInputStream fis = new FileInputStream("/Users/wjx2020/Desktop/1.json");
    FileOutputStream fos = new FileOutputStream("myIo/test.json");

    // 2. 拷贝
    int len;
    byte[] bytes = new byte[1024*1024*5];
    while ((len = fis.read(bytes)) !=-1) {
      fos.write(bytes,0,len);
    }


    // 3. 释放资源
    // 规则：先开的流最后关闭
    fos.close();
    fis.close();

    // 记录结束时间：
    long endTime = System.currentTimeMillis();

    // 计算用了多长时间
    System.out.println(endTime-startTime);


  }
}
