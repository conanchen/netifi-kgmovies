package io.github.conanchen.person.graphql.api;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Mutation {
// KK
    UserSigninPayloadGQO userSignin(UserSigninInputGQO auth, DataFetchingEnvironment env) throws Exception;
    UserSMSCodePayloadGQO userSMSCode(UserSMSCodeInputGQO auth, DataFetchingEnvironment env) throws Exception;
    UserRegisterPayloadGQO userRegister(UserRegisterInputGQO auth, DataFetchingEnvironment env) throws Exception;
}