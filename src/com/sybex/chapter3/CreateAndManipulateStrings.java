package com.sybex.chapter3;

public class CreateAndManipulateStrings {
  
  public static void main(String[] args) {
  
    String s1 = "computer";
    String s2 = new String("computer");
    
    System.out.println(s1.substring(0));
    System.out.println(s1.substring(0, 7));
    System.out.println(s1.substring(3, 6));

    System.out.println("s1 == s2 : " + s1 == s2); // Be careful : precedence problem
    System.out.println("s1 == s2 : " + (s1 == s2));
    System.out.println("s1.equals(s2) : " + s1.equals(s2));
    
    System.out.println("Start w/ : " + s1.startsWith("com"));
    System.out.println("Contains : " + s1.contains("cod"));
    
    System.out.println("Replace : " + s1.replace("c", "super c"));
    
    String a = "abc";
    String b = "ABC".toLowerCase();
    System.out.println("a == b : " + (a == b));
  }
  
}
