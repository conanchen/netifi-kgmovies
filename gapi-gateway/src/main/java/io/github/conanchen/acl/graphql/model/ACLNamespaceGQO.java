package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ACLNamespaceGQO implements NodeGQO{


    private String namespace;

    private ACLPartyGQO isNamespaceOf;

    private Collection<ACLRoleGQO> hasRole;

    private Collection<ACLRoleBindingGQO> hasRoleBinding;

    private Collection<ThingGQO> hasBelongings;
    @javax.validation.constraints.NotNull
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