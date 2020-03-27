package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.person.graphql.model.UserGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class ACLUserGQO implements ACLSubjectGQO, ACLPartyGQO{


    private UserGQO user;

    private Collection<ACLNamespaceGQO> hasNamespace;

    private Collection<ACLGroupGQO> hasAclg;

    public ACLUserGQO() {
    }

    public ACLUserGQO( UserGQO user,  Collection<ACLNamespaceGQO> hasNamespace,  Collection<ACLGroupGQO> hasAclg) {
        this.user = user;
        this.hasNamespace = hasNamespace;
        this.hasAclg = hasAclg;
    }

}