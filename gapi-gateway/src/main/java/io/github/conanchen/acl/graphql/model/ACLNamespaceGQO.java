package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class ACLNamespaceGQO implements NodeGQO {

    private Collection<ACLPartyGQO> isNamespaceOf;
    private String namespace;
    private Collection<ACLRoleGQO> hasRole;
    private Collection<ACLRoleBindingGQO> hasRoleBinding;
    private Collection<ThingGQO> hasBelongings;
    @javax.validation.constraints.NotNull
    private String id;

    public ACLNamespaceGQO() {
    }

    public ACLNamespaceGQO(Collection<ACLPartyGQO> isNamespaceOf, String namespace, Collection<ACLRoleGQO> hasRole, Collection<ACLRoleBindingGQO> hasRoleBinding, Collection<ThingGQO> hasBelongings, String id) {
        this.isNamespaceOf = isNamespaceOf;
        this.namespace = namespace;
        this.hasRole = hasRole;
        this.hasRoleBinding = hasRoleBinding;
        this.hasBelongings = hasBelongings;
        this.id = id;
    }

    public Collection<ACLPartyGQO> getIsNamespaceOf() {
        return isNamespaceOf;
    }

    public void setIsNamespaceOf(Collection<ACLPartyGQO> isNamespaceOf) {
        this.isNamespaceOf = isNamespaceOf;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Collection<ACLRoleGQO> getHasRole() {
        return hasRole;
    }

    public void setHasRole(Collection<ACLRoleGQO> hasRole) {
        this.hasRole = hasRole;
    }

    public Collection<ACLRoleBindingGQO> getHasRoleBinding() {
        return hasRoleBinding;
    }

    public void setHasRoleBinding(Collection<ACLRoleBindingGQO> hasRoleBinding) {
        this.hasRoleBinding = hasRoleBinding;
    }

    public Collection<ThingGQO> getHasBelongings() {
        return hasBelongings;
    }

    public void setHasBelongings(Collection<ThingGQO> hasBelongings) {
        this.hasBelongings = hasBelongings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}