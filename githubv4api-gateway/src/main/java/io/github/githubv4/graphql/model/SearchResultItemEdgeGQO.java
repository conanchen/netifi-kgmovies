package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SearchResultItemEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private SearchResultItemGQO node;
    private Collection<TextMatchGQO> textMatches;

    public SearchResultItemEdgeGQO() {
    }

    public SearchResultItemEdgeGQO(String cursor, SearchResultItemGQO node, Collection<TextMatchGQO> textMatches) {
        this.cursor = cursor;
        this.node = node;
        this.textMatches = textMatches;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SearchResultItemGQO getNode() {
        return node;
    }
    public void setNode(SearchResultItemGQO node) {
        this.node = node;
    }

    public Collection<TextMatchGQO> getTextMatches() {
        return textMatches;
    }
    public void setTextMatches(Collection<TextMatchGQO> textMatches) {
        this.textMatches = textMatches;
    }

}