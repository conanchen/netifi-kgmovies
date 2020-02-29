package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLOrganizationGQO;

public interface AclOrganizationFindQuery {

    ACLOrganizationGQO aclOrganizationFind(String id, String ugId) throws Exception;

}