package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.acl.graphql.api.*;
import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ACLMetadataGQO {


    private ACLableGQO isAclmetadataOf;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String uid;

    private Collection<ACLNamespaceGQO> namespace;

    public ACLMetadataGQO() {
    }

    public ACLMetadataGQO( ACLableGQO isAclmetadataOf,  String name,  String uid,  Collection<ACLNamespaceGQO> namespace) {
        this.isAclmetadataOf = isAclmetadataOf;
        this.name = name;
        this.uid = uid;
        this.namespace = namespace;
    }

}