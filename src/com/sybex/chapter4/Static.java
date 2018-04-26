package com.sybex.chapter4;

import java.util.ArrayList;

//import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.List;

public class Static {

  private static int staticVariable;
  private static int staticVariableInitialized = 5;
  private final static int STATIC_VARIABLE_FINAL = 10;
  
  private static final ArrayList<Integer> NUMBERS = new ArrayList();
  private static final ArrayList<Integer> OTHER_NUMBERS = new ArrayList();

  public static void main(String[] args) {
    System.out.println(staticVariable);
    System.out.println(staticVariableInitialized);
    System.out.println(STATIC_VARIABLE_FINAL);
    
//    STATIC_VARIABLE_FINAL = 3; // Impossible
    
    System.out.println("x = " + x);

//    int[] array = { 1, 3, 9 };
//    List<int[]> list = Arrays.asList(array);
    
    System.out.println(NUMBERS);
    NUMBERS.add(3);
    System.out.println(NUMBERS);
  }

  public static int x;
//  public final static int y; // DOES NOT COMPILE
  
  
  public static final void sayHello() {
    System.out.println("Static hello");
  }
  
  static {
     x = 3;
  }
  
}
