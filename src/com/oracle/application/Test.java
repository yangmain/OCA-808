package com.oracle.application;

import com.sybex.chapter1.Animal;

public class Test {
  
  public static void main(String[] args) throws Exception {
    System.out.println("Hello from Test class!");

    System.gc(); // because why not?
    
    Animal a = new Animal();
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
