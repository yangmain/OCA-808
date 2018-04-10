package com.sybex.chapter3;

import java.util.Arrays;

public class UnderstandingArrays {

  public static void main(String[] args) {

    int[] numbers = new int[3];
    for (int n : numbers) {
      System.out.println(n);
    }

    int[] numbers2 = new int[] {1, 3, 8};
    System.out.println(numbers2.length);
    
    int[] numbers3 = {9, 5, 2};
    System.out.println(numbers3.length);
    
    boolean[] booleans = new boolean[3];
    for (boolean b : booleans) {
      System.out.println(b);
    }

    
    Rectangle[] rectangles = new Rectangle[3];
    for(Rectangle r : rectangles) {
      System.out.println(r);
    }
    
    Rectangle r1 = new Rectangle(3, 5);
    Rectangle[] rectangles1 = {r1, r1, r1};
    System.out.println(Arrays.toString(rectangles1));

    // Casting
    double[] d = {1.21, 3.14, 6.67 }; 
    System.out.println(Arrays.toString(d));
    
//    int[] i = (int[]) d; // That's stupid
    
    
    
  }

  
  
}
