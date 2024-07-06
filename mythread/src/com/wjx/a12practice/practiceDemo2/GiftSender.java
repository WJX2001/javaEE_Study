package com.wjx.a12practice.practiceDemo2;

public class GiftSender implements Runnable{

  // 初始礼品树立那个
  private static int giftCount = 100;
  private String senderName;

  public GiftSender(String senderName) {
    this.senderName = senderName;
  }

  @Override
  public void run() {
    while (giftCount > 10) { // 当剩余的礼品小于10份的时候停止发送
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(senderName+"正在发送礼物，礼品剩余"+giftCount+"份");
      giftCount--;
    }
    System.out.println(senderName+"总共发送了"+(100-giftCount)+"份礼物");
  }

  public static void main(String[] args) {
    Thread redThread = new Thread(new GiftSender("小红"));
    Thread blueThread = new Thread(new GiftSender("小明"));

    redThread.start();
    blueThread.start();
  }
}
