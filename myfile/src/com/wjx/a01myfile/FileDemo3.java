package com.wjx.a01myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
  public static void main(String[] args) {


    // 1.length 返回文件的大小（字节数量）
    File f1 = new File("/Users/wjx2020/Desktop/1.png");
    long length = f1.length();
    System.out.println(length);

    File f2  = new File("/Users/wjx2020/Desktop/qiuzhao");
    System.out.println(f2.length());


    // 2.获取文件的绝对路径
    File f3 = new File("/Users/wjx2020/Desktop/1.png");
    File absoluteFile = f3.getAbsoluteFile();
    System.out.println(absoluteFile);



    // 3. lastModified
    File f4 = new File("/Users/wjx2020/Desktop/1.png");
    long l = f4.lastModified();
    System.out.println(l); // 1693846596078

    // 这里需要转换成  yyyy年MM月dd日 HH:mm:ss
    // 创建一个Date对象
    Date date = new Date(l);

    System.out.println(date);
    // 创建SimpleDateFormat对象并定义日期格式
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    // 将日期对象格式化成指定格式的字符串
    String formattedDate = sdf.format(date);
    System.out.println(formattedDate);


  }
}
