package com.wjx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
  public static void main(String[] args) {


    // 创建两个ArrayList集合
    ArrayList<String> manList = new ArrayList<>();
    ArrayList<String> womanList = new ArrayList<>();

    // 2. 添加数据
    Collections.addAll(manList, "蔡徐坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
    Collections.addAll(womanList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

    // 3. 男演员只要名字为三个字的前两人
    Stream<String> stream1 = manList.stream().filter(s -> s.split(",")[0].length() == 3)
      .limit(2);


    // 4. 女演员只要姓杨的，并且不要第一个
    Stream<String> stream2 = womanList.stream().filter(s -> s.split(",")[0].startsWith("杨"))
      .skip(1);


    // 5. 把过滤后的两个姓名列表进行合并
    // 演员信息封装成Actor对象
    // 这里面的两个泛型，一个是流里面的泛型，第二个是转成对象的泛型
    //Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
    //  @Override
    //  public Actor apply(String s) {
    //    // 赵小颖,35
    //    String name = s.split(",")[0];
    //    int age = Integer.parseInt(s.split(",")[1]);
    //
    //    return new Actor(name, age);
    //  }
    //}).forEach(s -> System.out.println(s));

    // 简略写法
    List<Actor> list = Stream.concat(stream1, stream2).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
        .collect(Collectors.toList());

    System.out.println(list);
  }
}
