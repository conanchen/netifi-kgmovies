package io.github.conanchen.acl.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;
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