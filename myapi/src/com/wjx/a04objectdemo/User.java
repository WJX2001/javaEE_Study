package com.wjx.a04objectdemo;

import java.util.Arrays;


// Cloneable
// 如果一个接口里面没有抽象方法
// 表示当前的接口是一个标记性接口
// 现在Cloneable表示一旦实现，那么当前类的对象就可以被克隆
// 如果没有实现，当前类的对象就不能克隆


public class User implements Cloneable{
  private int id;
  private String username;
  private String password;
  private String path;
  private int[] data; // 游戏进度

  public User() {
  }

  public User(int id, String username, String password, String path, int[] data) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.path = path;
    this.data = data;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", path='" + path + '\'' +
      ", data=" + Arrays.toString(data) +
      '}';
  }


  @Override
  public User clone() {
    try {

      User clone = (User) super.clone();
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      return clone;

    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
