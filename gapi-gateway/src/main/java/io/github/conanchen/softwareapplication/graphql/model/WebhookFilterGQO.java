package io.github.conanchen.softwareapplication.graphql.model;

import io.github.conanchen.zommon.graphql.model.StringHashFilterGQO;

import java.util.Collection;

public class WebhookFilterGQO {

    private StringHashFilterGQO name;
    @javax.validation.constraints.NotNull
    private Collection<String> id;
    private WebhookFilterGQO and;
    private WebhookFilterGQO or;
    private WebhookFilterGQO not;

    public WebhookFilterGQO() {
    }

    public WebhookFilterGQO(StringHashFilterGQO name, Collection<String> id, WebhookFilterGQO and, WebhookFilterGQO or, WebhookFilterGQO not) {
        this.name = name;
        this.id = id;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public StringHashFilterGQO getName() {
        return name;
    }
    public void setName(StringHashFilterGQO name) {
        this.name = name;
    }

    public Collection<String> getId() {
        return id;
    }
    public void setId(Collection<String> id) {
        this.id = id;
    }

    public WebhookFilterGQO getAnd() {
        return and;
    }
    public void setAnd(WebhookFilterGQO and) {
        this.and = and;
    }

    public WebhookFilterGQO getOr() {
        return or;
    }
    public void setOr(WebhookFilterGQO or) {
        this.or = or;
    }

    public WebhookFilterGQO getNot() {
        return not;
    }
    public void setNot(WebhookFilterGQO not) {
        this.not = not;
    }

}