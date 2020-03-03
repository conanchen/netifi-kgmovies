package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface Mutation {

    UserSigninPayloadGQO userSignin(AuthDataGQO auth) throws Exception;

    UserSMSCodePayloadGQO userSMSCode(AuthDataGQO auth) throws Exception;

    UserRegisterPayloadGQO userRegister(AuthWithSMSCodeDataGQO auth) throws Exception;

}