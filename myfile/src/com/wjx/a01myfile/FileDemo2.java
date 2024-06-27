package com.wjx.a01myfile;

import java.io.File;

public class FileDemo2 {
  public static void main(String[] args) {


    // 1. 对一个文件的路径进行判断
    File f1 = new File("/Users/wjx2020/Desktop/1.png");
    boolean directory = f1.isDirectory();
    boolean file = f1.isFile();
    boolean exists = f1.exists();
    System.out.println(directory);
    System.out.println(file);
    System.out.println(exists);




  }
}
