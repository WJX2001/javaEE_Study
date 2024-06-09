package com.wjx.a05myset;

import java.util.HashSet;

public class A03_HashSetDemo2 {
  public static void main(String[] args) {



    // 1. 创建三个学生对象
    Student s1 = new Student("zhangsan",23);
    Student s2 = new Student("lisi",24);
    Student s3 = new Student("wangwu",25);
    Student s4 = new Student("zhangsan",23);

    // 2. 创建集合
    HashSet<Student> set = new HashSet<>();

    // 3. 添加元素
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);
    System.out.println(set);
  }
}
