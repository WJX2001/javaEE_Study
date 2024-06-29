package com.wjx.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
  public static void main(String[] args) throws IOException {

    // 1. 创建对象
    FileInputStream fis = new FileInputStream("myIo/a.txt");

    // 2. 读取数据
    byte[] bytes = new byte[2];
    // 一次读取多个字节数据，具体读多少，跟数组的长度有关
    int len = fis.read(bytes);
    // 返回值：本次读取到的多少个字节数据
    System.out.println(len); // 2

    String str = new String(bytes, 0, len);
    System.out.println(str);

    // 这种写法会导致结果异常 因为剩余一个的时候，只会把e将c替换掉，从而出现ed
    // 正确写法
    System.out.println(new String(bytes, 0, len));

    // 3. 释放资源
    fis.close();
  }
}
