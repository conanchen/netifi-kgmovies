package io.github.conanchen.organization.graphql.model;

public class MemberRoleEdgeGQO {

    private MemberRoleGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public MemberRoleEdgeGQO() {
    }

    public MemberRoleEdgeGQO(MemberRoleGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public MemberRoleGQO getNode() {
        return node;
    }

    public void setNode(MemberRoleGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}