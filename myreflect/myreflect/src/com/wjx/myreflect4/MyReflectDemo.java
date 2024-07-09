package com.wjx.myreflect4;

import java.lang.reflect.Method;

public class MyReflectDemo {
  public static void main(String[] args) throws ClassNotFoundException {


    // 1.获取class 字节码文件对象
    Class clazz = Class.forName("com.wjx.myreflect4.Student");

    // 2.获取里面所有的方法对象
    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      System.out.println(method);
    }




  }
}
