package com.sybex.chapter4;

public class Overloading {

  public static void main(String[] args) {

    Overloading o  = new Overloading();
    o.fly();
    o.fly(100);
    
    Integer i = 3;
    Integer j = new Integer(5);
    System.out.println(i + " - " + j);
    
    o.intAndLong(3, 3);
  }

  public void fly() {
    System.out.println("Fly!");
  }
  
  public void fly(int distance) {
    System.out.println("Fly " + distance + " meters!");
  }
  
  // DOES NOT COMPILE
//  public int fly(int distance) {
//    System.out.println("Fly " + distance + " meters!");
//    return distance;
//  }
  
  public void intAndLong(int i, long l) {
    System.out.println("int long");
  }

  // Anbiguous with previous method
//  public void intAndLong(long l, int i) {
//    System.out.println("long int");
//  }
  
  public void intAndLong(int... nums) {
    System.out.println("varargs");
  }
  
}
