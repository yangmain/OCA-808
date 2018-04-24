package com.sybex.chapter6;

public class Exceptions {

  public static void main(String[] args) {
    try {
      System.out.println("In the try block");
    } finally {
      System.out.println("In the finally block");
    }

    try {
      System.out.println("In the try block");
      System.exit(0);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  
}
