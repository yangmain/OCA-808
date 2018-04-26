package com.sybex.chapter3;

import java.util.*;

public class ConvertingBetweenArrayAndList {

  public static void main(String[] args) {
    // Arrays
    int[] a1 = new int[3];
    int[] a2 = new int[] {1, 2, 3};
    int[] a3 = {1, 2, 3};
    
    // List to array
    List<String> list = new ArrayList<>();
    list.add("Mario");
    list.add("Luigi");
    System.out.println(list);

    Object[] objectArray = list.toArray();
    System.out.println(objectArray);
    
    String[] stringArray = list.toArray(new String[10]);
    System.out.println(stringArray.length);

    // Array to list
    String [] array = {"Wario", "Toad", "Yoshi"};
    System.out.println(array);
    
    List<String> stringList = Arrays.asList(array);
    System.out.println(stringList);
    System.out.println(stringList.size());
    
    stringList.set(1, "Peach");
    for(String s : array) System.out.print(s + " ");
    System.out.println(stringList);
    System.out.println(stringList.size());
    
    array[0] = "Mario";
    for(String s : stringList) System.out.print(s + " ");
  }

}
