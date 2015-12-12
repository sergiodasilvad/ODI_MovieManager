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
@Named(value = "movieDetailBean")
@SessionScoped
public class MovieDetailBean implements Serializable {
  
  
  private Movie movie;

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }
  
  /**
   * Creates a new instance of MoviesDetailBean
   */
  public MovieDetailBean() {
  }
  
  public String show(Movie movie) {
    this.movie = movie;
    return this.movie == null ? "error" : "show";
    
  }
  
  /**
   * load person's movies if exist
   * @return List
   */
  public List<Person> getPersons() {
    
    ArrayList<Person> people = new ArrayList<>();
    if (movie != null) {
      people.addAll(movie.getPersons().values());
    }
    
    return people;
  }
}
