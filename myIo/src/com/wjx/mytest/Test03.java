package com.wjx.mytest;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test03 {
  public static void main(String[] args) throws IOException {

    // 1. 读取数据
    FileReader fr = new FileReader("myIo/a.txt");
    StringBuilder sb = new StringBuilder();
    int ch;
    while ((ch = fr.read()) != -1) {
      sb.append((char) ch);
    }
    fr.close();
    System.out.println(sb);
    // 2. 排序
    String str1 = sb.toString();
    String[] arrStr = str1.split("-");


    ArrayList<Integer> list = new ArrayList<>();
    for (String s : arrStr) {

      System.out.println(Integer.parseInt(s));
    }


  }
}
