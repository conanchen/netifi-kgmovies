package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;

public interface UserSigninMutation {

    UserSigninPayloadGQO userSignin(UserSigninInputGQO auth) throws Exception;

}