package io.github.conanchen.message.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.api.*;

public class ConversationEdgeGQO {

    private ConversationGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public ConversationEdgeGQO() {
    }

    public ConversationEdgeGQO(ConversationGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ConversationGQO getNode() {
        return node;
    }
    public void setNode(ConversationGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}