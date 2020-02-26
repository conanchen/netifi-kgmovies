package io.github.conanchen.organization.graphql.api;

import io.github.conanchen.organization.graphql.model.OrganizationGQO;

public interface OrganizationQuery {

    OrganizationGQO organization(String id, String organizationID) throws Exception;

}