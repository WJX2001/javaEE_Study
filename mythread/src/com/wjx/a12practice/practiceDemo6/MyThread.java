package com.wjx.a12practice.practiceDemo6;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

  ArrayList<Integer> list;

  public MyThread(ArrayList<Integer> list) {
    this.list = list;
  }

  // 线程一
  static ArrayList<Integer> list1 = new ArrayList<>();
  // 线程二
  static ArrayList<Integer> list2 = new ArrayList<>();


  @Override
  public void run() {

    while (true) {
      synchronized (MyThread.class) {
        if (list.size() == 0) {
          if ("抽奖箱1".equals(getName())) {
            int max1 = Collections.max(list1);
            int sum1 = list1.stream().mapToInt(Integer::intValue).sum();
            System.out.println("抽奖箱1" + list1 + "最大值" + max1);
            System.out.println();
          } else {
            int max2 = Collections.max(list2);
            System.out.println("抽奖箱2" + list2 + "最大值" + max2);
          }
          break;
        } else {
          // 继续抽奖(打乱)
          Collections.shuffle(list);
          int prize = list.remove(0);
          if ("抽奖箱1".equals(getName())) {
            list1.add(prize);
          } else {
            list2.add(prize);
          }
        }

      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
