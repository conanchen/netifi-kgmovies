package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseMemberEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private Boolean isUnlicensed;
    private EnterpriseMemberGQO node;

    public EnterpriseMemberEdgeGQO() {
    }

    public EnterpriseMemberEdgeGQO(String cursor, Boolean isUnlicensed, EnterpriseMemberGQO node) {
        this.cursor = cursor;
        this.isUnlicensed = isUnlicensed;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getIsUnlicensed() {
        return isUnlicensed;
    }
    public void setIsUnlicensed(Boolean isUnlicensed) {
        this.isUnlicensed = isUnlicensed;
    }

    public EnterpriseMemberGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseMemberGQO node) {
        this.node = node;
    }

}