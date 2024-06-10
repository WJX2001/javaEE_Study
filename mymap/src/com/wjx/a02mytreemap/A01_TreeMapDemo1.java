package com.wjx.a02mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
  public static void main(String[] args) {

    // 1. 创建集合对象
    TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        // o1: 当前要添加的元素
        // o2: 表示已经在红黑树中存在的元素
        //return o1-o2;
        // 如果想降序
        return o2 - o1;
      }
    });

    // 按照id的升序排列


    // 2. 添加元素
    tm.put(1,"哈哈哈");
    tm.put(2,"康师傅");
    tm.put(3,"可乐");



    System.out.println(tm);
  }
}
