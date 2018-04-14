package com.sybex.chapter4.packageA;

public class AltExtendsA extends A {

  public static void main(String[] args) {
    AltExtendsA alt = new AltExtendsA();
    alt.protectedMethod();
    alt.publicMethod();
  }
  
}
