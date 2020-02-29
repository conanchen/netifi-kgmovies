package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

import java.util.Collection;

public class ACLRoleGQO implements NodeGQO {

    @javax.validation.constraints.NotNull
    private ACLPartyGQO isAclrOf;
    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    @javax.validation.constraints.NotNull
    private Collection<ACLActionGQO> action;
    @javax.validation.constraints.NotNull
    private ACLResourceGQO isAclroleOf;
    private Collection<ACLRoleBindingGQO> hasBinding;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLRoleGQO() {
    }

    public ACLRoleGQO(ACLPartyGQO isAclrOf, String name, String alternateName, String description, Collection<ACLActionGQO> action, ACLResourceGQO isAclroleOf, Collection<ACLRoleBindingGQO> hasBinding, String id) {
        this.isAclrOf = isAclrOf;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.action = action;
        this.isAclroleOf = isAclroleOf;
        this.hasBinding = hasBinding;
        this.id = id;
    }

    public ACLPartyGQO getIsAclrOf() {
        return isAclrOf;
    }

    public void setIsAclrOf(ACLPartyGQO isAclrOf) {
        this.isAclrOf = isAclrOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<ACLActionGQO> getAction() {
        return action;
    }

    public void setAction(Collection<ACLActionGQO> action) {
        this.action = action;
    }

    public ACLResourceGQO getIsAclroleOf() {
        return isAclroleOf;
    }

    public void setIsAclroleOf(ACLResourceGQO isAclroleOf) {
        this.isAclroleOf = isAclroleOf;
    }

    public Collection<ACLRoleBindingGQO> getHasBinding() {
        return hasBinding;
    }

    public void setHasBinding(Collection<ACLRoleBindingGQO> hasBinding) {
        this.hasBinding = hasBinding;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}