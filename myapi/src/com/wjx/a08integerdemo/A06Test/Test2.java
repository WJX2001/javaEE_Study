package com.wjx.a08integerdemo.A06Test;

public class Test2 {
  public static void main(String[] args) {
    // 自己实现parseInt方法，将字符串形式的数据转成整数
    /*
    * 要求：字符串只能是数字不能有其他字符
    * 最少一位，最多10位
    * 0不能开头
    * */

    // 1. 定义一个字符串
    String str = "123";

    // 2. 校验字符串
    // 习惯：会先把异常数据进行过滤，剩下就是正常的数据
    if(!str.matches("[1-9]\\d{0,9}")) {
      // 正确的数据
      System.out.println("数据格式有误");
    }else {
      System.out.println("数据格式正确");
      // 3.定义一个变量表示最终的结果
      int number = 0;

      // 4.遍历字符串得到里面的每一个字符
      for (int i = 0; i < str.length(); i++) {
        // '1'-'0' ---> 1
        // 49 -48
        int c = str.charAt(i) - '0';
        number = number * 10 + c;
      }

      System.out.println(number+1);

    }


  }
}
