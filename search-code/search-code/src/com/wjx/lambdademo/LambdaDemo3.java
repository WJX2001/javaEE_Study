package com.wjx.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
  public static void main(String[] args) {
    /*
     *  按照字符串的长度进行排序，短的在前面，长的在后面
     *
     * */
    String[] arr = {"a", "aaaa", "aaa", "aa"};

    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();
      }
    });

    // 使用lambda表达式简化
    Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
    System.out.println(Arrays.toString(arr));
  }
}
