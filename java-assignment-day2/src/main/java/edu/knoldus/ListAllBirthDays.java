package edu.knoldus;

import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListAllBirthDays {
  
  public static void main(String[] args) {
    LocalDate dateOFBirth = LocalDate.of(1995,05,04);
    int differenceBetweenPreviousAndCurrentYear = LocalDate.now().minusYears(dateOFBirth.getYear()).getYear();
    List<String> dayOfBirth = IntStream.rangeClosed(0, differenceBetweenPreviousAndCurrentYear)
        .boxed()
        .map(increment ->dateOFBirth.plusYears(increment).getDayOfWeek().toString()).collect(Collectors.toList());
    System.out.println(dayOfBirth);
  }

}
