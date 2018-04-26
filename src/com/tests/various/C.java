package com.tests.various;


class A {
  private int i = 10;
  
  public void f() { }
  
  public void g() { }
}

class B extends A {
  public int i = 20;
  
  public void g() { }
}

public class C {

  public static void main(String[] args) {

    A a = new A();
    B b = new B();
    
    System.out.println(b.i);
    b.f();
  }

}
