package com.wjx.a02test;

import java.io.File;
import java.io.IOException;

public class Test1 {
  public static void main(String[] args) throws IOException {

    // 需求：在当前模块下的aaa文件夹中创建一个a.txt

    // 1. 创建a.txt的父集路径
    File file = new File("/Users/wjx2020/Desktop/code/java-code/basic-code/myfile/aaa");
    // 2. 创建父级路径
    file.mkdirs();
    // 3.拼接父级路径和子级路径
    File src = new File(file,"a.txt");
    boolean b = src.createNewFile();

    if(b) {
      System.out.println("创建成功");
    }else {
      System.out.println("创建失败");
    }



  }
}
