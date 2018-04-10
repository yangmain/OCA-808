package com.sybex.chapter3;

public class Rectangle {

  public int width;
  public int heigth;
  
  public Rectangle() { }
  
  public Rectangle(int width, int heigth) {
    this.width = width;
    this.heigth = heigth;
  }
  
  public double diagonal() {
    return Math.sqrt(heigth * heigth + width * width);
  }

  public int perimeter() {
    return 2 * (width + heigth);
  }
  
  public int surface() {
    return width * heigth;
  }
  
}
