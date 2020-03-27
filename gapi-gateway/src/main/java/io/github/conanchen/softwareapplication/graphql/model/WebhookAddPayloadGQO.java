package io.github.conanchen.softwareapplication.graphql.model;

import java.util.Collection;

public class WebhookAddPayloadGQO {

    private WebhookGQO item;
    @javax.validation.constraints.NotNull
    private Collection<WebhookAddErrorGQO> errors;

    public WebhookAddPayloadGQO() {
    }

    public WebhookAddPayloadGQO(WebhookGQO item, Collection<WebhookAddErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

    public WebhookGQO getItem() {
        return item;
    }
    public void setItem(WebhookGQO item) {
        this.item = item;
    }

    public Collection<WebhookAddErrorGQO> getErrors() {
        return errors;
    }
    public void setErrors(Collection<WebhookAddErrorGQO> errors) {
        this.errors = errors;
    }

}