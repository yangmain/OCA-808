package com.sybex.chapter5.polymorphism;

public class Lemur extends Primate implements HasTail {

  public int age = 10;
  
  @Override
  public boolean isTailStripped() {
    return false;
  }
  
  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println("lemur age : " + lemur.age);
    
    HasTail hasTail = lemur;
    System.out.println("hasTail == lemur" + hasTail.equals(lemur));
//    System.out.println(hasTail.age); // DOES NOT COMPILE
    
    System.out.println("hasTail is stripped : " + hasTail.isTailStripped());
    
    Primate primate = lemur;
    System.out.println("primate == hasTail" + primate.equals(hasTail));
    System.out.println("primate has hair : " + primate.hasHair());
    
//    Lemur lemurTwo = new Primate(); // NOPE!
    Primate p = new Lemur();

  }

}
