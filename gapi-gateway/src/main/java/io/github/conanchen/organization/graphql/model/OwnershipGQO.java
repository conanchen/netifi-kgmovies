package io.github.conanchen.organization.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.organization.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class OwnershipGQO {


    private PartyGQO acquiredFrom;

    private java.util.Date ownedFrom;

    private java.util.Date ownedThrough;

    private OwnableGQO owned;

    private PartyGQO owner;

    public OwnershipGQO() {
    }

    public OwnershipGQO( PartyGQO acquiredFrom,  java.util.Date ownedFrom,  java.util.Date ownedThrough,  OwnableGQO owned,  PartyGQO owner) {
        this.acquiredFrom = acquiredFrom;
        this.ownedFrom = ownedFrom;
        this.ownedThrough = ownedThrough;
        this.owned = owned;
        this.owner = owner;
    }

}