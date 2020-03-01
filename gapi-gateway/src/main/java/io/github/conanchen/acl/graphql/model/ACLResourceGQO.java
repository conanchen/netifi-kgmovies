package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class ACLResourceGQO implements NodeGQO {

    @javax.validation.constraints.NotNull
    private ACLNamespaceGQO namespace;
    private String uid;
    private String name;
    private Collection<ACLResourcePropertyGQO> properties;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLResourceGQO() {
    }

    public ACLResourceGQO(ACLNamespaceGQO namespace, String uid, String name, Collection<ACLResourcePropertyGQO> properties, String id) {
        this.namespace = namespace;
        this.uid = uid;
        this.name = name;
        this.properties = properties;
        this.id = id;
    }

    public ACLNamespaceGQO getNamespace() {
        return namespace;
    }

    public void setNamespace(ACLNamespaceGQO namespace) {
        this.namespace = namespace;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<ACLResourcePropertyGQO> getProperties() {
        return properties;
    }

    public void setProperties(Collection<ACLResourcePropertyGQO> properties) {
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}