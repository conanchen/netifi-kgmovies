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

public class Resolvers{
    public interface Ownership {
    // KK
    }
    public interface GeneralOrganization {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(GeneralOrganizationGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(GeneralOrganizationGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface OrgRoleName {
    // KK
    }
    public interface MemberRole {
    // KK
    }
    public interface EmployeeRole {
    // KK
    }
}