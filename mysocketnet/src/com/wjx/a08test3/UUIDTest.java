package com.wjx.a08test3;

import java.util.UUID;

public class UUIDTest {
  public static void main(String[] args) {
    String str = UUID.randomUUID().toString().replace("-", "");
    System.out.println(str);



  }
}
