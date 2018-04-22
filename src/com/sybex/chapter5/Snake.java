package com.sybex.chapter5;

public abstract class Snake {

  int length;
  
  boolean isVenimous;
  
  abstract void getName();
  
  abstract void getColor();
  
  abstract protected void getLocation();
  
}
