package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;

public class WebhookUpdatePayloadGQO {

    private WebhookGQO item;
    @javax.validation.constraints.NotNull
    private Collection<WebhookUpdateErrorGQO> errors;
    private Collection<WebhookGQO> webhook;

    public WebhookUpdatePayloadGQO() {
    }

    public WebhookUpdatePayloadGQO(WebhookGQO item, Collection<WebhookUpdateErrorGQO> errors, Collection<WebhookGQO> webhook) {
        this.item = item;
        this.errors = errors;
        this.webhook = webhook;
    }

    public WebhookGQO getItem() {
        return item;
    }
    public void setItem(WebhookGQO item) {
        this.item = item;
    }

    public Collection<WebhookUpdateErrorGQO> getErrors() {
        return errors;
    }
    public void setErrors(Collection<WebhookUpdateErrorGQO> errors) {
        this.errors = errors;
    }

    public Collection<WebhookGQO> getWebhook() {
        return webhook;
    }
    public void setWebhook(Collection<WebhookGQO> webhook) {
        this.webhook = webhook;
    }

}