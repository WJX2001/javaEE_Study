package com.wjx.a12practice.practiceDemo4;

import java.util.Random;

public class MyThread1 extends Thread {

  // 共享三个包
  static double money = 100;
  static int count = 3;
  static final double MIN = 0.01;

  @Override
  public void run() {
    synchronized (MyThread.class) {
      if (count == 0) {
        System.out.println(getName() + "没有抢到红包");
      } else {
        double prize = 0;
        if (count == 1) {
          prize = money;
        } else {
          Random r = new Random();

          double bounds = money - (count - 1) * MIN;
          prize = r.nextDouble(bounds);
          if (prize < MIN) {
            prize = MIN;
          }
        }

        money = money - prize;
        count--;
        System.out.println(getName() + "抢到了" + prize + "元");
      }
    }
  }
}
