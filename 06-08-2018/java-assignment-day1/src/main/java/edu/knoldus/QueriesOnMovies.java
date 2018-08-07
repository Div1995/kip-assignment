
package edu.knoldus;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class QueriesOnMovies {

  public static void main(String[] args) {
    QueriesOnMovies queryOnMovies = new QueriesOnMovies();
    Movie movie1 = new Movie("Bestpart1",2001,9,"comedy");
    Movie movie2 = new Movie("Bestpart2",2018,8,"Scary");
    Movie movie3 = new Movie("Bestpart3",2002,9,"Romance");
    Movie movie4 = new Movie("Bestpart4",20016,7,"Sci-Fi");

    List<Movie> movieList= Arrays.asList(movie1, movie2, movie3, movie4);
    List<Movie> higherRatingMovie = queryOnMovies.getRatingAndGenre(movieList);
    System.out.println("Retrieving movies with rating more than 8 and genre comedy ");
    queryOnMovies.displayMovies(higherRatingMovie);

    List<Movie> lowerRatingMovie = queryOnMovies. getReleaseAndrating(movieList);
    System.out.println("\nRetrieving movies with release year greater than 2000 and rating less than 8 ");
    queryOnMovies.displayMovies(lowerRatingMovie);

    List<Movie> evenRatingMovie = queryOnMovies.getEvenNumberRatings(movieList);
    System.out.println("\nRetrieving movies with rating as even number " );
    queryOnMovies.displayMovies(evenRatingMovie);

    List<Movie> scifiGenreMovie = queryOnMovies.getScifiGenreMovieWithRating(movieList);
    System.out.println("\nRetrieving movies with rating equals to 7 and genre Sci-Fi " );
    queryOnMovies.displayMovies(scifiGenreMovie);

  }
  public  List<Movie> getRatingAndGenre(List<Movie> movieList){
    return movieList.stream()
        .filter(movie -> movie.getRating() > 8 && movie.getGenre().equals("comedy"))
        .collect(Collectors.toList());
  }

  public List<Movie> getReleaseAndrating(List<Movie> movieList){
    return movieList.stream()
        .filter(movie -> movie.getRating() < 8 && movie.getReleaseYear() > 2000)
        .collect(Collectors.toList());
  }

  public List<Movie> getEvenNumberRatings(List<Movie> movieList){
    return movieList.stream()
        .filter(movie -> movie.getRating() % 2 == 0)
        .collect(Collectors.toList());
  }

  public List<Movie> getScifiGenreMovieWithRating(List<Movie> movieList){
    return movieList.stream()
        .filter(movie -> movie.getRating() == 7 && movie.getGenre().equals("Sci-Fi"))
        .collect(Collectors.toList());
  }

  public void displayMovies(List<Movie> list ){
    list.forEach(movie ->
        System.out.println("Movie:" + movie.getNameOfMovie() + "  Rating:" + movie.getRating() +
            "  Release year: " + movie.getReleaseYear() + "  Genre: " + movie.getGenre()));
  }

}
