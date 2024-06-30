package com.wjx.mycharStream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
  public static void main(String[] args) throws IOException {


    // 1. 创建对象并关联本地文件
    FileReader fileReader = new FileReader("myIo/a.txt");

    // 2. 读取数据 read()
    // 字符流底层也是字节流，默认也是一个字节一个字节的读取
    // 如果遇到中文就会一次读取多个，GBK一次读取两个，UTF-8一次读取3个

    // read() 细节
    // 最终转为十进制作为返回值

    // 想看到中文的话 需要将十进制数字进行强转

    int ch;
    while ((ch = fileReader.read()) != -1) {
      System.out.print((char)ch);
    }

    // 3. 释放资源
    fileReader.close();
  }
}
