package io.github.conanchen.movies.graphql.model;

public class MovieGenreEdgeGQO {

    private GenreGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public MovieGenreEdgeGQO() {
    }

    public MovieGenreEdgeGQO(GenreGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public GenreGQO getNode() {
        return node;
    }
    public void setNode(GenreGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}