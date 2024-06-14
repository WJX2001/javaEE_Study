package com.wjx.a05noChangeList;

import java.util.List;

public class Demo1 {

  public static void main(String[] args) {
    // 一旦创建完毕后，无法修改
    List<String> list = List.of("张三","李四","王五");
    System.out.println(list.get(0));
  }



}
