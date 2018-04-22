package com.sybex.chapter5;

public interface Omnivore extends Insectivore {

  public static final int LIFE_SPAN = 20;
  
  public void eatPlants();
  
  public void eatMeat();
  
  public default void drinkWater() {
    System.out.println("Omnivores drink water!");
  }

  public boolean eatInsect(String insect);
  
}
