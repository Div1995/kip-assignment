package edu.knoldus;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYears {

  public static void main(String[] args) {

    List<Integer> allLeapYears = IntStream.rangeClosed(1900,LocalDate.now().getYear())
        .boxed()
        .filter(year -> LocalDate.now().withYear(year).isLeapYear())
        .collect(Collectors.toList());
    System.out.println(allLeapYears);
  }

}
