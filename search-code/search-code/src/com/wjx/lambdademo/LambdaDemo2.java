package com.wjx.lambdademo;

import java.util.Arrays;

public class LambdaDemo2 {
  public static void main(String[] args) {

    /*
     *  1. 利用匿名内部类的形式去调用下面的方法
     *  调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
     *  如果实现类对象只要用到一次，就可以用匿名内部类的形式进行书写
     * */


    /*
     *   lambda的省略规则：
     *     1. 参数类型可以省略不写
     *     2. 如果只有一个参数，参数类型可以省略，同时()也可以省略
     *     3. 如果Lambda 表达式的方法体只有一行，大括号，分号，return 可以省略不写，需要同时省略
     * */

    method(new Swim() {
      @Override
      public void swimming() {

      }
    });

    // 2.利用lambda表达式进行改写
    method(() -> {
      System.out.println("正在游泳");
    });

    Integer[] arr = {2, 3, 4, 5, 6, 7};

    // lambda完整格式
    Arrays.sort(arr, (o1, o2) -> o2 - o1);

  }


  public static void method(Swim s) {
    s.swimming();
  }

}


interface Swim {
  public abstract void swimming();
  //public abstract void swimming2();
}
