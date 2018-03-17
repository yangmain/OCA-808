package com.oracle.application;

public class Test {
  
  public static void main(String[] args) throws Exception {
    System.out.println("Hello from Test class!");
  }
  
}
 
class Child extends Test {
  
  public final static void main(String[] args) throws Exception {
    System.out.println("Hello from child class!");
  }
  
}
