package edu.knoldus;

public class WordCountForSentence {
  private String name;
  private Integer id;
  public WordCountForSentence(String name,Integer id) {

    this.name = name;
    this.id = id;
  }
  public Integer getId() {
    return id;
  }
  public String getName() {
    return name;
  }
}
