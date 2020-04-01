package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import io.github.conanchen.event.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class WebhookFilterGQO {


    private StringHashFilterGQO name;
    @lombok.NonNull
    private Collection<String> id;

    private WebhookFilterGQO and;

    private WebhookFilterGQO or;

    private WebhookFilterGQO not;

    public WebhookFilterGQO() {
    }

    public WebhookFilterGQO( StringHashFilterGQO name,  Collection<String> id,  WebhookFilterGQO and,  WebhookFilterGQO or,  WebhookFilterGQO not) {
        this.name = name;
        this.id = id;
        this.and = and;
        this.or = or;
        this.not = not;
    }

}