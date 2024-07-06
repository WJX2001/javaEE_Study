package com.wjx.a12practice.practiceDemo4;

import java.util.Random;

public class MyThread extends Thread {

  // 共享数据
  // 100块 分成3个包
  static double money = 100;
  static int count = 3;

  // 最小金额
  // 0.01
  static final double MIN = 0.01;


  @Override
  public void run() {
    // 循环

    synchronized (MyThread.class) {
      if (count == 0) {
        // 判断，共享数据是否到了末尾（已经到达末尾）
        System.out.println(getName() + "没有抢到红包");
      } else {
        // 判断，共享数据是否到了末尾（没有到末尾）
        // 定义一个变量，表示中奖的金额
        double prize = 0;


        if (count == 1) {
          // 表示此时是最后一个红包
          // 就无需随机，剩余所有的钱都是中奖金额
          prize = money;
        } else {
          // 表示第一次/第二次 （随机）
          Random r = new Random();
          // 100元  3个红包
          // 第一个红包 99.98 0.01 0.01
          // 100 - (3-1) * 0.01
          double bounds = money - (count - 1) * MIN;
          prize = r.nextDouble(bounds);
          if (prize < MIN) {
            prize = MIN;
          }
        }

        // 从money当中 去掉当前中奖的金额
        money = money - prize;
        // 红包的个数-1
        count--;
        // 本次红包的信息进行打印
        System.out.println(getName() + "抢到了" + prize + "元");
      }
    }
  }
}

