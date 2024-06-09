package com.wjx.myArraylist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<E> {
  // 真正存储数据的底层数据
  private E[] data;
  // 记录当前元素个数
  private int size;
  // 默认初始容量
  private static final int INIT_CAP = 1;

  public MyArrayList() {
    this(INIT_CAP); // 其实执行了MyArrayList(1)
  }

  public MyArrayList(int initCapacity) {
    data = (E[]) new Object[initCapacity];
    size = 0;
  }

  // TODO: 在尾部添加元素
  public void addLast(E e) {
    int cap = data.length;

    // 看看当前data数组容量够不够
    if (size == cap) {
      // 进行扩容
      resize(2 * cap);
    }

    // 在尾部插入元素
    data[size] = e;
    size++;
  }

  // TODO: 添加元素（通用）
  public void add(int index, E e) {
    // 检查索引是否越界
    checkPositionIndex(index);

    int cap = data.length;
    // 查看剩余容量
    if (size == cap) {
      resize(2 * cap);
    }

    // 搬移数据 data[index..] -> data[index+1..]
    // 给新元素腾出位置
    for (int i = size - 1; i >= index; i--) {
      data[i + 1] = data[i];
    }

    // 插入新元素
    data[index] = e;
    size++;
  }

  // TODO: 添加元素（头部）
  public void addFirst(E e) {
    add(0, e);
  }

  // TODO: 删除操作（尾部）
  public E removeLast() {
    if (size == 0) {
      throw new NoSuchElementException();
    }

    int cap = data.length;
    // 可以缩容，节约空间
    if (size == cap / 4) {
      resize(cap / 2);
    }

    E deletedVal = data[size - 1];
    // 将最后一个元素删除
    // 必须给最后一个元素设置为null，否则会内存泄露
    data[size - 1] = null;
    size--;
    return deletedVal;
  }

  public E remove(int index) {
    // 检查索引越界
    checkElementIndex(index);

    int cap = data.length;
    // 可以缩容，节约空间
    if (size == cap / 4) {
      resize(cap / 2);
    }

    E deleteVal = data[index];

    data[size - 1] = null;
    size--;

    return deleteVal;
  }

  public E removeFirst() {
    return remove(0);
  }


  // 查
  public E get(int index) {
    // 检查索引越界
    checkElementIndex(index);

    return data[index];
  }


  // 改
  public E set(int index, E element) {
    // 检查索引越界
    checkElementIndex(index);
    // 修改数据
    E oldVal = data[index];
    data[index] = element;
    return oldVal;
  }

  // 工具方法
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }



  // TODO: 将data的容量改为newCap (扩容)
  private void resize(int newCap) {
    E[] temp = (E[]) new Object[newCap];

    for (int i = 0; i < size; i++) {
      temp[i] = data[i];
    }

    data = temp;
  }

  // TODO: 检查索引是否在当前元素的有效范围内，即是否是一个合法的元素索引
  private boolean isElementIndex(int index) {
    return index >= 0 && index < size;
  }

  // TODO: 检查是否是一个合法的插入位置索引 可以等于size
  private boolean isPositionIndex(int index) {
    return index >= 0 && index <= size;
  }

  // TODO：检查index索引位置是否可以存在元素
  private void checkElementIndex(int index) {
    if (!isElementIndex(index)) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
  }


  // TODO: 检查 index 索引位置是否可以添加元素
  private void checkPositionIndex(int index) {
    if (!isPositionIndex(index)) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
  }

  private void display() {
    System.out.println("size = " + size + " cap = " + data.length);
    System.out.println(Arrays.toString(data));
  }


  public static void main(String[] args) {
    MyArrayList<Integer> arr = new MyArrayList<>(3);

    for (int i = 0; i <=5; i++) {
      arr.addLast(i);
    }

    arr.remove(3);
    arr.add(1,9);
    arr.addFirst(100);

    int val = arr.removeLast();

    for (int i = 0; i < arr.size; i++) {
      System.out.println(arr.get(i));
    }

  }


}
