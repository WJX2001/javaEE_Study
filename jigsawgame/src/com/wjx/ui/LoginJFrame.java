package com.wjx.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

  // 登陆界面

  // 构造方法
  public LoginJFrame() {
    /*
    * TODO: 在创建登陆界面的时候，同时给这个界面去设置一些信息
    *  比如： 宽高，直接展示出来
    * */

    this.setSize(488,430);


    // 设置界面的标题
    this.setTitle("登陆界面");

    // 设置界面置顶
    this.setAlwaysOnTop(true);

    // 设置界面居中
    this.setLocationRelativeTo(null);

    // 设置关闭方式
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    this.setVisible(true);

  }
}
