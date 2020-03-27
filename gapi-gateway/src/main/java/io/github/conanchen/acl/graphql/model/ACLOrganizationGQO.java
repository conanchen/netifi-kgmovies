package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.organization.graphql.model.OrganizationGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ACLOrganizationGQO implements ACLPartyGQO{


    private OrganizationGQO organization;

    private Collection<ACLNamespaceGQO> hasNamespace;

    private Collection<ACLGroupGQO> hasAclg;

    public ACLOrganizationGQO() {
    }

    public ACLOrganizationGQO( OrganizationGQO organization,  Collection<ACLNamespaceGQO> hasNamespace,  Collection<ACLGroupGQO> hasAclg) {
        this.organization = organization;
        this.hasNamespace = hasNamespace;
        this.hasAclg = hasAclg;
    }

}