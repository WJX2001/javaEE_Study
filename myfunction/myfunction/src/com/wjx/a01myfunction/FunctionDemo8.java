package com.wjx.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo8 {
  public static void main(String[] args) {

    // 1. 创建集合
    ArrayList<Student> list = new ArrayList<>();
    // 2. 添加元素
    list.add(new Student("zhangsan",23));
    list.add(new Student("lisi",24));
    list.add(new Student("wangwu",25));

    // 3. 获取姓名放到数组中
    String[] array = list.stream().map(new Function<Student, String>() {
      @Override
      public String apply(Student student) {
        return student.getName();
      }
    }).toArray(String[]::new);

    System.out.println(Arrays.toString(array));

    // 4. 改用方法引用实现
    String[] array1 = list.stream().map(Student::getName).toArray(String[]::new);
    System.out.println(Arrays.toString(array1));

  }
}
