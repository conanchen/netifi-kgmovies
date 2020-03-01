package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.organization.graphql.model.OrganizationGQO;

import java.util.Collection;

public class ACLOrganizationGQO implements ACLPartyGQO {

    private OrganizationGQO organization;
    private Collection<ACLNamespaceGQO> hasNamespace;
    private Collection<ACLGroupGQO> hasAclg;

    public ACLOrganizationGQO() {
    }

    public ACLOrganizationGQO(OrganizationGQO organization, Collection<ACLNamespaceGQO> hasNamespace, Collection<ACLGroupGQO> hasAclg) {
        this.organization = organization;
        this.hasNamespace = hasNamespace;
        this.hasAclg = hasAclg;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public Collection<ACLNamespaceGQO> getHasNamespace() {
        return hasNamespace;
    }

    public void setHasNamespace(Collection<ACLNamespaceGQO> hasNamespace) {
        this.hasNamespace = hasNamespace;
    }

    public Collection<ACLGroupGQO> getHasAclg() {
        return hasAclg;
    }

    public void setHasAclg(Collection<ACLGroupGQO> hasAclg) {
        this.hasAclg = hasAclg;
    }

}