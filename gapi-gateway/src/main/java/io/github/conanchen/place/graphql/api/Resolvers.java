package io.github.conanchen.place.graphql.api;

import java.util.*;
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
    public interface Store {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(StoreGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(StoreGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Childcare {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(ChildcareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(ChildcareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface Eldercare {
    // KK
        public Connection<EmployeeRoleGQO> employeesPage(EldercareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
        public Connection<MemberRoleGQO> membersPage(EldercareGQO parent,String after, Integer first, String before, Integer last, String personId, DataFetchingEnvironment env);
    }
    public interface DefaultPlace {
    // KK
    }
    public interface AdministrativeArea {
    // KK
    }
    public interface GeoCoordinates {
    // KK
    }
    public interface StoreCreatePayload {
    // KK
    }
    public interface StoreCreateError {
    // KK
    }
    public interface StoreUpdatePayload {
    // KK
    }
    public interface StoreUpdateError {
    // KK
    }
}