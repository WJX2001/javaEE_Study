package com.wjx.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
  public static void main(String[] args) throws IOException {

    // 1. 创建对象
    FileOutputStream fos = new FileOutputStream("myIo/a.txt");

    // 2.写出数据（第一种写法）
    //fos.write(97);
    //fos.write(98);

    // 直接写一个数组
    byte[] bytes = {97, 98, 99, 100, 101};
    //fos.write(bytes);

    // 通过其余参数进行控制 选择性写入
    fos.write(bytes,1,2); // bc


    // 3. 释放资源
    fos.close();
  }
}
