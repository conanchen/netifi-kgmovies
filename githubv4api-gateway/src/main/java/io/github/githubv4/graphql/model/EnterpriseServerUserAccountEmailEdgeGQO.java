package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountEmailEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseServerUserAccountEmailGQO node;

    public EnterpriseServerUserAccountEmailEdgeGQO() {
    }

    public EnterpriseServerUserAccountEmailEdgeGQO(String cursor, EnterpriseServerUserAccountEmailGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerUserAccountEmailGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseServerUserAccountEmailGQO node) {
        this.node = node;
    }

}