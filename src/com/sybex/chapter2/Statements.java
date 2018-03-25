package com.sybex.chapter2;

public class Statements {

  public static void main(String[] args) {

    boolean b = true;
    int x = 9;
    
    x = b ? increase(x) : decrease(x);
//    x = b ? 1 : 2;
//    b ? print("The true") : print("The false");

    // Switch
    System.out.println("x is : " + x);
    switch (x) {
      case 0 :
        System.out.println("Zero");
      case 1 :
        System.out.println("Uno");
      case 2 :
        System.out.println("Two");
      default :
        System.out.println("Default case.");
    }
    
  }

  public static int increase(int x) {
    return ++x;
  }
  
  public static int decrease(int x) {
    return --x;
  }
  
  public static void print(String s) {
    System.out.println(s);
  }
}
