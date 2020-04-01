package io.github.conanchen.acl.graphql.query;

import graphql.GraphQLContext;
import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.acl.graphql.api.Query;
import io.github.conanchen.acl.graphql.model.*;
import io.github.config.CustomAuthGraphQLContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AclQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public ACLRoleGQO aclRoleFind(String id, String ugId, DataFetchingEnvironment env) throws Exception {
        CustomAuthGraphQLContext a = env.getContext();
        log.info(String.format("env.getContext() = %s",a.getAuthContext().toString()));
        return ACLRoleGQO.builder().name("rolename").alternateName("rolealtername").build();
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