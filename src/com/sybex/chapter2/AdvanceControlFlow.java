package com.sybex.chapter2;

public class AdvanceControlFlow {

  public static void main(String[] args) {

    int x = 3;
    
    LABEL_IF: if(false) 
      LABEL_THEN: {
      System.out.println("then...");
    } else {
      break LABEL_IF;
//      System.out.println("else...");
    }
    
  }

}
