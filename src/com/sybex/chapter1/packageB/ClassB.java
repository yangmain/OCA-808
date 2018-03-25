package com.sybex.chapter1.packageB;

import com.sybex.chapter1.packageA.ClassA;

public class ClassB {
  
  public static void main(String[] args) {
    ClassA a = new ClassA();
    System.out.println(a.message);
    
    StringBuilder sb = new StringBuilder("Hi ");
    
    int x = 4;
    
    sb.append(x);
    
    System.out.println(sb);
  }
  
}
