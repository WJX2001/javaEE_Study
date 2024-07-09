package com.wjx.myHashMap;

import java.util.LinkedList;

// 使用拉链法解决哈希冲突的简化实现
public class ExampleChainingHashMap {

  // 链表节点，存储key-value对儿

  static class KVNode {
    int key;
    int value;

    public KVNode(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  // 底层 table 数组中的每个元素是一个链表
  private LinkedList<KVNode>[] table;

  public ExampleChainingHashMap(int capacity) {
    table = new LinkedList[capacity];
  }

  // 生成一个哈希值
  private int hash(int key) {
    return key % table.length;
  }

  // 查
  public int get(int key) {
    // 1. 获取一个hash值
    int index = hash(key);
    if (table[index] == null) {
      // 链表为空 说明key不存在
      return -1;
    }

    LinkedList<KVNode> list = table[index];
    for (KVNode node : list) {
      if (node.key == key) {
        return node.value;
      }
    }
    // 链表中没有目标key
    return -1;
  }

  // 增/改
  public void put(int key, int value) {
    int index = hash(key);

    if (table[index] == null) {
      // 链表为空，新建一个链表，插入 key-value
      table[index] = new LinkedList<>();
      table[index].add(new KVNode(key, value));
      return;
    }

    // 链表不为空，要遍历一遍看看 key是否已经存在
    LinkedList<KVNode> list = table[index];
    for (KVNode node : list) {
      if (node.key == key) {
        // key 已经存在,更新value
        node.value = value;
        return;
      }
    }

    // 链表中没有key 添加新节点
    // 这里使用 addFirst 添加到链表头部 或者 addLast 添加到尾部
    list.addLast(new KVNode(key, value));
  }

  // 删
  public void remove(int key) {
    int index = hash(key);
    LinkedList<KVNode> list = table[index];
    if (list == null) {
      return;
    }
    // 如果key存在，则删除
    list.removeIf(node -> node.key == key);

  }
}












