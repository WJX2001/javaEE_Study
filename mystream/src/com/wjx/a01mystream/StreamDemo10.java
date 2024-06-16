package com.wjx.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo10 {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "张无忌-男-15", "赵敏-女-14", "周芷若-女-13", "殷素素-女-18", "杨不悔-女-16");

    Map<String, Integer> map2 = list.stream()
      .filter(s -> "男".equals(s.split("-")[1]))
      .collect(Collectors.toMap(
        s -> s.split("-")[0],
        s -> Integer.parseInt(s.split("-")[2])
      ));


    System.out.println(map2);
  }
}
