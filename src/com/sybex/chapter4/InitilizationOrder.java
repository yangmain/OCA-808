package com.sybex.chapter4;

public class InitilizationOrder {

  public String name = "name";
  
  { System.out.println(name); }

  private static int count = 0;
  
  static { System.out.println(count); }
  
  { count++; System.out.println(count); }
  
  public InitilizationOrder() {
    System.out.println("constructor");
  }
  
  public static void main(String[] args) {
    System.out.println("road to construct");
    new InitilizationOrder();
  }

}
