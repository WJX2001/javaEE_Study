package com.wjx.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A07_CollectionDemo7 {
  public static void main(String[] args) {


    // 1. 创建集合并添加元素
    Collection<String> coll = new ArrayList<>();
    coll.add("a");
    coll.add("b");
    coll.add("c");
    coll.add("d");

    // 2.利用匿名内部类的形式
    // 底层原理：
    // 也会自己遍历集合，依次得到每一个元素
    // 把得到的每一个元素，传递给下面的accept
    // s依次表示集合中的每一个数据
    coll.forEach(new Consumer<String>() {
      @Override
      // s依次表示集合中的每一个数据
      public void accept(String s) {
        System.out.println(s);
      }
    });

    // lambda表达式
    coll.forEach((s) -> System.out.println(s));


  }
}
