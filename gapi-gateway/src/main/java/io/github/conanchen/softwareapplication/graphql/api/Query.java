package io.github.conanchen.softwareapplication.graphql.api;

import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationGQO;
import io.github.conanchen.softwareapplication.graphql.model.SoftwareApplicationsConnectionGQO;

public interface Query {

    SoftwareApplicationsConnectionGQO allSoftwareApplications(String after, Integer first, String before, Integer last) throws Exception;

    SoftwareApplicationGQO softwareApplication(String id, String softwareApplicationID) throws Exception;

}