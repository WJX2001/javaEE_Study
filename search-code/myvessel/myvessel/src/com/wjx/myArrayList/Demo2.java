package com.wjx.myArrayList;

import java.util.ArrayList;

public class Demo2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    ListUtil.addAll(list,"a","b","c","d");

    System.out.println(list);
  }
}
