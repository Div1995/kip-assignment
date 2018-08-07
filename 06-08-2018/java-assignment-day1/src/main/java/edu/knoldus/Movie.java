package edu.knoldus;

public class Movie {

  private String nameOfMovie;
  private Integer releaseYear;
  private Integer rating;
  private String genre;

  public Movie(String nameOfMovie, Integer releaseYear, Integer rating, String genre) {

    this.nameOfMovie = nameOfMovie;
    this.releaseYear = releaseYear;
    this.rating = rating;
    this.genre = genre;
  }

  public Integer getRating() {
    return this.rating;
  }

  public Integer getReleaseYear() {
    return this.releaseYear;
  }

  public String getNameOfMovie() {
    return this.nameOfMovie;
  }

  public String getGenre() {
    return this.genre;
  }
}


