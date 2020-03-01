package io.github.conanchen.acl.graphql.model;

import java.util.Collection;

public interface ACLPartyGQO {

    Collection<ACLNamespaceGQO> getHasNamespace();

    Collection<ACLGroupGQO> getHasAclg();

}