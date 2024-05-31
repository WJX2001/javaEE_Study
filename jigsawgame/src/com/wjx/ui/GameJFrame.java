package com.wjx.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

  /*
   * JFrame 界面 窗体
   * 游戏的主界面
   * */

  public GameJFrame() {

    // 初始化界面
    initFrame();

    // 初始化菜单
    initJMenuBar();

    // 初始化图片
    initImage();

    // 显示出来
    this.setVisible(true);
  }

  private void initImage() {
    ImageIcon icon = new ImageIcon("/Users/wjx2020/Desktop/code/java-code/basic-code/jigsawgame/image/animal/animal1/3.jpg");
    // 创建一个JLabel对象（管理容器）
    JLabel jLabel = new JLabel(icon);
    // 把管理容器添加的界面中
    this.add(jLabel);
  }

  private void initJMenuBar() {
    // 初始化菜单
    // 创建菜单对象
    JMenuBar jMenuBar = new JMenuBar();

    // 创建菜单选项
    JMenu functionJmenu = new JMenu("功能");
    JMenu aboutJmenu = new JMenu("关于我们");

    // 创建选项那个下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    functionJmenu.add(replayItem);
    functionJmenu.add(reLoginItem);
    functionJmenu.add(reLoginItem);
    functionJmenu.add(closeItem);

    aboutJmenu.add(accountItem);


    jMenuBar.add(functionJmenu);
    jMenuBar.add(aboutJmenu);

    // 给整个界面设置菜单
    this.setJMenuBar(jMenuBar);
  }

  private void initFrame() {
    // 设置界面的宽高
    this.setSize(603, 680);

    // 设置界面的标题
    this.setTitle("拼图单机版 v1.0");

    // 设置界面置顶
    this.setAlwaysOnTop(true);

    // 设置界面居中
    this.setLocationRelativeTo(null);

    // 设置关闭方式
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }


}
