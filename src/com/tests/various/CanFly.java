package com.tests.various;

public interface CanFly {

  public static final int MAX_SPEED = 100;
  
  public abstract void doSomething();
  
  public default boolean canFly() {
    return true;
  }
  
}
