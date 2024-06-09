package com.wjx.a05myset;

public class A02_HashSetDemo1 {
  public static void main(String[] args) {

    // 1. 创建对象
    Student s1 = new Student("zhangsan",23);
    Student s2 = new Student("zhangsan",23);

    // 2.如果没有重写hashCode
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

    System.out.println("abc".hashCode());
    System.out.println("acD".hashCode());
  }
}
