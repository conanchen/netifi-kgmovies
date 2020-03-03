package io.github.conanchen.organization.graphql.model;

public class EmployeeRoleEdgeGQO {

    private EmployeeRoleGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public EmployeeRoleEdgeGQO() {
    }

    public EmployeeRoleEdgeGQO(EmployeeRoleGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public EmployeeRoleGQO getNode() {
        return node;
    }

    public void setNode(EmployeeRoleGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}