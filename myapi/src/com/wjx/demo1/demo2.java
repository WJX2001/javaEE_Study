package com.wjx.demo1;

public class demo2 {
  public static void main(String[] args) {
    // 判断一个数是否为质数
    System.out.println(isPrime(999));
  }

  private static boolean isPrime(int number) {
    for(int i=2;i<Math.sqrt(number);i++) {
      if(number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
