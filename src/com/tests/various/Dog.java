package com.tests.various;

public class Dog extends Animal {

  public boolean isBig = false;
  
  public static void main(String[] args) {
    
    Animal a = new Dog();
    System.out.println(a.age);
    System.out.println(a.isBig);
    
    
  }
  
  
  public void showAge() {
    System.out.println(age);
  }
  
}
