package com.tests.various;

public class Animal {

  public int age = 7;
  
  public boolean isBig = false;
  
  public boolean isBiped() {
    return false;
  }
  
  public boolean isItBig() {
    return isBig;
  }

  public void getAnimalDescription() {
    System.out.println("This animal is biped : " + isBiped());
  }
  
}
