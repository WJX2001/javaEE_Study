package com.wjx.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
  public static void main(String[] args) throws IOException {
    /*
    * 字节输入流循环读取
    * */

    // 1.创建对象
    FileInputStream fis = new FileInputStream("myIo/a.txt");

    // 2.循环读取
    // 一定要定义第三方变量，否则会导致指针跳过

    int b;
    while ((b = fis.read()) != -1) {
      System.out.print((char)b);
    }

    // 3.释放资源
    fis.close();
  }
}
