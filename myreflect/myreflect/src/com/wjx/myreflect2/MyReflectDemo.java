package com.wjx.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyReflectDemo {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

    // 1. 获取class字节码文件对象
    Class clazz =  Class.forName("com.wjx.myreflect2.Student");

    // 2.获取构造方法
    Constructor[] cons = clazz.getConstructors();

    for (Constructor con : cons) {
      System.out.println(con);
    }


    Constructor[] cons2 = clazz.getDeclaredConstructors();
    for (Constructor con : cons2) {
      System.out.println(con);
    }

    Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);

    // 表示临时取消权限的校验
    con4.setAccessible(true);
    Student stu = (Student) con4.newInstance("张三", 23);
    System.out.println(stu);


  }
}
