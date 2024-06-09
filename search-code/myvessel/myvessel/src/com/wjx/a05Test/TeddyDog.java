package com.wjx.a05Test;

public class TeddyDog extends Dog{
  @Override
  public void eat() {
    System.out.println("一只叫做"+getName()+"的,"+getAge()+"岁的泰迪，正在啃骨头，边吃边蹭");
  }
}
