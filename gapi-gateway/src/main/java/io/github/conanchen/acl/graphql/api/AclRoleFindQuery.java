package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLRoleGQO;

public interface AclRoleFindQuery {

    ACLRoleGQO aclRoleFind(String id, String ugId) throws Exception;

}