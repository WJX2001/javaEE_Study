package com.wjx.a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo6 {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "张无忌", "周芷若", "赵敏","张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

    // filter 过滤 把张开头的留下，其余数据过滤不要
    // list.stream().filter(new Predicate<String>() {
    //  @Override
    //  public boolean test(String s) {
    //
    //    // 如果返回值为true 表示当前数据留下
    //    // 如果返回值为false，表示当前数据舍弃不要
    //    return s.startsWith("张");
    //  }
    //}).forEach(s -> System.out.println(s));
    //System.out.println("--------------");
    //// 简单写法
    //list.stream()
    //  .filter(s -> s.startsWith("张"))
    //  .filter(s -> s.length() == 3)
    //  .forEach(s -> System.out.println(s));
    //
    //
    //System.out.println("==================");
    //
    //
    //// limit方法
    ////list.stream().limit(3)
    ////  .forEach(s -> System.out.println(s));
    //
    //// skip方法
    //list.stream().skip(4)
    //  .forEach(s -> System.out.println(s));

    list.stream().skip(3)
      .limit(3).forEach(s -> System.out.println(s));



  }
}
