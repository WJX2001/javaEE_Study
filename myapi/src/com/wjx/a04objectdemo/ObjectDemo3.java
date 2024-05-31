package com.wjx.a04objectdemo;

public class ObjectDemo3 {
  public static void main(String[] args) {


    // 1.先创建一个对象

    int[] data = {1, 2, 3, 4, 5};
    User u1 = new User(1, "zhangsan", "1234", "girl11", data);



    // 2.克隆对象
    User u2 =  u1.clone();


    System.out.println(u1);
    System.out.println(u2);


  }
}
