package com.sybex.chapter2;

public class Operators {

  public static void main(String[] args) {

    int i = 3;
    double d = i;
    System.out.println("[1] d = " + d);
    
    d = 3 + 2 * --i;
    System.out.println("[2] d = " + d);
  
    d = 3 + 2 * i--;
    System.out.println("[3] d = " + d);
    
    boolean b = true && false;
    System.out.println("[4] b = " + b);

    System.out.println("[5] 9 / 3 = " + 9 / 3 );
    System.out.println("[6] 9.0 / 3 = " + 9.0 / 3 );
    
    System.out.println("[7] 9 / 4 = " + 9 / 4 );
    System.out.println("[8] 9.0 / 4 = " + 9.0 / 4 );
    
    System.out.println("[7] 9 % 4 = " + 9 % 4 );
    System.out.println("[8] 9.0 % 4 = " + 9.0 % 4 );
    
    System.out.println("[9] 26 % 7 = " + 26 % 7 );

  }

}
