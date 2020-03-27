package io.github.conanchen.person.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;
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