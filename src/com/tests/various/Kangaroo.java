package com.tests.various;

public class Kangaroo extends Animal {

  public boolean isBig = true;

  public boolean isBiped() {
    return true;
  }

  public boolean isItBig() {
    return isBig;
  }

  public void getKangarooDescription() {
    System.out.println("The kangaroo is biped : " + isBiped());
  }

  public static void main(String[] args) {
    Kangaroo k = new Kangaroo();
    
    k.getAnimalDescription();
    k.getKangarooDescription();

    System.out.println("isBig : " + k.isBig);
    System.out.println("isBiped() : " + k.isBiped());
    
    System.out.println("isItBig() : " + k.isItBig());
    
    System.out.println("--------------------------");
    
    Kangaroo k2 = (Kangaroo) new Animal();
    
    
  }
  
}
