package com.oracle.application;

import java.util.ArrayList;

import com.sybex.chapter1.Animal;

public class Test {
  
  public static void main(String[] args) throws Exception {
    System.out.println("Hello from Test class!");

    System.gc(); // because why not?
    
    Animal a = new Animal();
    
    varargsMethod();
    varargsMethod(1, 2, 3);
  }
  
  
  
  public static void varargsMethod(int... is) {
    System.out.println("is.length : " + is.length);
    for(int i : is) {
      System.out.println("i : " + i);
    }
  }
  
}
 
class Child extends Test {
  
  public final static void main(String[] args) throws Exception {
    System.out.println("Hello from child class!");
  }

  /**
   * This is an inner class.
   */
  class InnerChild {
    // Some code goes here...
  }
  
}
