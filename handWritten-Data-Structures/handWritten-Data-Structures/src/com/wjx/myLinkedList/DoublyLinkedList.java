package com.wjx.myLinkedList;

class DoublyListNode {
  int val;
  DoublyListNode next, prev;
  DoublyListNode(int x) {
    val = x;
  }
}


public class DoublyLinkedList {
  public static DoublyListNode createDoublyLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    // 创建头节点
    DoublyListNode head = new DoublyListNode(arr[0]);
    // 创建头指针
    DoublyListNode cur = head;

    for (int i = 1; i < arr.length; i++) {
      DoublyListNode newNode = new DoublyListNode(arr[i]);
      cur.next = newNode;
      newNode.prev = cur;
      cur = cur.next;
    }
    return head;
  }

  public static void printLinkedList(DoublyListNode head) {

    for (DoublyListNode p = head; p != null; p = p.next) {
      System.out.println(p.val);
    }

    System.out.println("-----------------分割线--------------------");
  }

  public static void main(String[] args) {
    // 创建一条双链表
    DoublyListNode head = createDoublyLinkedList(new int[]{1, 2, 3, 4, 5});

    // 从头遍历双链表
    printLinkedList(head);

    // TODO: 在双链表头部插入新节点0
    DoublyListNode newHead = new DoublyListNode(0);
    newHead.next = head;
    head.prev = newHead;
    head = newHead;

    // 打印链表
    printLinkedList(head);

    // TODO: 在双链表尾部插入新节点6
    DoublyListNode tail = head;
    // 先走到链表的最后一个节点
    while (tail.next != null) {
      tail = tail.next;
    }

    // 在链表尾部插入新节点 6
    DoublyListNode newNode = new DoublyListNode(6);
    tail.next = newNode;
    newNode.prev = tail;
    // 更新尾节点引用
    tail = newNode;
    // 打印链表
    printLinkedList(head);


    // TODO: 在双链表中间插入元素
    // 假设在第3个节点后面插入新节点 66
    DoublyListNode p = head;
    for (int i = 0; i < 2; i++) {
      p = p.next;
    }

    // 组装新节点
    DoublyListNode newNode1 = new DoublyListNode(66);
    newNode1.next = p.next;
    newNode1.prev = p;

    // 插入新节点
    p.next.prev = newNode1;
    p.next = newNode1;

    // 打印链表
    printLinkedList(head);


    // TODO: 在双链表中删除一个节点
    // 调整前驱节点和后继节点的指针来摘除目标节点

    // 假设要删除第4个点，需要找到第3个节点
    DoublyListNode p1 = head;
    for(int i=0;i<2;i++) {
      p1 = p1.next;
    }

    // 现在p指向第3个节点，将它后面的那个节点删除
    DoublyListNode toDelete = p1.next;
    // 进行删除
    p1.next = toDelete.next;
    toDelete.next.prev = p1;

    // （可选）将toDelete的前后指针置为null 是好习惯
    toDelete.next = null;
    toDelete.prev = null;

    printLinkedList(head);

    // TODO: 在双链表头部删除一个元素
    DoublyListNode toDelete1 = head;
    head = head.next;
    head.prev = null;

    // 清理已删除节点的指针
    toDelete1.next = null;

    printLinkedList(head);

    // TODO: 在双链表尾部删除一个元素
    DoublyListNode p2 = head;
    while (p2.next != null) {
      p2 = p2.next;
    }

    p2.prev.next = null;
    p2.prev = null;

  }

}



