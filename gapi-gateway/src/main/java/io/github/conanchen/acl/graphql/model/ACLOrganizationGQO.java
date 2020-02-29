package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.organization.graphql.model.OrganizationGQO;

import java.util.Collection;

public class ACLOrganizationGQO implements ACLPartyGQO {

    private OrganizationGQO organization;
    private Collection<ACLRoleGQO> hasAclr;

    public ACLOrganizationGQO() {
    }

    public ACLOrganizationGQO(OrganizationGQO organization, Collection<ACLRoleGQO> hasAclr) {
        this.organization = organization;
        this.hasAclr = hasAclr;
    }

    public OrganizationGQO getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationGQO organization) {
        this.organization = organization;
    }

    public Collection<ACLRoleGQO> getHasAclr() {
        return hasAclr;
    }

    public void setHasAclr(Collection<ACLRoleGQO> hasAclr) {
        this.hasAclr = hasAclr;
    }

}