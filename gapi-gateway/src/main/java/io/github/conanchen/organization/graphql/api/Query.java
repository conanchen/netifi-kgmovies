package io.github.conanchen.organization.graphql.api;

import java.util.*;
import io.github.conanchen.event.graphql.model.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    OrganizationGQO organization(String id, String organizationID, DataFetchingEnvironment env) throws Exception;
    GeneralOrganizationGQO generalOrganization(String id, String organizationID, DataFetchingEnvironment env) throws Exception;
}