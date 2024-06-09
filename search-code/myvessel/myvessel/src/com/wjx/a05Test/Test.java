package com.wjx.a05Test;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {

    ArrayList<PersianCat> list1 = new ArrayList<>();
    ArrayList<LiHuaCat> list2 = new ArrayList<>();
    ArrayList<TeddyDog> list3 = new ArrayList<>();
    ArrayList<HuskyDog> list4 = new ArrayList<>();



  }


  // 能养所有品种的猫，但是不能养狗
  public static void keepPet(ArrayList<? extends Cat> list) {

  }

  // 能养所有品种的狗，但是不能养猫
  public static void keepPet2(ArrayList<? extends Dog> list) {

  }



}
