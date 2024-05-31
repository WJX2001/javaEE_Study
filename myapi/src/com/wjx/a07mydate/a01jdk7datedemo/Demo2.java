package com.wjx.a07mydate.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
  public static void main(String[] args) throws ParseException {
    /*
    *  public final String format(Date date)  格式化 （日期对象 -》 字符串）
    *  public Date parse(String source)    解析（字符串 -> 日期对象）
    * */

    // 1. 利用空参构造创建SimpleDataFormat对象，默认格式
    SimpleDateFormat sdf = new SimpleDateFormat();
    Date d1 = new Date(0L);
    String str1 = sdf.format(d1);
    System.out.println(str1);

    // 2. 利用带参构造创建SimpleDataFormat对象，指定格式
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE"); // 1970年01月01日 08:00:00 周四
    String str2 =  sdf2.format(d1); // 1970/1/1 08:00
    System.out.println(str2); // 1970年01月01日 08:00:00

    // 3. 课堂练习：yyyy年MM月dd日 时：分：秒 星期
    String str = "2023-11-11 11:11:11";
    // 利用空参构造创建SimpleDateFormat对象，默认格式
    SimpleDateFormat sdf1 = new SimpleDateFormat();
    Date date = sdf1.parse(str);
    System.out.println(date.getTime());






  }


}
