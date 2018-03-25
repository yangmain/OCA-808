package com.sybex.chapter1;

public class Animal {

  String name;
  boolean big;
  
  String location;
  
  public Animal() {
    System.out.println("Constructor with return.");
    return;
  }
  
  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

}

