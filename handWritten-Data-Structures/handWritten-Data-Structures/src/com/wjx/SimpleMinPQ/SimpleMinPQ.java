package com.wjx.SimpleMinPQ;

public class SimpleMinPQ {

  // 创建一个索引
  private final int[] heap;
  private int size;

  public SimpleMinPQ(int capacity) {
    // 索引0空着不用
    heap = new int[capacity + 1];
    size = 0;
  }

  public int size() {
    return size;
  }

  // 父节点的索引
  int parent(int node) {
    return node / 2;
  }

  // 左子节点的索引
  int left(int node) {
    return node * 2;
  }

  // 右子节点的索引
  int right(int node) {
    return node * 2 + 1;
  }

  // 交换两个数组的两个元素
  private void swap(int i, int j) {
    int tmp = heap[i];
    heap[i] = heap[j];
    heap[j] = tmp;
  }

  // 查，返回堆定元素，时间复杂度O(1)
  public int peek() {
    // 索引0空着不用，所以堆顶元素是索引1
    return heap[1];
  }

  // 增，向堆中插入一个元素，时间复杂度 O(logN)
  public void push(int x) {
    // 把新元素放到最后
    heap[++size] = x;
    // 然后上浮到正确位置
    swim(size);
  }

  // 删除操作，删除堆顶元素，时间复杂度 O(logN)
  /*
   *  将最右下角的元素放在堆顶，然后下沉
   * */
  public int pop() {
    int res = heap[1];
    // 把堆底元素 放到堆顶
    heap[1] = heap[size--];
    // 然后下沉到正确位置
    sink(1);
    return res;
  }


  // 上浮操作，时间复杂度是树高 O(logN)
  private void swim(int x) {
    while (x > 1 && heap[parent(x)] > heap[x]) {
      swap(parent(x), x);
      x = parent(x);
    }
  }

  // 下沉操作,
  private void sink(int x) {
    while (left(x) <= size || right(x) <= size) {
      int min = x;
      if (left(x) <= size && heap[left(x)] < heap[min]) {
        min = left(x);
      }
      if (right(x) <= size && heap[right(x)] < heap[min]) {
        min = right(x);
      }

      if (min == x) {
        break;
      }

      swap(x, min);
      x = min;
    }
  }


}
