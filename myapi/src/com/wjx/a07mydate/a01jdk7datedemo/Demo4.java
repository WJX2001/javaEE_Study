package com.wjx.a07mydate.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
  public static void main(String[] args) throws ParseException {
    /*
     *  秒杀活动：2023年11月11日 0:0:0
     *  开始时间：2023年11月11日 0:10:0
     *  小贾下单并付款时间为：2023年11月11日 0:01:00
     * */

    // TODO: 用代码说明有没有参加上

    // 1.解析时间得到毫秒值
    String startStr = "2023年11月11日 0:0:0";
    String endStr = "2023年11月11日 0:10:0";
    String orderStr = "2023年11月11日 0:01:00";

    // 2.解析上面的三个时间，得到Date对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date startDate = sdf.parse(startStr);
    Date endDate = sdf.parse(endStr);
    Date orderDate = sdf.parse(orderStr);

    // 3.得到三个时间的毫秒值
    long startTime = startDate.getTime();
    long endTime = endDate.getTime();
    long orderTime = orderDate.getTime();

    // 4.判断
    if (orderTime >= startTime && orderTime <= endTime) {
      System.out.println("参加秒杀活动成功");
    } else {
      System.out.println("参加秒杀活动失败");
    }

  }
}
