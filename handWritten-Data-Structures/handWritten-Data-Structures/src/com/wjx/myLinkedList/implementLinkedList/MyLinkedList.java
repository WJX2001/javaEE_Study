package com.wjx.myLinkedList.implementLinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> {

  // 虚拟头尾节点
  final private Node<E> head, tail;
  private int size;

  // 双链表节点
  private static class Node<E> {
    E val;
    Node<E> next;
    Node<E> prev;

    Node(E val) {
      this.val = val;
    }
  }

  public MyLinkedList() {
    this.head = new Node<>(null);
    this.tail = new Node<>(null);
    // 将头节点和尾节点连接起来
    head.next = tail;
    tail.prev = head;
    this.size = 0;
  }

  /*  增  */

  public void addLast(E e) {
    Node<E> x = new Node<>(e);
    Node<E> temp = tail.prev;
    // temp <-> tail
    temp.next = x;
    x.prev = temp;

    x.next = tail;
    tail.prev = x;
    // temp <-> x <-> tail
    size++;
  }

  public void addFirst(E e) {
    // 这里的虚拟头节点是 head
    Node<E> x = new Node<>(e);
    // 当前虚拟节点的下一个
    Node<E> temp = head.next;

    // head <->temp
    temp.prev = x;
    x.next = temp;

    head.next = x;
    x.prev = head;
    // head <-> x <-> temp
    size++;
  }

  public void add(int index, E element) {
    // 首先校验当前索引是否能添加元素
    checkPositionIndex(index);
    if (index == size) {
      addLast(element);
      return;
    }

    // 找到 index 对应的Node
    Node<E> p = getNode(index);
    Node<E> temp = p.prev;
    // temp <-> p

    // 新要插入的Node
    Node<E> x = new Node<>(element);

    p.prev = x;
    temp.next = x;

    x.prev = temp;
    x.next = p;

    size++;
  }

  /* 删 */

  public E removeFirst() {
    if (size < 1) {
      throw new NoSuchElementException();
    }
    // 虚拟节点的存在使我们不用考虑空指针的问题
    Node<E> x = head.next;
    Node<E> temp = x.next;

    // head <-> x <-> temp
    head.next = temp;
    temp.prev = head;

    x.prev = null;
    x.next = null;

    size--;
    return x.val;
  }

  public E removeLast() {
    if (size < 1) {
      throw new NoSuchElementException();
    }

    Node<E> x = tail.prev;
    Node<E> temp = tail.prev.prev;
    // temp <-> x <-> tail

    tail.prev = temp;
    temp.next = tail;

    x.prev = null;
    x.next = null;

    size--;
    return x.val;
  }

  public E remove(int index) {
    checkElementIndex(index);

    // 找到index对应的Node
    Node<E> x = getNode(index);
    Node<E> prev = x.prev;
    Node<E> next = x.next;
    // prev <-> x <-> next
    prev.next = next;
    next.prev = prev;

    x.prev = x.next = null;
    size--;
    return x.val;
  }

  /* 查 */
  public E get(int index) {
    checkElementIndex(index);
    Node<E> p = getNode(index);
    return p.val;
  }

  public E getFirst() {
    if (size < 1) {
      throw new NoSuchElementException();
    }
    return head.next.val;
  }

  public E getLast() {
    if (size < 1) {
      throw new NoSuchElementException();
    }
    return tail.prev.val;
  }


  public E set(int index, E val) {
    checkElementIndex(index);
    // 找到 index 对应的 Node
    Node<E> p = getNode(index);

    E oldVal = p.val;
    p.val = val;

    return oldVal;
  }


  // TODO: 其他工具类函数

  // 获取当前容量
  public int size() {
    return size;
  }

  // 判断是否为空
  public boolean isEmpty() {
    return size == 0;
  }

  // 拿到对应索引的节点
  private Node<E> getNode(int index) {
    checkPositionIndex(index);
    Node<E> p = head.next;

    for (int i = 0; i < index; i++) {
      p = p.next;
    }
    return p;
  }

  private boolean isElementIndex(int index) {
    return index >= 0 && index < size;
  }

  private boolean isPositionIndex(int index) {
    return index >= 0 && index <= size;
  }


  /**
   * 检查 index 索引位置是否可以存在元素
   */
  private void checkElementIndex(int index) {
    if (!isElementIndex(index))
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
  }

  /*
   * 检查 index 索引位置是否可以添加元素
   */
  private void checkPositionIndex(int index) {
    if (!isPositionIndex(index)) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
  }

  // 展示函数
  private void display() {
    System.out.println("size = " + size);
    for (Node<E> p = head.next; p != null; p = p.next) {
      System.out.println(p.val + " -> ");
    }
    System.out.println("null");
  }

}
