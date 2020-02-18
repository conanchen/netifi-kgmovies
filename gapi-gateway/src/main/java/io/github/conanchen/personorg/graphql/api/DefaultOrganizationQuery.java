package io.github.conanchen.personorg.graphql.api;

import io.github.conanchen.personorg.graphql.model.*;
import java.util.*;

public interface DefaultOrganizationQuery {

    DefaultOrganizationGQO defaultOrganization(String id, String organizationID) throws Exception;

}