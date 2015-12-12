/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author sergio.dasilvad
 */
@Named(value = "personDetailBean")
@SessionScoped
public class PersonDetailBean implements Serializable {
  
 
  private Person person;

  /**
   * Creates a new instance of peopleDetailBean
   */
  public PersonDetailBean() {
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }
  
  public String show(Person person) {
    this.person = person;
    return this.person == null ? "error" : "show";

  }
  
  /**
   * Renvoi la liste des personne ayant regardé le film
   * @return List
   */
  public List<Movie> getMovies() {
    
    ArrayList<Movie> movies = new ArrayList<>();
    if (person != null) {
      movies.addAll(person.getMovies().values());
    }
    
    return movies;
  }  
}
