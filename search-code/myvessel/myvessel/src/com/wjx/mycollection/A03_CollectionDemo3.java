package com.wjx.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
  public static void main(String[] args) {



    // 1. 创建集合并添加元素
    Collection<String> coll = new ArrayList<>();
    coll.add("aaa");
    coll.add("bbb");
    coll.add("ccc");

    // 2. 获取迭代器对象
    // 迭代器就好像是一个箭头，默认指向集合的0索引处
    Iterator<String> it = coll.iterator();

    // 3. 利用循环不断的去获取集合中的每一个元素
    while (it.hasNext()) {
      // 4.next 方法两件事：获取元素并移动指针
      String next = it.next();
      if("bbb".equals(next)) {
        it.remove();
      }
    }
    System.out.println(coll);
  }
}
