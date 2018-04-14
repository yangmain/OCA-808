package com.sybex.chapter3;

import java.time.*;

public class DateAndTime {

  public static void main(String[] args) {

//    LocalDate d = new LocalDate(); // Not possible!
    
    System.out.println("LocalTime : " + LocalTime.now());
    System.out.println("LocalDate : " + LocalDate.now());
    System.out.println("LocalDateTime : " + LocalDateTime.now());

    System.out.println("\b");
    
    LocalDate date1 = LocalDate.of(2018, 04, 14);
    System.out.println("date 1 : " + date1);

    LocalDate date2 = LocalDate.of(2018, Month.APRIL, 14);
    System.out.println("date 2 : " + date2);
    
    System.out.println("\b");
    
    // Manipulating date and time
    LocalDate ld = LocalDate.of(2018, 1, 31);
    System.out.println("ld : " + ld);
    
    ld.plusMonths(1); // immutable
    System.out.println("ld : " + ld);
    
    ld= ld.plusMonths(1); // This is the way
    System.out.println("ld : " + ld);
    
    ld= ld.plusMonths(-1); // Can be negative
    System.out.println("ld : " + ld);
    
    System.out.println("\b");
    
    LocalDateTime ldt = LocalDateTime.of(2018, 1, 31, 20, 0);
    System.out.println("ldt : " + ldt);
    
    ldt = ldt.plusHours(10);
    System.out.println("ldt : " + ldt);
    ldt = ldt.plusHours(-10);
    System.out.println("ldt : " + ldt);
    ldt = ldt.minusSeconds(30);
    System.out.println("ldt : " + ldt);
    ldt = ldt.minusNanos(500_000_000);
    System.out.println("ldt : " + ldt);
  }

}
