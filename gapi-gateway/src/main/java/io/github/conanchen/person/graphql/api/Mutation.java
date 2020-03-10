package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface Mutation {

    UserSigninPayloadGQO userSignin(UserSigninInputGQO auth) throws Exception;

    UserSMSCodePayloadGQO userSMSCode(UserSMSCodeInputGQO auth) throws Exception;

    UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth) throws Exception;

}