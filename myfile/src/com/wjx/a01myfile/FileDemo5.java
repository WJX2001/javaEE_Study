package com.wjx.a01myfile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo5 {
  public static void main(String[] args) {


    // 1.listRoots 获取系统中所有的盘符
    File[] files = File.listRoots();
    System.out.println(Arrays.toString(files));

    // 2.获取当前该路径下，所有内容（仅仅能获取名字）
    File f2 = new File("/Users/wjx2020/Desktop/qiuzhao");

    // accept 方法的形参，依次表示文件夹里面的每一个文件或者文件夹的路径
    // 参数一：父级路径
    // 参数二：子级路径
    // 返回值：如果返回值为true，就表示当前路径保留，如果为false，表示当前路径舍弃不要

    String[] list = f2.list(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        File src = new File(dir,name);
        if(src.isFile() && name.endsWith(".md")){
          return true;
        }else {
          return false;
        }
      }
    });

    f2.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return false;
      }
    });

    System.out.println(Arrays.toString(list));

  }
}
