package com.sybex.chapter5.polymorphism;

public class Dog extends Animal implements TamedAnimal {

  public void makeNoise() {
    System.out.println("(Bark) wouf wouf...");
  }
  
  public void isGoodBoy() {
    System.out.println("Is a good boy");
  }
  
}
