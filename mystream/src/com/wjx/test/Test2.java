package com.wjx.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
  public static void main(String[] args) {

    // 1.创建集合
    ArrayList<String> list = new ArrayList<>();

    // 2.添加以下字符串
    list.add("zhangsan,23");
    list.add("lisi,24");
    list.add("wangwu,25");

    System.out.println(list);

    // 3.保留年龄大于等于24的人
    //list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
    //  .collect(Collectors.toMap(new Function<String, String>() {
    //                              @Override
    //                              public String apply(String s) {
    //                                return s.split(",")[0];
    //                              }
    //                            },
    //    new Function<String, Integer>() {
    //      @Override
    //      public Integer apply(String s) {
    //        return Integer.parseInt(s.split(",")[1]);
    //      }
    //    }));

    // 简化写法
    Map<String, Integer> map = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
      .collect(Collectors.toMap(
        s -> s.split(",")[0],
        s -> Integer.parseInt(s.split(",")[1])
      ));

    System.out.println(map);
  }
}
