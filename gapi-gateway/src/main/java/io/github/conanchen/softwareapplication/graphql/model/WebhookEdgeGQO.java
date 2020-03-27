package io.github.conanchen.softwareapplication.graphql.model;

public class WebhookEdgeGQO {

    private WebhookGQO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public WebhookEdgeGQO() {
    }

    public WebhookEdgeGQO(WebhookGQO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public WebhookGQO getNode() {
        return node;
    }
    public void setNode(WebhookGQO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

}