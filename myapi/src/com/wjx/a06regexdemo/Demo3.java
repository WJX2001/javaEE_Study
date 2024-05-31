package com.wjx.a06regexdemo;

public class Demo3 {
  public static void main(String[] args) {
    // 预定义字符

    // \ 表示转义字符 改变后面那个字符原本的含义

    // 例如：以字符串的形式打印一个双引号
    // 用转义字符把他比阿成了一个普普通通的双引号而已
    System.out.println("\"");

    // TODO: .表示任意一个字符
    System.out.println("你".matches("."));

    // TODO: \\d 表示任意的一个数字
    // \\d 只能是任意的一位数字
    // 简单来记：两个\表示一个\
    System.out.println("a".matches("\\d"));
    System.out.println("3".matches("\\d")); // true

    // TODO: \\w 只能是一位单词字符[a-zA-Z_0-9]
    System.out.println("z".matches("\\w"));
    System.out.println("_".matches("\\w"));

    // 非单词字符
    System.out.println("你".matches("\\W"));


    // TODO: 必须是数字 字母 下划线 至少 6位
    System.out.println("2442fsfsf".matches("\\w{6,}"));

    // 必须是数字和字符 必须是4位
    System.out.println("23dF".matches("[a-zA-Z0-9]{4}")); // true
    System.out.println("23_F".matches("[a-zA-Z0-9]{4}")); // false
    System.out.println("23dF".matches("[\\w&&[^_]]{4}")); // true
    System.out.println("23_F".matches("\\w &&[^_]{4}"));  // false


  }
}
