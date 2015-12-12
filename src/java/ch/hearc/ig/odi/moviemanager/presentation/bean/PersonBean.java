/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author sergio.dasilvad
 */
@Named(value = "personBean")
@RequestScoped
public class PersonBean {

    @Inject
    Services services;

    /**
     * Création de l'instance PersonBean
     */
    public PersonBean() {
    }

    public List<Person> getPerson() {

        return services.getPeopleList();
    }

}
