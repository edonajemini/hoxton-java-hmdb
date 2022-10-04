package com.example.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Movie {
 public static ArrayList<Movie> movies = new ArrayList<>();

  public Integer id;
  public String title;
  public String description;
  public Integer year;
  public Integer actorId;


  static {
    new Movie(1, "A Time to Kill", "Carl Lee Hailey (Samuel L. Jackson) is a heartbroken black father who avenges his daughter's brutal rape by shooting the bigoted men responsible for the crime as they are on their way to trial.", 1996, 1);
    new Movie(2, "We're the Millers", "Small-time pot dealer David (Jason Sudeikis) learns the hard way that no good deed goes unpunished; trying to help some teens, he is jumped by thugs and loses his cash and stash.", 2013,4);
    new Movie(3, "Hitch", "Dating coach Alex Hitch Hitchens (Will Smith) mentors a bumbling client, Albert (Kevin James), who hopes to win the heart of the glamorous Allegra Cole (Amber Valletta).", 2005,2);
    new Movie(4, "The Curious Case of Benjamin Button", "Born under unusual circumstances, Benjamin Button (Brad Pitt) springs into being as an elderly man in a New Orleans nursing home and ages in reverse.", 2008,3);
  }

  public Movie(Integer id, String title, String description, Integer year, Integer actorId) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.year = year;

    Movie.movies.add(this);
    
  }
  public void displayInfo() {
    System.out.println("Title of the movie: " + this.title +".Description:"+ this.description +". The movie was made in" + this.year);
  }
}
