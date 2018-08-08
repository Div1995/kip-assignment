package edu.knoldus;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SecondsMahatmaGandhiLived {
  public static void main(String[] args) {
    LocalDateTime dateOfBirth = LocalDateTime.of(1869, 10, 2, 0, 0);
    LocalDateTime dateOfDeath = LocalDateTime.of(1948,1,30,0,0);
    long diffInSeconds = ChronoUnit.SECONDS.between(dateOfBirth, dateOfDeath);
    System.out.println(diffInSeconds);
  }
}
