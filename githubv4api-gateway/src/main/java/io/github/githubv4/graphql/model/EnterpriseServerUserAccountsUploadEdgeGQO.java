package io.github.githubv4.graphql.model;

import io.github.githubv4.graphql.api.*;
import java.util.*;

public class EnterpriseServerUserAccountsUploadEdgeGQO {

    @javax.validation.constraints.NotNull
    private String cursor;
    private EnterpriseServerUserAccountsUploadGQO node;

    public EnterpriseServerUserAccountsUploadEdgeGQO() {
    }

    public EnterpriseServerUserAccountsUploadEdgeGQO(String cursor, EnterpriseServerUserAccountsUploadGQO node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerUserAccountsUploadGQO getNode() {
        return node;
    }
    public void setNode(EnterpriseServerUserAccountsUploadGQO node) {
        this.node = node;
    }

}