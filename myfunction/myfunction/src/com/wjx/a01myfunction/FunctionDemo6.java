package com.wjx.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo6 {
  public static void main(String[] args) {

    // 1. 创建集合并添加元素
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    // 2. 收集到数组当中
    //Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
    //  @Override
    //  public Integer[] apply(int value) {
    //    return new Integer[value];
    //  }
    //});

    // 简单写法
    Integer[] array2 = list.stream().toArray(Integer[]::new);


    // 3.打印
    System.out.println(Arrays.toString(array2));


  }
}
