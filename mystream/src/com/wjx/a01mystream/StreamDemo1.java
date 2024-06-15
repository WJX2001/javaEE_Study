package com.wjx.a01mystream;

import java.util.ArrayList;

public class StreamDemo1 {

  public static void main(String[] args) {

    ArrayList<String> list1 = new ArrayList<>();

    list1.add("张无忌");
    list1.add("周芷若");
    list1.add("赵敏");
    list1.add("张强");
    list1.add("张三丰");

    // 把所有以张开头的元素存储到新集合中
    ArrayList<String> list2 = new ArrayList<>();

    for (String name : list1) {
      if (name.startsWith("张")) {
        list2.add(name);
      }
    }

    System.out.println(list2);

    list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3)
      .forEach(name -> System.out.println(name));
  }
}
