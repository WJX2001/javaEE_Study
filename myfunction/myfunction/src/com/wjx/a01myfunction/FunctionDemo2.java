package com.wjx.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
  public static void main(String[] args) {

    // 1.创建集合并添加元素
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list,"1","2","3","4","5","6","7","8","9");

    // 2. 常规方式
    //ArrayList<Integer> list2 = new ArrayList<>();
    //for(String s: list) {
    //  int i = Integer.parseInt(s);
    //  list2.add(i);
    //}

    // 3.把他们都变成int类型

    // 泛型：流里面数据的类型，第二个参数：你要把数据转成的泛型
    //list.stream().map(new Function<String, Integer>() {
    //  @Override
    //  public Integer apply(String s) {
    //    int i = Integer.parseInt(s);
    //    return i;
    //  }
    //}).forEach(s -> System.out.println(s));


    // 1.方法需要已经存在
    // 2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
    // 3.方法的功能需要把形参的字符串转换成整数

    list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));


  }
}
