package com.sybex.chapter1;

public class Chicken {

  public int numberOfEggs;
  
  public int tripleNumberOfEggs = 3 * numberOfEggs;
  
  public Chicken() {
//    System.out.println("In constructor.");
    this.numberOfEggs = 2;
    System.out.println("tripleNumberOfEggs : " + tripleNumberOfEggs);

  }
  
  public void Chicken() {
//    System.out.println("In method.");
  }
  
}
