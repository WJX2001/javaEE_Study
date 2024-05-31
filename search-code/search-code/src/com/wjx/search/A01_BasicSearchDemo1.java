package com.wjx.search;

public class A01_BasicSearchDemo1 {
  public static void main(String[] args) {
    /*
    * 基本查找
    * 核心：从0索引开始挨个往后查找
    * */

    // 需求：定义一个方法利用基本查找，查询某个元素是否存在


  }

  public static boolean basicSearch(int[] arr,int number) {
    // 利用基本查找来查找number在数组中是否存在
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == number) {
        return true;
      }
    }
    return false;
  }
}
