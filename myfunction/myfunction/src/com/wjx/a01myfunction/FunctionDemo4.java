package com.wjx.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo4 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13","张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,52");

    // 类名::new
    // 封装成Student对象并收集到List集合中
    // String - Student
    //List<Student> list1 = list.stream().map(new Function<String, Student>() {
    //  @Override
    //  public Student apply(String s) {
    //    String[] arr = s.split(",");
    //    String name = arr[0];
    //    int age = Integer.parseInt(arr[1]);
    //    return new Student(name, age);
    //  }
    //}).collect(Collectors.toList());
    //System.out.println(list1);

    List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
    System.out.println(newList2);

  }
}

