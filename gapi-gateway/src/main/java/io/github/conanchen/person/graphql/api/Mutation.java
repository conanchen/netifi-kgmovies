package io.github.conanchen.person.graphql.api;

import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.person.graphql.model.*;

public interface Mutation {
// KK
    UserSigninPayloadGQO userSignin(UserSigninInputGQO auth, DataFetchingEnvironment env) throws Exception;
    UserSMSCodePayloadGQO userSMSCode(UserSMSCodeInputGQO auth, DataFetchingEnvironment env) throws Exception;
    UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth, DataFetchingEnvironment env) throws Exception;
}