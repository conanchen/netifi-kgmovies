package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ACLRoleGQO implements NodeGQO{


    private ACLPartyGQO isRoleOf;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Collection<ACLVerbGQO> verbs;
    @javax.validation.constraints.NotNull
    private Collection<ACLResourceGQO> objects;
    @javax.validation.constraints.NotNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String alternateName;

    private String description;

    private Collection<ACLRoleBindingGQO> hasRolebinding;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLRoleGQO() {
    }

    public ACLRoleGQO( ACLPartyGQO isRoleOf,  String name,  Collection<ACLVerbGQO> verbs,  Collection<ACLResourceGQO> objects,  Collection<ACLNamespaceGQO> namespaces,  String alternateName,  String description,  Collection<ACLRoleBindingGQO> hasRolebinding,  String id) {
        this.isRoleOf = isRoleOf;
        this.name = name;
        this.verbs = verbs;
        this.objects = objects;
        this.namespaces = namespaces;
        this.alternateName = alternateName;
        this.description = description;
        this.hasRolebinding = hasRolebinding;
        this.id = id;
    }

}