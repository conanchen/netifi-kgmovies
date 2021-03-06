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
public class WebhookUpdateErrorGQO implements DisplayableErrorGQO{


    private WebhookUpdateErrorCodeGQO code;
    @lombok.NonNull
    private Collection<String> field;
    @lombok.NonNull
    private String message;

    public WebhookUpdateErrorGQO() {
    }

    public WebhookUpdateErrorGQO( WebhookUpdateErrorCodeGQO code,  Collection<String> field,  String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

}