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
public class WebhookUpdatePayloadGQO {


    private WebhookGQO item;
    @lombok.NonNull
    private Collection<WebhookUpdateErrorGQO> errors;

    public WebhookUpdatePayloadGQO() {
    }

    public WebhookUpdatePayloadGQO( WebhookGQO item,  Collection<WebhookUpdateErrorGQO> errors) {
        this.item = item;
        this.errors = errors;
    }

}