package com.sybex.chapter3;

public class UsingStringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("start");
    sb.append("+middle");
    StringBuilder same = sb.append("+end");
    
    System.out.println(sb);
    System.out.println(same);
  }

}
