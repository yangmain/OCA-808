package com.sybex.chapter3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormattingDateAndTime {

  public static void main(String[] args) {

    LocalDate ld = LocalDate.now();
    System.out.println(ld);
    System.out.println(ld.getYear());
    System.out.println(ld.getMonthValue());
    System.out.println(ld.getDayOfMonth());
    System.out.println(ld.getDayOfYear());
    
    System.out.println("\b");

    LocalDate date = LocalDate.of(2018, 4, 14);
    LocalTime time = LocalTime.of(13, 40);
    LocalDateTime ldt = LocalDateTime.of(date, time);
    System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    
    System.out.println("\b");
  }

}
