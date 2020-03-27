package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.UserSigninInputGQO;
import io.github.conanchen.person.graphql.model.UserSigninPayloadGQO;

public interface UserSigninMutation {

    UserSigninPayloadGQO userSignin(UserSigninInputGQO auth) throws Exception;

}