package com.wjx.a04test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list,"a","b","c","d","e","f","g");
    Random r = new Random();
    // 10 0~9
    int index = r.nextInt(list.size());
    String s = list.get(index);
    System.out.println(s);
  }
}
