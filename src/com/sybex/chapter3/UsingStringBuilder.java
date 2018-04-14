package com.sybex.chapter3;

public class UsingStringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("start");
    sb.append("+middle");
    StringBuilder same = sb.append("+end");
    
    System.out.println(sb);
    System.out.println(same);
    
    StringBuilder newSB = new StringBuilder("");
    newSB.append("Hello");
    newSB.append(" ");
    newSB.append("World");
    System.out.println(newSB); // Hello World
    
    System.out.println(newSB.toString() == "Hello World"); // false
    System.out.println(newSB.toString().equals("Hello World")); // true
    
  }

}
