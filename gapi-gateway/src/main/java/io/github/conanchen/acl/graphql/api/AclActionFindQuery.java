package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLActionGQO;

public interface AclActionFindQuery {

    ACLActionGQO aclActionFind(String id, String ugId) throws Exception;

}