package io.github.conanchen.acl.graphql.model;

import java.util.Collection;

public interface ACLPartyGQO {

    Collection<ACLRoleGQO> getHasAclr();

}