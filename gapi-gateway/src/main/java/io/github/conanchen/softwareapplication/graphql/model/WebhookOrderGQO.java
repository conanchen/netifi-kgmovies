package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.softwareapplication.graphql.api.*;

public class WebhookOrderGQO {

    private WebhookOrderableGQO asc;
    private WebhookOrderableGQO desc;
    private WebhookOrderGQO then;

    public WebhookOrderGQO() {
    }

    public WebhookOrderGQO(WebhookOrderableGQO asc, WebhookOrderableGQO desc, WebhookOrderGQO then) {
        this.asc = asc;
        this.desc = desc;
        this.then = then;
    }

    public WebhookOrderableGQO getAsc() {
        return asc;
    }
    public void setAsc(WebhookOrderableGQO asc) {
        this.asc = asc;
    }

    public WebhookOrderableGQO getDesc() {
        return desc;
    }
    public void setDesc(WebhookOrderableGQO desc) {
        this.desc = desc;
    }

    public WebhookOrderGQO getThen() {
        return then;
    }
    public void setThen(WebhookOrderGQO then) {
        this.then = then;
    }

}