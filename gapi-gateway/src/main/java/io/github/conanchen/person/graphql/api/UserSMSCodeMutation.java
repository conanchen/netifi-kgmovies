package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface UserSMSCodeMutation {

    UserSMSCodePayloadGQO userSMSCode(AuthDataGQO auth) throws Exception;

}