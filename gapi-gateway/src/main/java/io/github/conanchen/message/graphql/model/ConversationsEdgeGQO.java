package io.github.conanchen.message.graphql.model;

public class ConversationsEdgeGQO {

    private ConversationGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public ConversationsEdgeGQO() {
    }

    public ConversationsEdgeGQO(final ConversationGQO node, final String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ConversationGQO getNode() {
        return node;
    }
    public void setNode(final ConversationGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(final String cursor) {
        this.cursor = cursor;
    }

}