package com.sybex.chapter2.reviewQuestions;

public class ReviewQuestions {

  public static void main(String[] args) {

//    int x = 0;
//    String message = x == 0 ? "Hello" : false; // Does not compile
    
//    long x = 10;
//    int y = 2 * (int) x;

//    int x = 4;
//    if (x < 5) System.out.println("Option A");
//    else System.out.println("Option B");
//    
//    System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    
    for(int i = 0; i < 10; ) {
      System.out.println("i when entering loop : " + i);
      i = i ++;
      System.out.println("i when leaving loop : " + i);
    }
    
//    final char a = 'A', b = 'B';
//    b = 'C';
    
    int plus = 1;
    System.out.println("plus : " + plus);
    System.out.println("plus++ : " + plus++);
    System.out.println("plus : " + plus);
    
    final int f = 10, g = 30; // both are final
//    f++;
//    g++;
    
//    String ternaryTest = true ? "Yes" : false; // DNC
    
  }

}
