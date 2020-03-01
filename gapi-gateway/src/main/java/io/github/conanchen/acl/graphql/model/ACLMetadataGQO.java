package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class ACLMetadataGQO {

    private ThingGQO isAclmetadataOf;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String uid;
    private Collection<ACLNamespaceGQO> namespace;

    public ACLMetadataGQO() {
    }

    public ACLMetadataGQO(ThingGQO isAclmetadataOf, String name, String uid, Collection<ACLNamespaceGQO> namespace) {
        this.isAclmetadataOf = isAclmetadataOf;
        this.name = name;
        this.uid = uid;
        this.namespace = namespace;
    }

    public ThingGQO getIsAclmetadataOf() {
        return isAclmetadataOf;
    }

    public void setIsAclmetadataOf(ThingGQO isAclmetadataOf) {
        this.isAclmetadataOf = isAclmetadataOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Collection<ACLNamespaceGQO> getNamespace() {
        return namespace;
    }

    public void setNamespace(Collection<ACLNamespaceGQO> namespace) {
        this.namespace = namespace;
    }

}