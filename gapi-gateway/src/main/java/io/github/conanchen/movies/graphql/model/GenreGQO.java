package io.github.conanchen.movies.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class GenreGQO implements NodeGQO{

    private String name;
    @javax.validation.constraints.NotNull
    private String id;

    public GenreGQO() {
    }

    public GenreGQO(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}