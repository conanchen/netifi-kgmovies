package io.github.conanchen.person.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class UserGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String username;
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

    public UserGQO(String username, String name, String bio, java.lang.String bioHTML, PersonGQO isUserOf, String id) {
        this.username = username;
        this.name = name;
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.isUserOf = isUserOf;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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