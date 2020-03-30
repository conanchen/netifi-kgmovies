package io.github.conanchen.person.graphql.api;

import java.util.*;
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
    public interface Person {
    // KK
        public Connection<MemberRoleGQO> membersOfPage(PersonGQO parent,String after, Integer first, String before, Integer last, String orgId, DataFetchingEnvironment env);
    }
    public interface User {
    // KK
    }
    public interface UserSigninPayload {
    // KK
    }
    public interface UserSigninError {
    // KK
    }
    public interface UserRegisterPayload {
    // KK
    }
    public interface UserRegisterError {
    // KK
    }
    public interface UserSMSCodePayload {
    // KK
    }
    public interface UserSMSCodeError {
    // KK
    }
    public interface ContactPoint {
    // KK
    }
}