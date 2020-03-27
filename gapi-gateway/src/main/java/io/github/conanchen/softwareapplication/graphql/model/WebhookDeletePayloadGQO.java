package io.github.conanchen.softwareapplication.graphql.model;

import java.util.Collection;

public class WebhookDeletePayloadGQO {

    private WebhookDeleteErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private String message;
    private Collection<WebhookConnectionGQO> webhookSearch;

    public WebhookDeletePayloadGQO() {
    }

    public WebhookDeletePayloadGQO(WebhookDeleteErrorCodeGQO code, String message, Collection<WebhookConnectionGQO> webhookSearch) {
        this.code = code;
        this.message = message;
        this.webhookSearch = webhookSearch;
    }

    public WebhookDeleteErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(WebhookDeleteErrorCodeGQO code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Collection<WebhookConnectionGQO> getWebhookSearch() {
        return webhookSearch;
    }
    public void setWebhookSearch(Collection<WebhookConnectionGQO> webhookSearch) {
        this.webhookSearch = webhookSearch;
    }

}