package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseUserAccountEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseUserAccountGQO node;

    public EnterpriseUserAccountEdgeGQO() {
    }

    public EnterpriseUserAccountEdgeGQO(String cursor, EnterpriseUserAccountGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseUserAccountGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseUserAccountGQO node) {
        this.node = node;
    }

}