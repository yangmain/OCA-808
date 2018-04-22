package com.sybex.chapter5;

public class Bear implements Omnivore, Herbivore {

  public static void main(String[] args) {
    Omnivore b1 = new Bear();
    Herbivore b2 = new Bear();
    
    System.out.println(Bear.LIFE_SPAN);
  }

  @Override
  public void drinkWater() {
    System.out.println("Bears drink water!");
  }

  @Override
  public void eatPlants() {
  }

  @Override
  public void eatMeat() {
  }

  @Override
  public boolean eatInsect() {
    return false;
  }

  @Override
  public boolean eatInsect(String insect) {
    return false;
  }
  
  @Override
  public void eatAnts() {
    System.out.println("Bears eat ants.");
  }

}
