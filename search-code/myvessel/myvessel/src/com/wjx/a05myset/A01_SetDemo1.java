package com.wjx.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
  public static void main(String[] args) {

    /*
    * 利用Set系列的集合，添加字符中，并使用多种方式遍历
    * 迭代器
    * 增强for
    * Lambda表达式
    * */

    // 1.创建一个Set集合的对象
    Set<String> s = new HashSet<>();

    // 2.添加元素
    // 如果当前元素是第一次添加，那么可以添加成功，返回true
    // 如果第二次添加，那么添加失败，返回false
    boolean r1 = s.add("张三");


    // 迭代器遍历
    Iterator<String> it = s.iterator();
    while (it.hasNext()) {
      String str = it.next();
      System.out.println(str);
    }

    // 增强for循环
    for(String str: s) {
      System.out.println(str);
    }

    // lambda表达式
    // 其实不是new Consumer的对象，而是后面的匿名类，实现了Consumer这个接口
    s.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {

      }
    });

    s.forEach((str) -> System.out.println(str));

  }
}
