package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class SponsorsTierEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private SponsorsTierGQO node;

    public SponsorsTierEdgeGQO() {
    }

    public SponsorsTierEdgeGQO(String cursor, SponsorsTierGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SponsorsTierGQO getNode() {
        return node;
    }
    public void setNode(SponsorsTierGQO node) {
        this.node = node;
    }

}