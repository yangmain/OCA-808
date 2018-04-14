package com.sybex.chapter4;

public class Varargs {

  public static void main(String[] args) {
    walk(1);
    walk(1, 2);
    walk(1, 2, 3, 4);
    walk(1, new int[] {2, 3, 4});

    run(1, null);
  }
  
  public static void walk(int start, int... nums) {
    System.out.println(nums.length);
  }
  
  public static void run(int start, int... nums) {
    if(nums != null) {
      System.out.println(nums.length);
    } else {
      System.out.println("null");
    }
  }
  
}
