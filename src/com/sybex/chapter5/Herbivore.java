package com.sybex.chapter5;

public interface Herbivore {

  public void eatPlants();

  public default void drinkWater() {
    System.out.println("Herbivores drink water!");
  }

  public boolean eatInsect();
  
  public static int getAge() {
    return 4;
  }

}
