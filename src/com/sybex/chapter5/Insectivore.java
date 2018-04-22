package com.sybex.chapter5;

public interface Insectivore {

  public default void eatAnts() {
    System.out.println("Insectivores eat ants.");
  }
  
}
