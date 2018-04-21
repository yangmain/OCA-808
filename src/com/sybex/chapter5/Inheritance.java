package com.sybex.chapter5;

public class Inheritance {

  public static void main(String[] args) {
    Chicken c = new Chicken("Blue");    
//    System.out.println(c.color);
  }

}

class Bird {
  
  protected String color;
  
  Bird() {
    System.out.println("Hello Bird!");
  }
  
  Bird(String color) {
    System.out.println("Bird color.");
  }

  public void printName() {
    System.out.println("Bird name :)");
  }
  
}

class Chicken extends Bird {
  
  public Chicken() {
    super();
    System.out.println("Hello Chicken!");
    color = "red";
  }
  
  public Chicken(String color) {
    this();
    this.color = color;
    super.printName();
  }
  
  // Override
  public void printName() {
    System.out.println("Chicken name :)");
  }
  
  // Overload
  public int printName(int value) {
    System.out.println("Chicken name :)");
    return 0;
  }
  
}