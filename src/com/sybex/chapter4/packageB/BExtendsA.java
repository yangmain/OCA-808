package com.sybex.chapter4.packageB;

import com.sybex.chapter4.packageA.A;

public class BExtendsA extends A {

  public static void main(String[] args) {
    A a = new A();
    a.publicMethod();
    
    BExtendsA bea = new BExtendsA();
    bea.publicMethod();
    bea.protectedMethod();
  }

}
