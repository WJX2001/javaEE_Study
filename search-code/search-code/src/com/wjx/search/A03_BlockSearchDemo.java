package com.wjx.search;

public class A03_BlockSearchDemo {
  public static void main(String[] args) {
    /*
    * 分块查找
    *
    * 核心思想：
    *   块内无序，块间有序
    * 实现步骤：
    *   1.创建数组blockArr存放每一个块对象的信息
    *   2.先查找blockArr确定要查找的数据属于哪一块
    *   3.再单独遍历这一块数据即可
    * */

    // 1.把数据分块
    // 要分为几块： 18开根号 4.24块
    // 18 / 4  = 4.5个


  }


}

class Block {
  private int max; // 最大值
  private int startIndex;
  private int endIndex;

  public Block() {
  }

  public Block(int max, int startIndex, int endIndex) {
    this.max = max;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  /**
   * 获取
   * @return max
   */
  public int getMax() {
    return max;
  }

  /**
   * 设置
   * @param max
   */
  public void setMax(int max) {
    this.max = max;
  }

  /**
   * 获取
   * @return startIndex
   */
  public int getStartIndex() {
    return startIndex;
  }

  /**
   * 设置
   * @param startIndex
   */
  public void setStartIndex(int startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * 获取
   * @return endIndex
   */
  public int getEndIndex() {
    return endIndex;
  }

  /**
   * 设置
   * @param endIndex
   */
  public void setEndIndex(int endIndex) {
    this.endIndex = endIndex;
  }

  public String toString() {
    return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
  }
}

