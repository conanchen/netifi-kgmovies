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
public class ACLRoleBindingGQO implements NodeGQO{


    private ACLNamespaceGQO isRolebindingOf;

    private ACLRoleGQO isBindingOf;

    private Collection<ACLSubjectGQO> subjects;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLRoleBindingGQO() {
    }

    public ACLRoleBindingGQO( ACLNamespaceGQO isRolebindingOf,  ACLRoleGQO isBindingOf,  Collection<ACLSubjectGQO> subjects,  String id) {
        this.isRolebindingOf = isRolebindingOf;
        this.isBindingOf = isBindingOf;
        this.subjects = subjects;
        this.id = id;
    }

}