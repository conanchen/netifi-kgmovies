package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLGroupGQO;

public interface AclGroupFindQuery {

    ACLGroupGQO aclGroupFind(String id, String ugId) throws Exception;

}