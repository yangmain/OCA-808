package com.sybex.chapter4.duck;

public class GoodDuckling {

  public void makeNoise() {
    MotherDuck motherDuck = new MotherDuck();

    motherDuck.quack();
    System.out.println(motherDuck.noise);
//    motherDuck.makeNoise(); // DOES NOT COMPILE
  }

}
