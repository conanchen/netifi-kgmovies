package io.github.conanchen.movies.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class MPersonGQO implements NodeGQO{

    private String id;
    private String name;
    private Collection<MovieGQO> directorOfFilm;

    public MPersonGQO() {
    }

    public MPersonGQO(String name, Collection<MovieGQO> directorOfFilm) {
        this.name = name;
        this.directorOfFilm = directorOfFilm;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Collection<MovieGQO> getDirectorOfFilm() {
        return directorOfFilm;
    }
    public void setDirectorOfFilm(Collection<MovieGQO> directorOfFilm) {
        this.directorOfFilm = directorOfFilm;
    }

	@Override
	public String getId() {
		return id;
	}


}