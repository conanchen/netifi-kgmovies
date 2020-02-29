package io.github.conanchen.acl.graphql.api;

import io.github.conanchen.acl.graphql.model.*;

public interface Query {

    ACLRoleGQO aclRoleFind(String id, String ugId) throws Exception;

    ACLGroupGQO aclGroupFind(String id, String ugId) throws Exception;

    ACLOrganizationGQO aclOrganizationFind(String id, String ugId) throws Exception;

    ACLUserGQO aclUserFind(String id, String ugId) throws Exception;

    ACLActionGQO aclActionFind(String id, String ugId) throws Exception;

    ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId) throws Exception;

}