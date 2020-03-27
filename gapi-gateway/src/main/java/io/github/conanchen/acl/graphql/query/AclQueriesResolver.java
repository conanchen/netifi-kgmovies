package io.github.conanchen.acl.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.acl.graphql.api.Query;
import io.github.conanchen.acl.graphql.model.*;
import org.springframework.stereotype.Service;


@Service
public class AclQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public ACLRoleGQO aclRoleFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLGroupGQO aclGroupFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLOrganizationGQO aclOrganizationFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLUserGQO aclUserFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public ACLMetadataGQO aclMetadata(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}