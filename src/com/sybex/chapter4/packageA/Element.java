package com.sybex.chapter4.packageA;

public class Element {

  private int durability;
  
  public Element(int durability) {
    this.durability = durability;
  }
  
  protected int getDurability() {
    return this.durability;
  }
  
}
