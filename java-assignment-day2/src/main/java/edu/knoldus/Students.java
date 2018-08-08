package edu.knoldus;

import java.util.List;
import java.util.Optional;

public class Students {

  private String name;
  private int rollNumber;
  private Optional<List<String>> subject;

  public Students(String name, int rollNo, Optional<List<String>> subjects){
    this.name = name;
    this.rollNumber = rollNo;
    this.subject = subjects;
  }
  public String getName() {
    return this.name;
  }
  public int getRollNo() {
    return this.rollNumber;
  }
  public Optional<List<String>> getSubjects() {
    return this.subject;
  }

  public String toString() {
    return "(Student's Name: "+ name + ", Roll no: " + rollNumber + ")";
  }

}
