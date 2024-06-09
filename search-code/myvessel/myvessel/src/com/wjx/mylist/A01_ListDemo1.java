package com.wjx.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
  public static void main(String[] args) {

    // 1. 创建一个集合
    List<String> list = new ArrayList<String>();

    // 2. 添加元素
    list.add("a");
    list.add("b");
    list.add("c");

    list.add(1,"qqq");


    // 3.打印集合
    System.out.println(list);
  }
}
