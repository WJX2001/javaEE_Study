package com.wjx.a06regexdemo;

public class Demo5 {
  public static void main(String[] args) {

    // TODO: 大小写字母，数字，下划线一共4-16位
    String regex1 = "\\w{4,16}";
    System.out.println("Wjx2001".matches(regex1));

    // TODO: 校验身份证号码
    /*
    * 18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
    * */

    String regex2 = "[1-9]\\d{16}(\\d|X|x)";
    // 忽略大小写
    String regex3 = "[1-9]\\d{16}(\\dXx)";
    System.out.println("33108120010122491X".matches(regex2));

    // 忽略大小写的方式
    // 在匹配的时候忽略abc的大小写
    String regex4 = "(?i)abc";
    System.out.println("Abc".matches(regex4));

    // 如果想忽略后面的情况
    String regex5 = "a(?i)bc";
    System.out.println("Abc".matches(regex5));



    // TODO: 身份证号码严格校验
    /*
    *  410801  1993 02 28 457x
    *  前面6位：省份，市区，派出所等信息 第一位不能是0 后面5位是任意数字  [1-9]\d{5}
    *
    *  年的前半段  18 19 20    (18|19|20)
    *  年的后半段： 任意数字出现次数   \\d{2}
    *  月份：  01～09 10 11 12      (0[1-9]|1[0-2])
    *  日期：  01～31               (0[1-9]|[12]\\d|3[01])
    *  后面四位： 任意数字出现3次，最后一位可以是数字也可以是大写X或者小写x (\\d{3}[\\dXx])
    * */

    String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";

    System.out.println("33108120010122491X".matches(regex6));


  }
}
