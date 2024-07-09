package com.wjx.myHashMap;

import java.util.LinkedList;
import java.util.List;

public class MyChainingHashMap<K, V> {

  // 拉链法使用的单链表节点，存储 key-value对
  private static class KVNode<K, V> {
    K key;
    V value;

    // 使用了内置的LinkedList 类

    public KVNode(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  // 哈希表的底层数组，每个数组元素都是一个链表，链表中每个节点是KVNode
  private LinkedList<KVNode<K, V>>[] table;

  // 哈希表中存入的键值对个数
  private int size;
  // 底层数组的初始容量
  private static final int INIT_CAP = 4;

  // 相当于调用了有参构造函数
  public MyChainingHashMap() {
    this(INIT_CAP);
  }

  public MyChainingHashMap(int initialCapacity) {
    size = 0;
    // 初始化哈希表
    table = (LinkedList<KVNode<K, V>>[]) new LinkedList[initialCapacity];
    for (int i = 0; i < table.length; i++) {
      table[i] = new LinkedList<>();
    }
  }



  /* 增/改 */

  // 添加 key -> val 键值对
  // 如果键 key 已存在，则将值修改为val
  public void put(K key, V value) {
    if (key == null) {
      throw new IllegalArgumentException("key is null");
    }
    LinkedList<KVNode<K,V>> list = table[hash(key)];
    // 如果key 之前存在，则修改对应的val
    for (KVNode<K, V> node : list) {
      if(node.key.equals(key)) {
        node.value = value;
        return;
      }
    }

    // 如果key之前不存在，则插入 size增加
    list.add(new KVNode<>(key, value));
    size++;

    // 如果元素数量超过了负载因子，进行扩容
    if(size >= table.length * 0.75) {
      resize(table.length * 2);
    }
  }

  // TODO: 删除功能
  public void remove(K key) {
    if(key == null) {
      throw new IllegalArgumentException("key is null");
    }

    LinkedList<KVNode<K, V>> list = table[hash(key)];
    // 如果存在key 则删除 size减少
    for (KVNode<K, V> node : list) {
      if(node.key.equals(key)) {
        list.remove(node);
        size--;

        // 缩容 当负载因子小于0.125时，缩容
        if(size <= table.length / 8) {
          resize(table.length / 4);
        }
        return;
      }
    }

  }


  // TODO: 查

  // 返回 key 对应的val,如果key不存在，则返回null
  public V get(K key) {
    if(key == null) {
      throw new IllegalArgumentException("key is null");
    }
    LinkedList<KVNode<K, V>> list = table[hash(key)];
    for (KVNode<K, V> node : list) {
      if(node.key.equals(key)) {
        return node.value;
      }
    }
    return null;
  }

  // 返回所有的key
  public List<K> keys(){
    List<K> keys = new LinkedList<>();
    for (LinkedList<KVNode<K, V>> list : table) {
      for (KVNode<K, V> node : list) {
        keys.add(node.key);
      }
    }
    return keys;
  }



  /* 工具类函数 */

  // 生成一个哈希值
  private int hash(K key) {
    return (key.hashCode() & 0x7fffffff) % table.length;
  }

  // 扩容函数
  private void resize(int newCap) {
    // 构造一个更大容量的HashMap
    MyChainingHashMap<K,V> newMap = new MyChainingHashMap<>(newCap);
    // 穷举当前HashMap中的所有键值对
    for (LinkedList<KVNode<K, V>> list: table) {
      for (KVNode<K, V> node : list) {
        // 将键值对赚到新的HashMap中
        newMap.put(node.key, node.value);
      }
    }
    // 将当前 HashMap的底层 table替换掉
    this.table = newMap.table;
  }

  public static void main(String[] args) {
    MyChainingHashMap<Integer, Integer> map = new MyChainingHashMap<>();
    map.put(1, 1);
    map.put(2, 2);
    map.put(3, 3);
    System.out.println(map.get(1)); // 1
    System.out.println(map.get(2)); // 2

    map.put(1, 100);
    System.out.println(map.get(1)); // 100

    map.remove(2);
    System.out.println(map.get(2)); // null

    System.out.println(map.keys()); // [1, 3]（顺序可能不同
  }
}









