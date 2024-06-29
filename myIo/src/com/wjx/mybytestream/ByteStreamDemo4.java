package com.wjx.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
  public static void main(String[] args) throws IOException {

    // 换行和续写


    // 1.创建对象
    FileOutputStream fos = new FileOutputStream("myIo/a.txt",true);

    // 2.写出数据
    String str = "abc";
    byte[] arr = str.getBytes();
    fos.write(arr);

    // 在这里写入换行符 即可实现换行

    String wrap = "\r\n";
    byte[] bytes2 = wrap.getBytes();
    fos.write(bytes2);

    String str2 = "666";
    byte[] bytes3 = str2.getBytes();
    fos.write(bytes3);

    // 释放资源
    fos.close();





  }
}
