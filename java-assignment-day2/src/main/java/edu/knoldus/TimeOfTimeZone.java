package edu.knoldus;


import java.time.LocalTime;
import java.time.ZoneId;

public class TimeOfTimeZone {

  public static void main(String[] args) {

    String selectTimeZone = "GMT+02:30";
    LocalTime localTime = LocalTime.now(ZoneId.of(selectTimeZone));
    System.out.println("Time Zone Selected: "+selectTimeZone+ "\tCurrent Time "+localTime);
  }
}
