package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;

public class WebhookUpdateInputGQO {

    @javax.validation.constraints.NotNull
    private WebhookFilterGQO filter;
    private WebhookPatchGQO set;
    private WebhookPatchGQO remove;

    public WebhookUpdateInputGQO() {
    }

    public WebhookUpdateInputGQO(WebhookFilterGQO filter, WebhookPatchGQO set, WebhookPatchGQO remove) {
        this.filter = filter;
        this.set = set;
        this.remove = remove;
    }

    public WebhookFilterGQO getFilter() {
        return filter;
    }
    public void setFilter(WebhookFilterGQO filter) {
        this.filter = filter;
    }

    public WebhookPatchGQO getSet() {
        return set;
    }
    public void setSet(WebhookPatchGQO set) {
        this.set = set;
    }

    public WebhookPatchGQO getRemove() {
        return remove;
    }
    public void setRemove(WebhookPatchGQO remove) {
        this.remove = remove;
    }

}