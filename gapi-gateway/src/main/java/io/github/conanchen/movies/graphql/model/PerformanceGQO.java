package io.github.conanchen.movies.graphql.model;

import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class PerformanceGQO implements NodeGQO{

    private MovieGQO film;
    private String character_note;
    private PersonGQO character;
    private PersonGQO actor;
    @javax.validation.constraints.NotNull
    private String id;

    public PerformanceGQO() {
    }

    public PerformanceGQO(MovieGQO film, String character_note, PersonGQO character, PersonGQO actor, String id) {
        this.film = film;
        this.character_note = character_note;
        this.character = character;
        this.actor = actor;
        this.id = id;
    }

    public MovieGQO getFilm() {
        return film;
    }
    public void setFilm(MovieGQO film) {
        this.film = film;
    }

    public String getCharacter_note() {
        return character_note;
    }
    public void setCharacter_note(String character_note) {
        this.character_note = character_note;
    }

    public PersonGQO getCharacter() {
        return character;
    }
    public void setCharacter(PersonGQO character) {
        this.character = character;
    }

    public PersonGQO getActor() {
        return actor;
    }
    public void setActor(PersonGQO actor) {
        this.actor = actor;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}