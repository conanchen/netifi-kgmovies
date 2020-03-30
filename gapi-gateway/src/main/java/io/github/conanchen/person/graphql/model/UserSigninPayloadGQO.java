package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class UserSigninPayloadGQO {


    private String token;

    private UserGQO user;
    @lombok.NonNull
    private Collection<UserSigninErrorGQO> signinErrors;

    public UserSigninPayloadGQO() {
    }

    public UserSigninPayloadGQO( String token,  UserGQO user,  Collection<UserSigninErrorGQO> signinErrors) {
        this.token = token;
        this.user = user;
        this.signinErrors = signinErrors;
    }

}