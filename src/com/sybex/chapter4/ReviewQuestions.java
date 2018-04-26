package com.sybex.chapter4;

import static com.sybex.chapter4.Static.*;

public class ReviewQuestions {

  public static void main(String[] args) {

    ReviewQuestions rq = new ReviewQuestions();
//    rq.howMany();
    System.out.println(rq.howMany(true));
    System.out.println(rq.howMany(true, true));
    System.out.println(rq.howMany(true, true, true));
//    rq.howMany(true, {true});
//    rq.howMany(true, {true, true});
    System.out.println(rq.howMany(true, new boolean[2]));
    
    System.out.println("x = " + x);
    sayHello();
    
  }

  public int howMany(boolean b1, boolean... b2) {
    return b2.length;
  }
  
}
