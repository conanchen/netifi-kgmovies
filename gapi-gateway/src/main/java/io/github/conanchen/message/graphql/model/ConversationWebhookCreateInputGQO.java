package io.github.conanchen.message.graphql.model;

public class ConversationWebhookCreateInputGQO {

    @javax.validation.constraints.NotNull
    private String actionId;

    public ConversationWebhookCreateInputGQO() {
    }

    public ConversationWebhookCreateInputGQO(String actionId) {
        this.actionId = actionId;
    }

    public String getActionId() {
        return actionId;
    }
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

}