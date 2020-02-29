package io.github.conanchen.acl.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.conanchen.acl.graphql.api.Query;
import io.github.conanchen.acl.graphql.model.*;
import org.springframework.stereotype.Service;


@Service
public class AclQueriesResolver implements Query, GraphQLQueryResolver {


    @Override
    public ACLRoleGQO aclRoleFind(String id, String ugId) throws Exception {
        return null;
    }

    @Override
    public ACLGroupGQO aclGroupFind(String id, String ugId) throws Exception {
        return null;
    }

    @Override
    public ACLOrganizationGQO aclOrganizationFind(String id, String ugId) throws Exception {
        return null;
    }

    @Override
    public ACLUserGQO aclUserFind(String id, String ugId) throws Exception {
        return null;
    }

    @Override
    public ACLActionGQO aclActionFind(String id, String ugId) throws Exception {
        return null;
    }

    @Override
    public ACLResourcePropertyGQO aclResourcePropertyFind(String id, String ugId) throws Exception {
        return null;
    }
}