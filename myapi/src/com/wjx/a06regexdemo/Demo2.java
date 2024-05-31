package com.wjx.a06regexdemo;

public class Demo2 {
  public static void main(String[] args) {


    // TODO: 只能是 a b c
    System.out.println("a".matches("[abc]"));
    System.out.println("z".matches("[abc]"));
    System.out.println("ab".matches("[abc]")); // false
    System.out.println("ab".matches("[abc][abc]]")); // true

    // TODO: 不能出现 a b c
    System.out.println("a".matches("[^abc]")); // false


    // TODO: a到z A到Z (包括头尾的范围)
    System.out.println("a".matches("[a-zA-Z]"));

    // TODO: a到d 或者m到p
    System.out.println("a".matches("[a-d[m-p]]")); // true

    // TODO: a-z 和 def的交集 为：d,e,f
    // 如果求两个范围的交集 && 如果一个& 不是交集了，而是一个简简单单的 & 符号
    System.out.println("d".matches("[a-z&&[def]]"));

    // TODO: a-z 和 非 bc的交集
    System.out.println("a".matches("[a-z&&[^bc]]")); // true
  }
}
