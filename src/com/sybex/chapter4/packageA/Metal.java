package com.sybex.chapter4.packageA;

public class Metal extends Element {

  public int conductivity;
  
  public Metal(int durability) {
    super(durability);
    
    System.out.println(super.getDurability());
  }

//  protected int getDurability() {
//    return 100;
//  }
  
}
