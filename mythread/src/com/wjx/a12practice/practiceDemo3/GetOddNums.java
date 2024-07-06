package com.wjx.a12practice.practiceDemo3;

public class GetOddNums implements Runnable {

  private static int num = 1;
  private String name;

  public GetOddNums(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    while (true) {
      synchronized (GetOddNums.class) {
        if (num <= 100) {
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }

          if (num % 2 == 1) {
            System.out.println(name +"这是奇数:" + num);
            num++;
          }
          num++;
        } else {
          break;
        }
      }
    }
  }


  public static void main(String[] args) {
    Thread r1 = new Thread(new GetOddNums("小红"));
    Thread r2 = new Thread(new GetOddNums("小明"));

    r1.start();
    r2.start();
  }

}
