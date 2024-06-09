package com.wjx.myArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("a");
    list.add("b");
    list.add("c");

    /*
    * iterator()：生成一个迭代器对象，默认指向集合的0索引处
    * hasNext()： 判断当前指向的位置是否有元素
    * next：1.获取元素 2.移动指针
    * */

    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      String str = it.next();
      System.out.println(str);
    }
  }
}
