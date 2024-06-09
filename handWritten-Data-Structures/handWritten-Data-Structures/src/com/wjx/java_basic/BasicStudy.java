package com.wjx.java_basic;

import java.util.ArrayList;

public class BasicStudy {

  public static void main(String[] args) {
    // 列举一下动态数组的使用方法

    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      arr.add(i);
    }

    // 在中间插入元素
    arr.add(2,666);

    // 在头部插入元素
    arr.add(0,-1);

    // 删除末尾元素
    arr.remove(arr.size()-1);

    arr.remove(2);


  }

}
