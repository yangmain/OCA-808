package com.sybex.chapter4.dinosaure;

import com.sybex.chapter4.bird.Bird;

public class Dinosaure extends Bird {

    public void noise() {
//      privateNoise(); // DOES NOT COMPILE
      
//      defaultNoise(); // DOES NOT COMPILE
      
      protectedNoise();
      
      publicNoise();
    }
    
    public void noisyBird() {
      Dinosaure d = new Dinosaure();
      System.out.println(d.feather);
      d.protectedNoise();
    }
    
    public void otherNoisyBird() {
      Bird b = new Bird();
//      System.out.println(b.feather);
//      b.protectedNoise();
    }
  
}

class SuperDinosaure extends Bird {
  
  public void noise() {
    Bird b = new Bird();
    
//    b.privateNoise(); // DOES NOT COMPILE
    
//    b.defaultNoise(); // DOES NOT COMPILE
    
//    b.protectedNoise(); // DOES NOT COMPILE
    
    b.publicNoise();
    
//    System.out.println(b.feather);
    
    Dinosaure d = new Dinosaure();
    
//    d.privateNoise(); // DOES NOT COMPILE
      
//    d.defaultNoise(); // DOES NOT COMPILE
    
//    d.protectedNoise(); // DOES NOT COMPILE
    
//    System.out.println(d.feather);
    
    d.publicNoise();
  }
  
}

