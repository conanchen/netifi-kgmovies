package io.github.conanchen.acl.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    ACLRoleGQO aclRoleFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLGroupGQO aclGroupFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLOrganizationGQO aclOrganizationFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLUserGQO aclUserFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId, DataFetchingEnvironment env) throws Exception;
    ACLMetadataGQO aclMetadata(String id, String ugId, DataFetchingEnvironment env) throws Exception;
}