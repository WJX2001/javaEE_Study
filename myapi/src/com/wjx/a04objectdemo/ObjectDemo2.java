package com.wjx.a04objectdemo;

public class ObjectDemo2 {
  public static void main(String[] args) {
    String s = "abc";
    StringBuilder sb = new StringBuilder("abc");


    System.out.println(s.equals(sb));
    // 答案是false
    // 因为 equals方法是被s调用的，而s是字符串
    // 所以equals要看String类中的
    // 字符串中的equals方法，先判断参数是否为字符串。
    // 如果是字符串，再比较内部的属性，但是如果参数不是字符串，直接返回false


    System.out.println(sb.equals(s));

    // 因为equals方法是被sb调用的，而sb是StringBuilder
    // 所以这里的equals方法要看StringBuilder中的equals方法
    // 那么在StringBuilder当中，没有重写equals方法
    // 使用的是Object中的，在Object中默认使用==号来比较两个对象的地址值
    // 这里由于地址值不一样，所以返回false
  }
}
