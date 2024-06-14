package com.wjx.myLinkedList;

public class ListNode {
  private int val;
  private ListNode next;

  public ListNode(int x) {
    this.val = x;
  }

  // 输入一个数组 转换为一条单链表
  public static ListNode createLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    // 将头节点指向为数组第一项元素
    ListNode head = new ListNode(arr[0]);
    // 创建一个当前的指针用于指向当前节点
    ListNode cur = head;
    for (int i = 1; i < arr.length; i++) {
      cur.next = new ListNode(arr[i]);
      cur = cur.next;
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});

    // TODO: 遍历单链表
    //for (ListNode p = head; p != null; p = p.next) {
    //  System.out.println(p.val);
    //}

    // TODO: 在单链表头部插入一个新节点 0
    ListNode newHead = new ListNode(0);
    newHead.next = head;
    head = newHead;

    // TODO: 在单链表尾部插入新元素
    ListNode p = head;
    while (p.next != null) {
      p = p.next;
    }

    // 现在p在链表的最后一个节点
    p.next = new ListNode(6);


    // TODO: 在单链表中间插入新元素
    // 找到要插入位置的前驱节点，然后操作前驱节点把新节点插入进去

    // 需求：在第三个节点后面插入一个新节点 66
    // 先要找到前驱节点，即第3个节点
    ListNode beforeNode = head;
    for (int i = 0; i < 2; i++) {
      beforeNode = beforeNode.next;
    }
    ListNode newNode = new ListNode(66);
    newNode.next = beforeNode.next;

    // 插入新节点
    beforeNode.next = newNode;

    // TODO: 在单链表中删除一个节点
    /*
     *  实现思路：
     *   若想删除某个节点，需要找到节点的前驱节点，然后把这个前驱节点的next指针指向
     * */

    // 假设要删除第4个节点 那么首先要拿到第三个节点

    ListNode current = head;
    for (int i = 0; i < 2; i++) {
      current = current.next;
    }

    current.next = current.next.next;


    // TODO: 删除尾节点 找到倒数第二个节点，然后把他的next指针置为null 即可

    while (current.next.next != null) {
      current = current.next;
    }

    current.next = null;
    for (ListNode cur = head; cur != null; cur = cur.next) {
      System.out.println(cur.val);
    }

  }

}















