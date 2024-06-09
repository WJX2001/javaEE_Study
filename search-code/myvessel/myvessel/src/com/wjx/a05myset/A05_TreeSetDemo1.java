package com.wjx.a05myset;

import java.util.TreeSet;

public class A05_TreeSetDemo1 {
  public static void main(String[] args) {


    /*
    *  TODO: 方式一：
    *     默认的排序规则/自然排序
    *     Student实现一个接口Comparable接口，重写里面的方法
    * */


    // 1.创建TreeSet集合对象
    TreeSet<Student> ts = new TreeSet<>();


    Student s1 = new Student("zhangsan",23);
    Student s2 = new Student("lisi",24);
    Student s3 = new Student("wangwu",25);

    ts.add(s1);
    ts.add(s2);
    ts.add(s3);



    System.out.println(ts);

    // hashCode和equals方法：哈希表有关的

    // TreeSet 底层是红黑树


  }
}
