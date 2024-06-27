package com.wjx.a01myfile;

import java.io.File;

public class FileDemo1 {
  public static void main(String[] args) {


    // 1.根据字符串表示的路径，变成File对象
    String str = "/Users/wjx2020/Desktop/a.txt";
    File file = new File(str);
    System.out.println(file);

    // 2.父级路径 /Users/wjx2020/Desktop/
    // 子级路径  a.txt
    String parent = "/Users/wjx2020/Desktop";
    String child = "a.txt";
    File f2 = new File(parent, child); // 加了一个间隔符号
    System.out.println(f2);


    // 3.把一个File表示的路径和String表示路径进行拼接
    File parent2 = new File("/Users/wjx2020/Desktop");
    String child2 = "a.txt";

    File f4 = new File(parent2, child);
    System.out.println(f4);





  }
}
