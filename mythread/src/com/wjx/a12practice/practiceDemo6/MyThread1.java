package com.wjx.a12practice.practiceDemo6;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread1 extends Thread {

  ArrayList<Integer> list;

  public MyThread1(ArrayList<Integer> list) {
    this.list = list;
  }



  @Override
  public void run() {
    ArrayList<Integer> boxList = new ArrayList<>();
    while (true) {
      synchronized (MyThread.class) {
        if (list.size() == 0) {
          System.out.println(getName() + boxList);
          break;
        } else {
          // 继续抽奖(打乱)
          Collections.shuffle(list);
          int prize = list.remove(0);
          boxList.add(prize);
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
