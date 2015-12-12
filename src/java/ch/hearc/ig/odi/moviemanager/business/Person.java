/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author sergio.dasilvad
 */
public class Person implements Serializable{
    private long id;
    private String firstName;
    private String lastName;
    private HashMap<Long, Movie> movies;

    /**
	 * Constructeur paramétré de la classe Person. Toutes les valeurs sont obligatoires, la liste des film regardé est vide
	 * @param id Le numéro de la personne
	 * @param firstName Le prénom de la personne
	 * @param lastName le nom de la personnes
	 */
    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(HashMap<Long, Movie> movies) {
        this.movies = movies;
    }
    
    public void addMovie(Movie movie) /*throws UniqueException*/ {
    
    /*if (movies.containsKey(movie.getId())) {
      throw new UniqueException();
    }
    */

    movie.getPersons().put(id, this);
    movies.put(movie.getId(), movie);
    
   
  }
    
    
}
