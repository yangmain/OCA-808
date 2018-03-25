package com.sybex.chapter1;

public class PrimitiveTypes {

  public static void main(String[] args) {

    int max = 2_147_483_______647;
    System.out.println(max);

    // Hex
    int hex = 0x2_2_F;
    System.out.println("hex = " + hex);
    
    
    Animal a = new Animal();
    System.out.println(a.big);
    
//    Animal b;
//    System.out.println(b == null); // Error
    
    if (a.location != null) {
      System.out.println(a.location);
    }

    byte b = 127;
    short s =  b;
    s += 3;
    int x = 4;
    double d = x;
    float f = (float) d;
    
    System.out.println("b : " + b);
    System.out.println("s : " + s);
    System.out.println("x : " + x);
    System.out.println("d : " + d);
    System.out.println("f : " + f);
    
  }

}
