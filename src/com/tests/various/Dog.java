package com.tests.various;

public class Dog extends Animal {

  public boolean isBig = false;
  
  public static void main(String[] args) {
    
    Animal a = new Dog();
    System.out.println(a.age);
    System.out.println(a.isBig);
    
    ((Dog) a).isGoodBoy();
    
    String name = "";
    System.out.println("name.isEmpty : " + name.isEmpty());
    
  }
  
  
  public void showAge() {
    System.out.println(age);
  }
  
  public void isGoodBoy() {
    System.out.println(true);
  }

}
