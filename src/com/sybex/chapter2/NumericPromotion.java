package com.sybex.chapter2;

public class NumericPromotion {

  public static void main(String[] args) {

    byte b1 = 2;
    byte b2 = 3;

//    byte b3 = b1 + b2; // Error
    int b4 = b1 + b2;
    
    short s1 = 2;
    short s2 = 3;
    
//    short s3 = b1 + b2; // Error
    int s4 = s1 + s2;
    
    short x = 14;
    float y = 13;
    double z = 30;
    
    double result1 = x * y / z;

    double d1 = 39.21;
//    float f1 = 2.1; // Error
    
    System.out.println("float y = " + y); // prints ... 13.0
    
    long m = 2;
    long n = m = 3;
    long o = m = n = 4;
    System.out.println("m = " + m);
    System.out.println("n = " + n);
    System.out.println("o = " + o);
        
  }

}
