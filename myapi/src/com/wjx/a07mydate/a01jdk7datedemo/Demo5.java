package com.wjx.a07mydate.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class Demo5 {
  public static void main(String[] args) {


    //1. 获取日历对象
    //细节1： Calendar 是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
    /*
    * 底层原理：
    *   会根据系统的不同时区来获取不同的日历对象
    *   把时间中的纪元，年，日，时，分，秒，星期，等等的都放到一个数组当中
    * */

    /*
    * 0: 纪元
    * 1: 年
    * 2: 月
    * 3: 一年中的第几周
    * 4: 一个月中的第几周
    * 5: 一个月中的第几天（日期）
    * */

    // 细节2：
    // 月份：范围0-11 如果获取出来的时0，那么实际上是1月
    // 星期：在老外的眼里，星期日是一周中的第一天
    Calendar c = Calendar.getInstance();

    // 2.修改一下日历代表的时间
    Date d = new Date(0L);
    c.setTime(d);
    System.out.println(c);

    // 3.java在Calendar类中，把索引对应的数字都定义成常量
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int week = c.get(Calendar.DAY_OF_WEEK);
    int day = c.get(Calendar.DATE);

    System.out.println(year+"-"+month+"-"+day+"-"+week); // 1970-0-1

  }
}
