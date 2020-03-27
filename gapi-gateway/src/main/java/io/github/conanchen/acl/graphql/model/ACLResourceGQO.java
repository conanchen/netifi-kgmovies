package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ACLResourceGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private Collection<ACLNamespaceGQO> namespaces;

    private String uid;

    private String name;

    private Collection<ACLResourcePropertyGQO> properties;
    @javax.validation.constraints.NotNull
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