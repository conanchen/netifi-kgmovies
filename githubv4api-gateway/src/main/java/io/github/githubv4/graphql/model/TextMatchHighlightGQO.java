package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class TextMatchHighlightGQO {

    @javax.validation.constraints.NotNull
    private Integer beginIndice;
    @javax.validation.constraints.NotNull
    private Integer endIndice;
    @javax.validation.constraints.NotNull
    private String text;

    public TextMatchHighlightGQO() {
    }

    public TextMatchHighlightGQO(Integer beginIndice, Integer endIndice, String text) {
        this.beginIndice = beginIndice;
        this.endIndice = endIndice;
        this.text = text;
    }

    public Integer getBeginIndice() {
        return beginIndice;
    }
    public void setBeginIndice(Integer beginIndice) {
        this.beginIndice = beginIndice;
    }

    public Integer getEndIndice() {
        return endIndice;
    }
    public void setEndIndice(Integer endIndice) {
        this.endIndice = endIndice;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}