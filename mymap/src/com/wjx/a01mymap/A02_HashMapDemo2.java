package com.wjx.a01mymap;

import java.util.*;

public class A02_HashMapDemo2 {

  public static void main(String[] args) {


    // 1. 定义一个数组，存储四个景点
    String[] arr = {"A", "B", "C", "D"};

    // 利用随机数模拟80个同学的投票，并把投票的结果存储起来
    ArrayList<String> list = new ArrayList<>();

    Random r = new Random();
    for (int i = 0; i < 80; i++) {
      int index = r.nextInt(arr.length);
      list.add(arr[index]);
    }

    // 2. 如果要统计的东西比较多，不方便使用计数器思想
    // 可以定义map集合，利用集合进行统计
    HashMap<String, Integer> hm = new HashMap<>();

    for(String name:list){
      // 判断当前的景点在map当中是否存在
      if(hm.containsKey(name)) {
        // 先获取当前惊呆你已经被投票次数
        int count = hm.get(name);
        // 表示当前景点又被投票了一次
        count++;
        // 把新的次数再次添加到集合当中
        hm.put(name,count);
      }else {
        hm.put(name, 1);
      }
    }


    System.out.println(hm);

    // 3. 求最大值
    int max = 0;

    Set<Map.Entry<String, Integer>> entries = hm.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      int count = entry.getValue();
      if(count > max) {
        max = count;
      }
    }

    System.out.println(max);
  }
}
