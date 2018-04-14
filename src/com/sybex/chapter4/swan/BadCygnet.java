package com.sybex.chapter4.swan;

import com.sybex.chapter4.duck.MotherDuck;

public class BadCygnet {

  public void makeNoise() {
    MotherDuck motherDuck = new MotherDuck();

//    motherDuck.quack(); // DOES NOT COMPILE
//    System.out.println(motherDuck.noise); // DOES NOT COMPILE
//    motherDuck.makeNoise(); // DOES NOT COMPILE
  }

}
