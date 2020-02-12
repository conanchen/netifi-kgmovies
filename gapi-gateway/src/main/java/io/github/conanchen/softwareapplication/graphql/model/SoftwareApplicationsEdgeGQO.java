package io.github.conanchen.softwareapplication.graphql.model;

public class SoftwareApplicationsEdgeGQO {

    private SoftwareApplicationGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public SoftwareApplicationsEdgeGQO() {
    }

    public SoftwareApplicationsEdgeGQO(SoftwareApplicationGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public SoftwareApplicationGQO getNode() {
        return node;
    }
    public void setNode(SoftwareApplicationGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}