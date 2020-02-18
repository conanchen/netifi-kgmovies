package io.github.conanchen.personorg.graphql.model;

import java.util.*;
import io.github.conanchen.personorg.graphql.api.*;

public class MembershipEdgeGQO {

    private MembershipGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public MembershipEdgeGQO() {
    }

    public MembershipEdgeGQO(MembershipGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public MembershipGQO getNode() {
        return node;
    }
    public void setNode(MembershipGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}