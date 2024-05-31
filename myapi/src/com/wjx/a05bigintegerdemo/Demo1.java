package com.wjx.a05bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class Demo1 {

  public static void main(String[] args) {

    // 1.获取一个随机的大整数
    Random r = new Random();
    BigInteger bd1 = new BigInteger(4,r);
    System.out.println(bd1); // 0 ~15之间获取 包含左右区间

    // 2.获取一个指定的大整数
    // 细节：字符串中必须是整数

    // 3.获取指定进制的大整数
    // 细节：字符串中的数字必须要跟进制吻合
    BigInteger bd4 = new BigInteger("100",10);
    System.out.println(bd4);

    // 4.静态方法获取BigInteger的对象，内部有优化
    // 细节：
    // 1.能表示范围比较小，在long的取值范围之内，如果超出long的范围就不行了
    BigInteger bd5 = BigInteger.valueOf(100);
    System.out.println(bd5);
    System.out.println(Long.MAX_VALUE);



  }
}
