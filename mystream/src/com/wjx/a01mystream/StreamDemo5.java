package com.wjx.a01mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
  public static void main(String[] args) {
    // 一堆零散数据

    Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
    Stream.of("a","b","c","d").forEach(e -> System.out.println(e));

  }
}
