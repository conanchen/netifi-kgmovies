package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface UserRegisterMutation {

    UserRegisterPayloadGQO userRegister(AuthWithSMSCodeDataGQO auth) throws Exception;

}