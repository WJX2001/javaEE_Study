package com.wjx.a12practice.practiceDemo7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

  ArrayList<Integer> list;

  public MyCallable(ArrayList<Integer> list) {
    this.list = list;
  }

  @Override
  public Integer call() throws Exception {
    ArrayList<Integer> boxList = new ArrayList<>();
    while (true) {
      synchronized (MyCallable.class) {
        if (list.size() == 0) {
          System.out.println(Thread.currentThread().getName() + boxList);
          break;
        } else {
          // 继续抽奖(打乱)
          Collections.shuffle(list);
          int prize = list.remove(0);
          boxList.add(prize);
        }

      }
      Thread.sleep(10);
    }
    // 将集合中的最大值返回
    if (boxList.size() == 0) {
      return null;
    } else {
      return Collections.max(boxList);
    }

  }

}
