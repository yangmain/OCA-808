package com.sybex.chapter4;

public class DesigningMethods {

  public static void main(String[] args) {
  }

  void simpleMethod() {
  }

  public final int otherMethod(int n) {
    return 2 * n;
  }
  
  final public void testMethod() {
  }
  
  // Order of method modifiers is not important, EXCEPT for return type
  // https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4
  public static final void finalMethod0() {
  }

  public final static void finalMethod1() {
  }

  final public static void finalMethod2() {
  }

  final static public void finalMethod3() {
  }

  static public final void finalMethod4() {
  }

  static final public void finalMethod5() {
  }
  
}
