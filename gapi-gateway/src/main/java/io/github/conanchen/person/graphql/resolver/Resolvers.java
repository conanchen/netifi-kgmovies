package io.github.conanchen.person.graphql.resolver;

import java.util.*;

import io.github.conanchen.organization.graphql.model.MemberRoleConnectionGQO;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public class Resolvers{
    public interface Person {
    // KK
        MemberRoleConnectionGQO membersOfPage(PersonGQO parent, String after, Integer first, String before, Integer last, String orgId, DataFetchingEnvironment env) throws Exception;
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