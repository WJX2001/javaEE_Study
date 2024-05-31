package com.wjx.a08integerdemo.A06Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
  public static void main(String[] args) throws ParseException {

    // 请使用代码实现你活了多少天，用JDK7和JDK9两种方式

    // TODO: JDK7
    // 规则：只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
    // 1. 计算出生年月日的毫秒值
    String birthday = "2000年1月1日";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
    Date date = sdf.parse(birthday);
    long birthdayTime = date.getTime();

    // 2.获取当前时间
    long todayTime = System.currentTimeMillis();
    // 3.计算间隔了多少天
    long time = todayTime - birthdayTime;
    System.out.println(time / 1000 / 60 / 60 / 24);

    // TODO: JDK8
    LocalDate ld1 = LocalDate.of(2000,1,1);
    LocalDate ld2 = LocalDate.now();

    long between = ChronoUnit.DAYS.between(ld1, ld2);
    System.out.println(between);


  }
}
