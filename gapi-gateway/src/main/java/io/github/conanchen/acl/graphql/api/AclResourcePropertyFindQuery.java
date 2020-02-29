package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLResourcePropertyGQO;

public interface AclResourcePropertyFindQuery {

    ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId) throws Exception;

}