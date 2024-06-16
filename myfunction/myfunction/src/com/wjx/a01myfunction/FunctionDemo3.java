package com.wjx.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
  public static void main(String[] args) {
    // 1. 创建集合
    ArrayList<String> list = new ArrayList<>();
    // 2. 添加数据
    Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
    // 3. 过滤数据(只要张开头，而且名字三个字)
    //list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

    list.stream().filter(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return  s.startsWith("张") && s.length() == 3;
      }
    }).forEach(s -> System.out.println(s));


    list.stream().filter(new StringOperation()::stringJudge).forEach(s -> System.out.println(s));



  }
}
