package com.sybex.chapter5.polymorphism;

public class Main {

  public static void main(String[] args) {
    
    Dog milou = new Dog();
    
    System.out.print("milou.makeNoise() : ");
    milou.makeNoise();
    
    System.out.print("milou.makeNoise() : ");
    milou.makeNoise();
    
    milou.isGoodBoy();
    milou.drinkWater();

    Animal a = new Dog();
//    a.isGoodBoy();
    a.drinkWater();
    a.makeNoise();
    
//    Dog d = new Animal(); // Of course not...
    
    Dog snoopA = new Dog();
    Animal snoopB = new Dog();
    TamedAnimal snoopC = new Dog();
  }

}
