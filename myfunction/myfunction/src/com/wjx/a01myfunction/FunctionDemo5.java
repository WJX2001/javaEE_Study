package com.wjx.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo5 {
  public static void main(String[] args) {

    // 1. 创建集合对象
    ArrayList<String> list = new ArrayList<>();

    // 2. 添加数据
    Collections.addAll(list,"aaa","bbb","ccc");

    // 3. 变成大写后进行输出
    list.stream().map(String::toUpperCase).forEach(System.out::println);

    // 引入自定义方法
    list.stream().map(FunctionDemo5::printUpperCase).forEach(System.out::println);

    // 原始构造方法写法
    //list.stream().map(new Function<String, Object>() {
    //  @Override
    //  public Object apply(String s) {
    //    return s.toUpperCase();
    //  }
    //});

  }

  public static String printUpperCase(String list) {
    return list.toUpperCase();
  }
}
