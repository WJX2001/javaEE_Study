package com.wjx.a02mytreemap;

import java.util.TreeMap;

public class A02_TreeMapDemo2 {
  public static void main(String[] args) {

    TreeMap<Student,String> tm = new TreeMap<>();

    // 2. 创建三个学生对象
    Student s1 = new Student("zhangsan",23);
    Student s2 = new Student("lisi",24);
    Student s3 = new Student("wangwu",25);

    // 3. 添加元素
    tm.put(s1,"江苏");
    tm.put(s2,"天津");
    tm.put(s3,"北京");

    System.out.println(tm);
  }
}
