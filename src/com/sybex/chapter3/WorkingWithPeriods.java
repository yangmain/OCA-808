package com.sybex.chapter3;

import java.time.*;

public class WorkingWithPeriods {

  public static void main(String[] args) {

    LocalDate date1 = LocalDate.of(2018, 04, 14);
    System.out.println("date 1 : " + date1);

    LocalDate date2 = LocalDate.of(2018, Month.APRIL, 14);
    System.out.println("date 2 : " + date2);

    LocalDate date3 = LocalDate.of(2018, Month.JUNE, 1);
    System.out.println("date 3 : " + date3);
    
    System.out.println(date1.isEqual(date2));
    System.out.println(date1.isBefore(date3));
    System.out.println(date1.isAfter(date3));
    
    Period pAnnual = Period.ofYears(1);
    
    date1 = date1.plus(pAnnual);
    System.out.println("date 1 : " + date1);
  }

}
