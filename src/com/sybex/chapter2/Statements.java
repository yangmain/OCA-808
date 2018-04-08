package com.sybex.chapter2;

public class Statements {

  public static void main(String[] args) {

    boolean b = true;
    int x = 0;
    final int y = 3;
    
    String s = "foo";
    
//    x = b ? increase(x) : decrease(x);
//    x = b ? 1 : 2;
//    b ? print("The true") : print("The false"); // Does not compile.
    
//    System.out.println("b : " + b);

    // Switch
    System.out.println("x is : " + x);
    switch (x) {
      case 0 :
        System.out.println("Zero");
//        break;
      case 1 :
        System.out.println("Uno");
//        break;
      case 2 :
        System.out.println("Two");
//        break;
      case y :
        System.out.println("Two");
//        break;
      default :
        System.out.println("Default case.");
//        break;
    }
    
    switch(s) {
      case "test" :
        System.out.println("test");
        break;
      case "foo" :
        System.out.println("foo");
        break;
      case "bar" :
        System.out.println("bar");
        break;
      default :
        System.out.println("default");
        break;
    }
    
//    int i = 0;
//    System.out.println("i before : " + i);
//    for (i = 0; i < 10; i++) {
//      System.out.print(i + " ");
//    }
//    System.out.println("i after : " + i);
//    
//    long m;
//    int n;
//    for( m = 0,  n = 0; m < 10 && n < 10; m++, n = (int) (2 + m)) {
//      System.out.print(m + " ");
//      System.out.print(n + " ");
//    }
//    
//    String[] names = new String[3];
//    for(String name : names) {
//      System.out.print(name + " ");
//    }
    
  }

  public static int increase(int x) {
    return ++x;
  }
  
  public static int decrease(int x) {
    return --x;
  }
  
  public static void print(String s) {
    System.out.println(s);
  }

}
