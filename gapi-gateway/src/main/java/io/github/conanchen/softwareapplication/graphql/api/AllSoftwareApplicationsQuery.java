package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationsConnectionGQO;

public interface AllSoftwareApplicationsQuery {

    SoftwareApplicationsConnectionGQO allSoftwareApplications(String after, Integer first, String before, Integer last) throws Exception;

}