package com.wjx.a01netAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
  public static void main(String[] args) throws UnknownHostException {


    // 1. 获取InetAddress的对象
    InetAddress byName = InetAddress.getByName("192.168.1.100");
    System.out.println(byName);

    // 2.
  }
}
