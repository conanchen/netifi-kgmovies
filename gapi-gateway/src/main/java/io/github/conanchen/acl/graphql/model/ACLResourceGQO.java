package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class ACLResourceGQO implements NodeGQO {

    private ACLRoleGQO hasAclrole;
    @javax.validation.constraints.NotNull
    private ThingGQO resource;
    private Collection<ACLResourcePropertyGQO> resourceProperties;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLResourceGQO() {
    }

    public ACLResourceGQO(ACLRoleGQO hasAclrole, ThingGQO resource, Collection<ACLResourcePropertyGQO> resourceProperties, String id) {
        this.hasAclrole = hasAclrole;
        this.resource = resource;
        this.resourceProperties = resourceProperties;
        this.id = id;
    }

    public ACLRoleGQO getHasAclrole() {
        return hasAclrole;
    }

    public void setHasAclrole(ACLRoleGQO hasAclrole) {
        this.hasAclrole = hasAclrole;
    }

    public ThingGQO getResource() {
        return resource;
    }

    public void setResource(ThingGQO resource) {
        this.resource = resource;
    }

    public Collection<ACLResourcePropertyGQO> getResourceProperties() {
        return resourceProperties;
    }

    public void setResourceProperties(Collection<ACLResourcePropertyGQO> resourceProperties) {
        this.resourceProperties = resourceProperties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}