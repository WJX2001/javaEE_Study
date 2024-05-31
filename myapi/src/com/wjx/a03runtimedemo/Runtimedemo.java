package com.wjx.a03runtimedemo;

public class Runtimedemo {
  public static void main(String[] args) {


    // 1.获取runtime的对象
    // Runtime r = new Runtime();
    //Runtime r1 = Runtime.getRuntime();

    // 2.exit 停止虚拟机

    // 3.获取CPU的线程数
    System.out.println(Runtime.getRuntime().availableProcessors()); // 8

    // 4.总内存大小 单位byte
    System.out.println(Runtime.getRuntime().maxMemory());  //4294967296

    // 5.已经获取的总内存大小
    System.out.println(Runtime.getRuntime().totalMemory());

    // 6.剩余内存大小
    System.out.println(Runtime.getRuntime().freeMemory());

    // 7.运行cmd命令
    // shutdown：关机
    // 加上参数才能执行，-s 默认在1分钟之后关机
    // -s: 默认在1分钟之后关机
    // -t 指定时间：指定关机时间
    // -a: 取消关机操作
    // -r: 关机并重启

    


  }
}
