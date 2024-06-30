package com.wjx.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException {
    /*
    *  加密原理：
    *     对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中
    *  解密原理：
    *     读取加密之后的文件，按照较密的规则反向操作，变成原始文件
    *
    *  ^ ：异或
    *     两边相同：false
    *     两边不同：true
    *
    *  100: 1100100
    *  10:  1010
    *
    *   1100100
    * ^ 0001010
    * ----------------
    *   1101110
    * ^ 0001010
    * ----------------
    *   1100100
    *
    *   100 ^ 10 = 110  110^10 = 100
    *   加密 解密
    * */


    FileInputStream fis = new FileInputStream("myIo/1.png");
    FileOutputStream fos = new FileOutputStream("myIo/ency.png");

    // 加密处理
    int b;
    while ((b = fis.read()) != -1) {
      fos.write(b^2);
    }
    // 释放资源
    fis.close();
    fos.close();





  }
}
