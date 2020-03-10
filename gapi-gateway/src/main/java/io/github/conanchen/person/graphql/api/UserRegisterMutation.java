package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface UserRegisterMutation {

    UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth) throws Exception;

}