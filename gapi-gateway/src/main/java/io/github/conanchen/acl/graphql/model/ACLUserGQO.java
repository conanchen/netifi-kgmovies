package io.github.conanchen.acl.graphql.model;

import io.github.conanchen.acl.graphql.api.*;
import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
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