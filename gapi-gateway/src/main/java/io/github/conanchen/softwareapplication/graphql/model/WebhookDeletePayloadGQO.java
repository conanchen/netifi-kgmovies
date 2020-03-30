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
public class WebhookDeletePayloadGQO {


    private WebhookDeleteErrorCodeGQO code;
    @lombok.NonNull
    private String message;

    public WebhookDeletePayloadGQO() {
    }

    public WebhookDeletePayloadGQO( WebhookDeleteErrorCodeGQO code,  String message) {
        this.code = code;
        this.message = message;
    }

}