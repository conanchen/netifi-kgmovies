package io.github.conanchen.message.graphql.model;

import java.util.Collection;
import io.github.conanchen.movies.graphql.model.MovieGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.PlaceGQO;

public class PersonGQO implements PartyGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    private String familyName;
    private String givenName;
    private java.util.Date birthDate;
    private PlaceGQO birthPlace;
    private String gender;
    private String email;
    private Collection<PersonGQO> follows;
    private Collection<PersonGQO> followees;
    private Collection<MovieGQO> directoredFilms;
    @javax.validation.constraints.NotNull
    private String id;

    public PersonGQO() {
    }

    public PersonGQO(String name, String alternateName, String description, String familyName, String givenName, java.util.Date birthDate, PlaceGQO birthPlace, String gender, String email, Collection<PersonGQO> follows, Collection<PersonGQO> followees, Collection<MovieGQO> directoredFilms, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.familyName = familyName;
        this.givenName = givenName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.email = email;
        this.follows = follows;
        this.followees = followees;
        this.directoredFilms = directoredFilms;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public java.util.Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }

    public PlaceGQO getBirthPlace() {
        return birthPlace;
    }
    public void setBirthPlace(PlaceGQO birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<PersonGQO> getFollows() {
        return follows;
    }
    public void setFollows(Collection<PersonGQO> follows) {
        this.follows = follows;
    }

    public Collection<PersonGQO> getFollowees() {
        return followees;
    }
    public void setFollowees(Collection<PersonGQO> followees) {
        this.followees = followees;
    }

    public Collection<MovieGQO> getDirectoredFilms() {
        return directoredFilms;
    }
    public void setDirectoredFilms(Collection<MovieGQO> directoredFilms) {
        this.directoredFilms = directoredFilms;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}