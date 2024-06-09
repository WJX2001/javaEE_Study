package com.wjx.a05myset;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo {
  public static void main(String[] args) {
    Student s1 = new Student("zhangsan",23);
    Student s2 = new Student("lisi",24);
    Student s3 = new Student("wangwu",25);
    Student s4 = new Student("zhangsan",23);

    // 创建集合对象
    LinkedHashSet<Student> lhs = new LinkedHashSet<>();

    // 添加元素
    lhs.add(s1);
    lhs.add(s2);
    lhs.add(s3);
    lhs.add(s4);

    System.out.println(lhs);
  }
}
