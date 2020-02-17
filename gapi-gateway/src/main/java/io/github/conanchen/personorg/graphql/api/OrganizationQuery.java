package io.github.conanchen.personorg.graphql.api;

import io.github.conanchen.personorg.graphql.model.*;
import java.util.*;

public interface OrganizationQuery {

    OrganizationGQO organization(String id, String organizationID) throws Exception;

}