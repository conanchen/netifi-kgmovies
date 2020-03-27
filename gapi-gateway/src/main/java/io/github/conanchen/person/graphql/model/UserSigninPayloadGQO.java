package io.github.conanchen.person.graphql.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class UserSigninPayloadGQO {


    private String token;

    private UserGQO user;
    @javax.validation.constraints.NotNull
    private Collection<UserSigninErrorGQO> signinErrors;

    public UserSigninPayloadGQO() {
    }

    public UserSigninPayloadGQO( String token,  UserGQO user,  Collection<UserSigninErrorGQO> signinErrors) {
        this.token = token;
        this.user = user;
        this.signinErrors = signinErrors;
    }

}