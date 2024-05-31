package com.wjx.a06regexdemo;

public class Demo1 {
  public static void main(String[] args) {
    /*
     * 加入现在要求校验一个qq号码是否正确
     * 规则：6位及20位之内，0不能在开头，必须全部是数字
     * 先使用目前所学只是完成校验
     * 然后体验以下正则表达式
     * */

    String qq = "12345678";
    System.out.println(qq.matches("[1-9]\\d{5,19}"));

  }


  public static boolean checkQQ(String numbers) {
    int len = numbers.length();
    // 首先六位到二十位
    if (len < 6 || len > 20) {
      return false;
    }

    if (numbers.startsWith("0")) {
      return false;
    }

    for (int i = 0; i < numbers.length(); i++) {
      char c = numbers.charAt(i);
      if (c < '0' || c > '9') {
        return false;
      }
    }
    return true;

  }

}
