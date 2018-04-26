package com.oracle.application;

class A {
  A() {
    this.print();
  }

  void print() {
    System.out.println("A");
  }
}

class B extends A {
  public static void main(final String[] args) {
    final A a = new B();
    a.print();
  }

  int i = 4;

  @Override
  void print() {
    System.out.println(this.i);
  }
}
