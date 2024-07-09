package com.wjx.myreflect1;

public class MyReflectDemo1 {
  public static void main(String[] args) throws ClassNotFoundException {

    // 1.第一种方式
    // 全类名：包名+类名

    Class clazz = Class.forName("com.wjx.myreflect1.Student");
    System.out.println(clazz);

    // 2.第二种方式
    Class clazz2 = Student.class;
    System.out.println(clazz2);

    // 3.第三种方式
    Student s = new Student();
    Class clazz3 = s.getClass();
    System.out.println(clazz3);
  }
}
