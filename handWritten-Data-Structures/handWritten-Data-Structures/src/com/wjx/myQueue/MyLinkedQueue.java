package com.wjx.myQueue;

import java.util.LinkedList;

public class MyLinkedQueue<E> {

  // 声明一个链表
  private LinkedList<E> list = new LinkedList<>();

  // 向队列尾部插入元素，时间复杂度O(1)
  public void push(E e) {
    list.addLast(e);
  }

  // 从队列头部删除元素，时间复杂度为O(1)
  public E pop() {
    return list.removeFirst();
  }

  public E peek() {
    return list.getFirst();
  }

  public int size() {
    return list.size();
  }

}
