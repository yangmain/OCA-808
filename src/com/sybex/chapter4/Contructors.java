package com.sybex.chapter4;

public class Contructors {
  
  public static void main(String[] args) {
    Bunny b = new Bunny("red");
    System.out.println(b.color);
  }
  
}

class Bunny {
  
  final public String color;

  public Bunny(String color) {
    color = color; // Be careful!
  }

  {
    if (Math.random() < 0.5) {
      color = "blue";
    } else {
      color = "yellow";
    }
    
    System.out.println(color);

    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }
  }
  
}
