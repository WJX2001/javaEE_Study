package com.wjx.a04objectdemo;

import java.util.Objects;

public class Student {
  private String name;
  private int age;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age && Objects.equals(name, student.name);
  }


  // 结论：
  // 1.如果没有重写equals方法，那么默认使用Object中的方法进行比较，比较的是地址值是否相等
  // 2.一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值



}
