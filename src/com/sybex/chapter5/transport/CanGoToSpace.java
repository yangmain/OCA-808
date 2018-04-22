package com.sybex.chapter5.transport;

public abstract interface CanGoToSpace extends CanFly {

  public abstract void starStageOne();
  
  public default void starStageTwo() {
    System.out.println("Stage 2 started.");
  }

}
