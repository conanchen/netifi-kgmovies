package io.github.conanchen.acl.graphql.api;

import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.acl.graphql.model.*;

public interface Query {
// KK
    ACLRoleGQO aclRoleFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLGroupGQO aclGroupFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLOrganizationGQO aclOrganizationFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLUserGQO aclUserFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLMetadataGQO aclMetadata(String id, String ugId, DataFetchingEnvironment env) throws Exception;
}