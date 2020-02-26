package io.github.conanchen.organization.graphql.model;

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