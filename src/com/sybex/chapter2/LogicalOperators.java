package com.sybex.chapter2;

public class LogicalOperators {

  public static void main(String[] args) {

    System.out.println("true & true = " + (true & true));
    System.out.println("true & false = " + (true & false));
    System.out.println("false & true = " + (false & true));
    System.out.println("false & false = " + (false & false));
    
    System.out.println("\n");
    
    System.out.println("true && true = " + (true && true));
    System.out.println("true && false = " + (true && false));
    System.out.println("false && true = " + (false && true));
    System.out.println("false && false = " + (false && false));
    
    System.out.println("\n");
    
    System.out.println("true | true = " + (true | true));
    System.out.println("true | false = " + (true | false));
    System.out.println("false | true = " + (false | true));
    System.out.println("false | false = " + (false | false));
    
    System.out.println("\n");
    
    System.out.println("true || true = " + (true || true));
    System.out.println("true || false = " + (true || false));
    System.out.println("false || true = " + (false || true));
    System.out.println("false || false = " + (false || false));
    
    System.out.println("\n");
    
    System.out.println("true ^ true = " + (true ^ true));
    System.out.println("true ^ false = " + (true ^ false));
    System.out.println("false ^ true = " + (false ^ true));
    System.out.println("false ^ false = " + (false ^ false));

    System.out.println("\n");
    
    boolean x = true;
    boolean y = x = false;
    System.out.println("x = " + x);    
    System.out.println("y = " + y);    

  }

}
