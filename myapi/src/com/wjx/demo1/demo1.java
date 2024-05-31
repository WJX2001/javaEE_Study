package com.wjx.demo1;

public class demo1 {
  public static void main(String[] args) {

    // TODO: abs 取绝对值
    System.out.println(Math.abs(-88));

    // bug:
    // 以int类型为例，取值范围： -2147483648 ~ 2147483647
    // 如果没有正数与负数对应，那么传递负数结果有误
    // -2147483648 没有正数与之对应，所以abs结果产生bug
    System.out.println(Math.abs(-2147483647));
//    System.out.println(Math.absExact(-2147483648));


    // TODO: ceil 向上取整

    // 进一法 往数轴的正方向进一
    System.out.println(Math.ceil(12.34));
    System.out.println(Math.ceil(12.54));


    // TODO: floor 向下取整
    // 去尾法
    System.out.println(Math.floor(12.34));

    // TODO: round 四舍五入
    System.out.println(Math.round(12.65));

    // TODO: max 获取两个正数的较大值


  }
}
