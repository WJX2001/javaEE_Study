package com.wjx.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("myIo/a.txt");

    // 2. 读取数据
    //int b1 = fis.read();
    //System.out.println(b1);

    //while (fis.available() > 0) {
    //  int b2 = fis.read();
    //  System.out.println(b2);
    //}

    // 3.释放资源
    fis.close();

  }
}
