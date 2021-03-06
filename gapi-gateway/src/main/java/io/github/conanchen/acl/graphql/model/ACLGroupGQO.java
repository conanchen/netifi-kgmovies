package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.acl.graphql.api.*;
import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ACLGroupGQO implements ACLSubjectGQO, ThingGQO, NodeGQO{

    @lombok.NonNull
    private ACLPartyGQO isAclgOf;

    private String name;

    private String alternateName;

    private String description;

    private Collection<ACLUserGQO> member;
    @lombok.NonNull
    private String id;

    public ACLGroupGQO() {
    }

    public ACLGroupGQO( ACLPartyGQO isAclgOf,  String name,  String alternateName,  String description,  Collection<ACLUserGQO> member,  String id) {
        this.isAclgOf = isAclgOf;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.member = member;
        this.id = id;
    }

}