package io.github.conanchen.person.graphql.api;

import io.github.conanchen.person.graphql.model.UserSMSCodeInputGQO;
import io.github.conanchen.person.graphql.model.UserSMSCodePayloadGQO;

public interface UserSMSCodeMutation {

    UserSMSCodePayloadGQO userSMSCode(UserSMSCodeInputGQO auth) throws Exception;

}