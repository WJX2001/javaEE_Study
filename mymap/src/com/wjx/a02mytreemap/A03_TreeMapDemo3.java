package com.wjx.a02mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;

public class A03_TreeMapDemo3 {
  public static void main(String[] args) {

    /*
     * 统计字符串中每一个字符出现的次数，并按照以下格式输出
     * 输出结果：
     * a(5)b(4)c(3)d(2)e(1)
     *
     * 分析：
     *   统计 ----> 计数器思想
     *   弊端：如果要统计的东西比较多
     *
     * HashMap:
     * TreeMap:
     * 如果题目中没有要求对结果进行排序，默认使用HashMap
     * 如果题目要求对结果进行排序，请使用treeMap
     *
     * 键：是要统计的内容
     * 值：表示次数
     *
     *
     * */

    // 1. 定义字符串
    String s = "aababcabcdabcde";

    // 2. 创建集合
    TreeMap<Character, Integer> tm = new TreeMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (tm.containsKey(c)) {
        // 存在
        // 先把已经存在的次数拿出来
        tm.put(c, tm.get(c) + 1);
      } else {
        tm.put(c, 1);
      }
    }

    System.out.println(tm);
    // 遍历集合 进行拼接
    // StringBuilder StringJoiner
    StringBuilder sb = new StringBuilder();
    tm.forEach((k, v) -> sb.append(k).append("(").append(v).append(")"));

    StringJoiner stringJoiner = new StringJoiner("","","");
    tm.forEach((k,v) -> stringJoiner.add(k+"").add("(").add(v+"").add(")"));


    System.out.println(sb);

  }
}
