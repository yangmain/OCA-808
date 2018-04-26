package com.tests.various;

public interface CanFly {

  public static final int MAX_SPEED = 100;
  
  public default boolean canFly() {
    return true;
  }
  
}
