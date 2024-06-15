package com.wjx.a01mystream;

import java.util.Arrays;

public class StreamDemo4 {
  public static void main(String[] args) {

    // 1. 创建数组
    int[] arr = {1,2,3,4,5,6,7,8,9};

    // 2. 获取stream流
    Arrays.stream(arr).forEach(s -> System.out.print(s+" "));
  }
}
