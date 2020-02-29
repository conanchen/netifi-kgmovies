package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLUserGQO;

public interface AclUserFindQuery {

    ACLUserGQO aclUserFind(String id, String ugId) throws Exception;

}