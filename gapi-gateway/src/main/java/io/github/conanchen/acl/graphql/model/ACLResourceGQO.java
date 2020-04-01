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
public class ACLResourceGQO implements NodeGQO{

    @lombok.NonNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String uid;

    private String name;

    private Collection<ACLResourcePropertyGQO> properties;
    @lombok.NonNull
    private String id;

    public ACLResourceGQO() {
    }

    public ACLResourceGQO( Collection<ACLNamespaceGQO> namespaces,  String uid,  String name,  Collection<ACLResourcePropertyGQO> properties,  String id) {
        this.namespaces = namespaces;
        this.uid = uid;
        this.name = name;
        this.properties = properties;
        this.id = id;
    }

}