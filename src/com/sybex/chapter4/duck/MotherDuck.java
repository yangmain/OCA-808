package com.sybex.chapter4.duck;

public class MotherDuck {

  String noise = "Quack !";
  
  void quack() {
    System.out.println(noise);
  }
  
  private void makeNoise() {
    quack();
  }

}
