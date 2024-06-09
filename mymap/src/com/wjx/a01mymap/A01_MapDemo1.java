package com.wjx.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A01_MapDemo1 {
  public static void main(String[] args) {

    // 1. 创建Map集合的对象
    Map<String, String> map = new HashMap<>();

    // 2. 添加元素
    map.put("name", "wjx");
    map.put("age", "18");
    map.put("age", "26");

    System.out.println(map);

    // 3. 获取所有的键，把这些键放到一个单列集合中
    Set<String> keys = map.keySet();

    // 遍历单列集合，打印所有的键
    for (String key : keys) {
      System.out.println(key + "=" + map.get(key));
    }

    // 获取所有的键值对 对象
    Set<Map.Entry<String, String>> entries = map.entrySet();

    // 遍历entries 这个集合，去得到里面的每一个键值对 对象
    for (Map.Entry<String, String> entry : entries) {
      String key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + "=" + value);
    }


    // TODO: lambda表达式
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println(key + "=" + value);
      }
    });

    map.forEach((key, value) -> {
      System.out.println(key + "=" + value);
    });

  }
}
