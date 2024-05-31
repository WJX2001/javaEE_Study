package com.wjx.a08integerdemo;

public class A02_IntegerDemo2 {
  public static void main(String[] args) {

    // 1.把整数转成二进制，八进制，十六进制
    String str1 = Integer.toBinaryString(100);
    System.out.println(str1); // 1100100

    // 2.转成八进制
    String str2 = Integer.toOctalString(100);
    System.out.println(str2); // 144

    // 3.把整数转成十六进制
    String hexString = Integer.toHexString(100);
    System.out.println(hexString); // 64

    // 4.将字符串类型的整数转成int类型的整数
    // 强类型语言：每种数据在java中都有各自的数据类型
    // 在计算的时候，如果不是同一种数据类型，是无法直接计算的

    int i = Integer.parseInt("123");
    System.out.println(i+1);

    // 细节1:
    // 在类型转换的时候，括号中的参数只能是数字不能是其他，否则代码会报错
    // 细节2:
    // 8种包装类中，除了Character都有对应的parseXxx的方法，进行类型转换
    String str = "true";
    boolean b = Boolean.parseBoolean(str);
    System.out.println(b);

    // 改写键盘录入
  }
}
