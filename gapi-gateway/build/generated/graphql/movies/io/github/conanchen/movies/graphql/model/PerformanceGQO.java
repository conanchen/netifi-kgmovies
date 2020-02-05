package io.github.conanchen.movies.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class PerformanceGQO implements NodeGQO{

    private String id;
    private MovieGQO film;
    private String character_note;
    private MPersonGQO character;
    private MPersonGQO actor;

    public PerformanceGQO() {
    }

    public PerformanceGQO(MovieGQO film, String character_note, MPersonGQO character, MPersonGQO actor) {
        this.film = film;
        this.character_note = character_note;
        this.character = character;
        this.actor = actor;
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

    public MPersonGQO getCharacter() {
        return character;
    }
    public void setCharacter(MPersonGQO character) {
        this.character = character;
    }

    public MPersonGQO getActor() {
        return actor;
    }
    public void setActor(MPersonGQO actor) {
        this.actor = actor;
    }

	@Override
	public String getId() {
		return id;
	}
}