package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class UserGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String login;
    private String name;
    private String bio;
    @javax.validation.constraints.NotNull
    private java.lang.String bioHTML;
    @javax.validation.constraints.NotNull
    private PersonGQO isUserOf;
    @javax.validation.constraints.NotNull
    private String id;

    public UserGQO() {
    }

    public UserGQO(String login, String name, String bio, java.lang.String bioHTML, PersonGQO isUserOf, String id) {
        this.login = login;
        this.name = name;
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.isUserOf = isUserOf;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    public java.lang.String getBioHTML() {
        return bioHTML;
    }
    public void setBioHTML(java.lang.String bioHTML) {
        this.bioHTML = bioHTML;
    }

    public PersonGQO getIsUserOf() {
        return isUserOf;
    }
    public void setIsUserOf(PersonGQO isUserOf) {
        this.isUserOf = isUserOf;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}