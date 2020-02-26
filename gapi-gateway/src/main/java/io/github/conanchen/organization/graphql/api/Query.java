package io.github.conanchen.organization.graphql.api;

import io.github.conanchen.organization.graphql.model.GeneralOrganizationGQO;
import io.github.conanchen.organization.graphql.model.OrganizationGQO;

public interface Query {

    OrganizationGQO organization(String id, String organizationID) throws Exception;

    GeneralOrganizationGQO generalOrganization(String id, String organizationID) throws Exception;

}