package io.github.conanchen.softwareapplication.graphql.model;

import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;

import java.util.Collection;

public class WebhookUpdateErrorGQO implements DisplayableErrorGQO {

    private WebhookUpdateErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public WebhookUpdateErrorGQO() {
    }

    public WebhookUpdateErrorGQO(WebhookUpdateErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public WebhookUpdateErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(WebhookUpdateErrorCodeGQO code) {
        this.code = code;
    }

    public Collection<String> getField() {
        return field;
    }
    public void setField(Collection<String> field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}