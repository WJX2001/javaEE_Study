package com.wjx.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
  public static void main(String[] args) throws IOException {

    // 1.createNewFile 创建一个新的空的文件
    File f1 = new File("/Users/wjx2020/Desktop/test/1.txt");
    boolean newFile = f1.createNewFile();
    System.out.println(newFile);

    // 2.使用listFiles方法

    File f = new File("/Users/wjx2020/Desktop/qiuzhao");

    // 3.listFiles方法
    File[] files = f.listFiles();
    for(File file: files) {
      System.out.println(file);
    }

  }
}
