package com.wjx.a08integerdemo.A06Test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
  public static void main(String[] args) {
    /*
    * 判断任意的一个年份是闰年还是平年
    * 要求：用JDK7和JDK8两种方式判断
    * 提示：
    *   二月有29天是润年
    *   一年有366天是闰年
    * */


    // JDK7 方式
    // 简化1:
    // 我们可以把时间设置位2000年3月1日
    // 再把日历往前减一天
    // 看当前的时间是28号还是29号
    Calendar c = Calendar.getInstance();
    c.set(2000,2,1);
    // 再把日历往前减一天
    c.add(Calendar.DAY_OF_MONTH,-1);
    // 看当前时间是29号还是28号
    int day = c.get(Calendar.DAY_OF_MONTH);
    System.out.println(day);

    // 实现方式二： 2001年1月1日
    // 往前减一天
    // 统计这天是一年中的第几天 366


    // JDK8 方式
    // 月份的返回 1～12
    // 设定时间为 2000年3月1日
    LocalDate ld = LocalDate.of(2000, 3, 1);
    // 把时间往前减一天
    LocalDate ld2 = ld.minusDays(1);
    // 获取这一天是一个月中的几号
    int day2 = ld2.getDayOfMonth();
    System.out.println(day2);


    System.out.println(ld.isLeapYear());

  }
}
