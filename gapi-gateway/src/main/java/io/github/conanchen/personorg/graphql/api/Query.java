package io.github.conanchen.personorg.graphql.api;

import io.github.conanchen.personorg.graphql.model.*;
import java.util.*;

public interface Query {

    OrganizationGQO organization(String id, String organizationID) throws Exception;

    GeneralOrganizationGQO generalOrganization(String id, String organizationID) throws Exception;

}