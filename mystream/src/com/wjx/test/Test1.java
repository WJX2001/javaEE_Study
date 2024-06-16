package com.wjx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
  public static void main(String[] args) {

    // 1.定义一个集合
    ArrayList<Integer> list = new ArrayList<>();
    // 2.添加一些整数
    Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    // 3.过滤奇数，只留偶数
    // 进行判断，如果是偶数，返回true，否则保留
    List<Integer> newList = list.stream()
      .filter(n -> n % 2 == 0)
      .collect(Collectors.toList());

    // 4. 打印集合
    System.out.println(newList);

  }
}
