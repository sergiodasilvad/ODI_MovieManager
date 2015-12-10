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
public class Movie implements Serializable {
    private long id;
    private String name;
    private String producer;
    private HashMap<String, Person> persons;

    /**
	 * Constructeur paramétré de la classe Movie. Toutes les valeurs sont obligatoires , La liste des personnes est vide.
	 * @param id Le numéro du film
	 * @param name Le titre du film
	 * @param producer Le producteur du film
	 */
    
    public Movie(long id, String name, String producer, HashMap<String, Person> persons) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.persons = new HashMap<>();
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public HashMap<String, Person> getPersons() {
        return persons;
    }

    public void setPersons(HashMap<String, Person> persons) {
        this.persons = persons;
    }
    
    
}
