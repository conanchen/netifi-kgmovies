package io.github.conanchen.message.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;

public interface OrganizationQuery {

    OrganizationGQO organization(String id, String organizationID) throws Exception;

}