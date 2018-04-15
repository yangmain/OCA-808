package com.sybex.chapter4.bird;

public class Bird {
  
  protected String feather = "feather";
  
  private void privateNoise() {
    System.out.println("This a private noise in bird");
  }
  
  void defaultNoise() {
    System.out.println("This a default noise in bird");
  }
  
  protected void protectedNoise() {
    System.out.println("This a protected noise in bird");
  }
  
  public void publicNoise() {
    System.out.println("This a public noise in bird");
  }
  
}
