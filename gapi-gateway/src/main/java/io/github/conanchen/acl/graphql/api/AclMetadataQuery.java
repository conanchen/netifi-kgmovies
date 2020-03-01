package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.ACLMetadataGQO;

public interface AclMetadataQuery {

    ACLMetadataGQO aclMetadata(String id, String ugId) throws Exception;

}