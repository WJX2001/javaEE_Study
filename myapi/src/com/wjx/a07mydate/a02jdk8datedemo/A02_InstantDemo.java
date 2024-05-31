package com.wjx.a07mydate.a02jdk8datedemo;

import java.time.Instant;

public class A02_InstantDemo {
  public static void main(String[] args) {


    // 1. 获取当前时间的Instant对象（标准时间）
    Instant now = Instant.now();

    // 2. 根据（秒/毫秒/纳秒）获取Instant对象
    Instant instant1 = Instant.ofEpochMilli(0L);
    System.out.println(instant1);
  }
}
