package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class WebhookOrderGQO {


    private WebhookOrderableGQO asc;

    private WebhookOrderableGQO desc;

    private WebhookOrderGQO then;

    public WebhookOrderGQO() {
    }

    public WebhookOrderGQO( WebhookOrderableGQO asc,  WebhookOrderableGQO desc,  WebhookOrderGQO then) {
        this.asc = asc;
        this.desc = desc;
        this.then = then;
    }

}