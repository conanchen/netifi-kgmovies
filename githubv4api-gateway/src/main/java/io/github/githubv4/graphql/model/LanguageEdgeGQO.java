package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class LanguageEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private LanguageGQO node;
    @javax.validation.constraints.NotNull
    private Integer size;

    public LanguageEdgeGQO() {
    }

    public LanguageEdgeGQO(String cursor, LanguageGQO node, Integer size) {
        this.cursor = cursor;
        this.node = node;
        this.size = size;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public LanguageGQO getNode() {
        return node;
    }
    public void setNode(LanguageGQO node) {
        this.node = node;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

}