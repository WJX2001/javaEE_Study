package com.wjx.a06regexdemo;

public class Demo4 {
  public static void main(String[] args) {
  /*
  * 编写正则表达式验证用户输入的手机号码是否满足要求
  * 编写正则表达式验证用户输入的邮箱号是否满足要求
  * 以及电话号码
  *
  *
  *
  * */

    // TODO: 校验邮箱号码
    // 3232323@qq.com

    // 第一部分：@的左边 \\w+   任意的字母数字下划线，至少出现一次就可以了
    // 第二部分：@只能出现一次
    // 第三部分：
    //  3.1 .的左边 [\\w&&[^_]]
    //      任意的字母加数字，总共出现2-6次（此时不能出现下划线）
    //  3.2 . \\.
    //  3.3 大写字母和小写字母都可以 [a-zA-Z]{2,3}
    //  我们可以把3.2和3.3看成一组，这一组可以出现1次或者两次
    String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
    System.out.println("1758807220@qq.com".matches(regex3));

    String regex4 = "";


  }
}
