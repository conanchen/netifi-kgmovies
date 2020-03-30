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
public class WebhookUpdateInputGQO {

    @lombok.NonNull
    private WebhookFilterGQO filter;

    private WebhookPatchGQO set;

    private WebhookPatchGQO remove;

    public WebhookUpdateInputGQO() {
    }

    public WebhookUpdateInputGQO( WebhookFilterGQO filter,  WebhookPatchGQO set,  WebhookPatchGQO remove) {
        this.filter = filter;
        this.set = set;
        this.remove = remove;
    }

}