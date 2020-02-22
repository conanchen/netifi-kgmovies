package io.github.conanchen.personorg.graphql.api;

import io.github.conanchen.personorg.graphql.model.*;
import java.util.*;

public interface GeneralOrganizationQuery {

    GeneralOrganizationGQO generalOrganization(String id, String organizationID) throws Exception;

}