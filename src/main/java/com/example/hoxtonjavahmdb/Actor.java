package com.example.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Actor {
 public static ArrayList<Actor> actors = new ArrayList<>();
 
  public Integer id;
  public String firstName;
  public String lastName;
  public Integer yearOfBirth;

  static {
    new Actor(1, "Samuel", "Jackson", 1948);
    new Actor(2, "Will", "Smith", 1968);
    new Actor(3, "Brad", "Pitt", 1963);
    new Actor(4, "Jennifer", "Aniston", 1969);
  }

  public Actor(Integer id, String firstName, String lastName, Integer yearOfBirth) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;

    Actor.actors.add(this);
  }
  public void displayInfo() {
    System.out.println("Name of the actor: " + this.firstName + this.lastName +". who is born in" + this.yearOfBirth);
  }
}
