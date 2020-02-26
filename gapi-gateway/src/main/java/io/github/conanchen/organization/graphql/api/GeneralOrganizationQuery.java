package io.github.conanchen.organization.graphql.api;

import io.github.conanchen.organization.graphql.model.GeneralOrganizationGQO;

public interface GeneralOrganizationQuery {

    GeneralOrganizationGQO generalOrganization(String id, String organizationID) throws Exception;

}