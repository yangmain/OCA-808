package com.oracle.application;

public class C_OperatorsAndDecisionConstructs {

  public static void main(String[] args) {

    int x = 1;
    int y = 2;
    
    try {
      System.out.println(x);      
      x = 2; // Execption is thrown but the value of x has chaged just before. The change is not reverted when going in the catch.
      System.out.println(x);      
      y = x/0;
    } catch (ArithmeticException e){
      System.out.println(x);      
    }
    System.out.println(x);      
    
    int i = (int) (double) (int) (double) 32.9;
    System.out.println("i : " + i);
    
    int rate = 100;
    float amount = 1 - rate / 100 * 1 - rate / 100;
    System.out.println(amount);
    
    boolean flag = true;
    
    // No indentation
    if (flag) //1
    if (flag) //2
    System.out.println("True False");
    else //3
    System.out.println("True True");
    else //4
    System.out.println("False False");

    int b, c;
    int a = b = c = 100;
    System.out.println(a + " " + b + " " + c);
    
    a = b = 0;
    a++;
    System.out.println(a);
    b = a++;
    System.out.println(a + " " + b);
    b = ++a;
    System.out.println(a + " " + b);
  }

}
