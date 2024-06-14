package com.wjx.a03args;

import java.util.ArrayList;
import java.util.Collections;

public class ArgsDemo3 {
  public static void main(String[] args) {
    // 可变参数

    getSum(1,2,3,4,5,6,7,8,9);

    ArrayList<String> list = new ArrayList<>();

    Collections.addAll(list,"A","B","C","D","E","F","G","H");

    System.out.println(list);

    Collections.shuffle(list);
    System.out.println(list);
  }

  // 可变参数
  public static int getSum(int...args) {

    return 0;
  }
}
