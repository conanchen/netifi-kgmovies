package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerInstallationEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseServerInstallationGQO node;

    public EnterpriseServerInstallationEdgeGQO() {
    }

    public EnterpriseServerInstallationEdgeGQO(String cursor, EnterpriseServerInstallationGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerInstallationGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseServerInstallationGQO node) {
        this.node = node;
    }

}