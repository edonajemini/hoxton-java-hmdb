package com.example.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {

  @GetMapping("/actors")
  public ArrayList<Actor> getAllActors() {
    return Actor.actors;
  }
  @GetMapping("/movies")
  public ArrayList<Movie> getAllMovies() {
    return Movie.movies;
  }

  @GetMapping("/actor/{id}")
  public Actor getSingleActor(@PathVariable Integer id) {
    Actor match = null;

    for (Actor actor : Actor.actors) {
      if (actor.id == id) {
        match = actor;
      }
    }

    if (match == null)
      throw new Error("Actor not found.");

    return match;
  }
  @GetMapping("/movies/{id}")
  public Movie getSingleMovie(@PathVariable Integer id) {
    Movie match = null;

    for (Movie movie : Movie.movies) {
      if (movie.id == id) {
        match = movie;
      }
    }

    if (match == null)
      throw new Error("Movie not found.");

    return match;
  }
  @PostMapping("/actors")
  public Actor createActor(@RequestBody Actor actor) {
    return actor;
  }
  @PostMapping("/movies")
  public Movie createMovie(@RequestBody Movie movie) {
    return movie;
  }
}
