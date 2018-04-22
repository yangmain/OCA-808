package com.sybex.chapter5;

/**
 * Hiding methods.
 */
public class Kangaroo extends Marsupial {

  public static final boolean isBiped() {
    return true;
  }
  
  public void getKangarooDescription() {
    System.out.println("Kangaroo hops on two legs : " + isBiped());
  }
  
  public static void main(String[] args) {
    System.out.println("KANGAROO : ");
    Kangaroo k = new Kangaroo();
    k.getMarsupialDescription();
    k.getKangarooDescription();

    System.out.println("\nMARSUPIAL : ");
    Marsupial m = new Marsupial();
    m.getMarsupialDescription();
  }

}

class Marsupial {
  
  public static boolean isBiped() {
    return false;
  }
  
  public void getMarsupialDescription() {
    System.out.println("Marsupial walks on two legs : " + isBiped());
  }
  
}