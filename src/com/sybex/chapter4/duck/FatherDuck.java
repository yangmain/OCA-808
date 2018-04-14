package com.sybex.chapter4.duck;

public class FatherDuck {

  private String noise = "Quack !";
  
  private void quack() {
    System.out.println(noise);
  }
  
  private void makeNoise() {
    quack();
  }
  
}
