package com.wjx.myQueue;

import java.util.LinkedList;


/*
*  相当于将双链表尾部作为栈顶，在双链表尾部增删元素的时间复杂度为O(1)
*  同理，可以将双链表头部作为栈顶
* */


public class MyLinkedStack<E> {
  private LinkedList<E> list = new LinkedList<>();

  // 向栈顶加入元素，时间复杂度为 O(1)
  public void push(E e) {
    list.addLast(e);
  }

  // 从栈顶弹出元素，时间复杂度为O(1)
  public E pop() {
    return list.removeLast();
  }

  // 查看栈顶元素，时间复杂度为O(1)
  public E peek() {
    return list.getLast();
  }

  // 返回栈中的元素个数，时间复杂度O(1)
  public int size() {
    return list.size();
  }


}
