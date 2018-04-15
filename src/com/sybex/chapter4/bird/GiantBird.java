package com.sybex.chapter4.bird;

public class GiantBird extends Bird {

  public void noise() {
    publicNoise(); // OK bc public
    
    defaultNoise(); // OK bc in same package
    
    protectedNoise(); // OK bc in same package + extends
  }
  
}

class SuperGiantBird {

  public void noise() {
    Bird b = new Bird();
    
    b.publicNoise(); // OK bc public
    
    b.defaultNoise(); // OK bc in same package
    
    b.protectedNoise(); // OK bc in same package
  }
  
}
