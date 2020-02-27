package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TextMatchGQO {

    @javax.validation.constraints.NotNull
    private String fragment;
    @javax.validation.constraints.NotNull
    private Collection<TextMatchHighlightGQO> highlights;
    @javax.validation.constraints.NotNull
    private String property;

    public TextMatchGQO() {
    }

    public TextMatchGQO(String fragment, Collection<TextMatchHighlightGQO> highlights, String property) {
        this.fragment = fragment;
        this.highlights = highlights;
        this.property = property;
    }

    public String getFragment() {
        return fragment;
    }
    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public Collection<TextMatchHighlightGQO> getHighlights() {
        return highlights;
    }
    public void setHighlights(Collection<TextMatchHighlightGQO> highlights) {
        this.highlights = highlights;
    }

    public String getProperty() {
        return property;
    }
    public void setProperty(String property) {
        this.property = property;
    }

}