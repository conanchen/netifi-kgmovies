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
public class ACLNamespaceGQO implements NodeGQO{


    private String namespace;

    private ACLPartyGQO isNamespaceOf;

    private Collection<ACLRoleGQO> hasRole;

    private Collection<ACLRoleBindingGQO> hasRoleBinding;

    private Collection<ThingGQO> hasBelongings;
    @lombok.NonNull
    private String id;

    public ACLNamespaceGQO() {
    }

    public ACLNamespaceGQO( String namespace,  ACLPartyGQO isNamespaceOf,  Collection<ACLRoleGQO> hasRole,  Collection<ACLRoleBindingGQO> hasRoleBinding,  Collection<ThingGQO> hasBelongings,  String id) {
        this.namespace = namespace;
        this.isNamespaceOf = isNamespaceOf;
        this.hasRole = hasRole;
        this.hasRoleBinding = hasRoleBinding;
        this.hasBelongings = hasBelongings;
        this.id = id;
    }

}