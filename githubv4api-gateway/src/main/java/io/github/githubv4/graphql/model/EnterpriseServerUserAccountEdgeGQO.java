package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseServerUserAccountGQO node;

    public EnterpriseServerUserAccountEdgeGQO() {
    }

    public EnterpriseServerUserAccountEdgeGQO(String cursor, EnterpriseServerUserAccountGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerUserAccountGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseServerUserAccountGQO node) {
        this.node = node;
    }

}