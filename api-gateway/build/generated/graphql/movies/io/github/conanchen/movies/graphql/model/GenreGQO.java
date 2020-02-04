package io.github.conanchen.movies.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GenreGQO implements NodeGQO{

    private String id;
    private String name;

    public GenreGQO() {
    }

    public GenreGQO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String getId() {
		return id;
	}

}