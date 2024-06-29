package com.wjx.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
  public static void main(String[] args) throws IOException {

    // 1.创建对象
    // 写出 输出流 OutputStream
    // 本地文件 File
    FileOutputStream fos = new FileOutputStream("myIo/a.txt");

    // 2.写出数据
    fos.write(97);

    // 3.释放资源
    fos.close();
  }
}
