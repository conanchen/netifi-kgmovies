package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.UserRegisterInputGQO;
import io.github.conanchen.person.graphql.model.UserRegisterPayloadGQO;

public interface UserRegisterMutation {

    UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth) throws Exception;

}