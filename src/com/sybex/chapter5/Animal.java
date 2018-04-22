package com.sybex.chapter5;

class Animal {
  int weight = 10;
  
  public static void main(String[] args) {
    Animal a = new Dog();
    
//    Dog d = new Animal(); // DOES NOT COMPILE
    
    Dog d = (Dog) new Animal();
  }

}

class Dog extends Animal {
  String color;
  String name;
}
