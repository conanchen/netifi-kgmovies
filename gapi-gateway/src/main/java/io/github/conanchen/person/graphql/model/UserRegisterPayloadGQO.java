package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserRegisterPayloadGQO {


    private UserSigninPayloadGQO signinPayload;
    @javax.validation.constraints.NotNull
    private Collection<UserRegisterErrorGQO> registerErrors;

    public UserRegisterPayloadGQO() {
    }

    public UserRegisterPayloadGQO( UserSigninPayloadGQO signinPayload,  Collection<UserRegisterErrorGQO> registerErrors) {
        this.signinPayload = signinPayload;
        this.registerErrors = registerErrors;
    }

}