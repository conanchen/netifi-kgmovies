package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class UserSigninPayloadGQO {

    private String token;
    private UserGQO user;
    @javax.validation.constraints.NotNull
    private Collection<UserSigninErrorGQO> signinErrors;

    public UserSigninPayloadGQO() {
    }

    public UserSigninPayloadGQO(String token, UserGQO user, Collection<UserSigninErrorGQO> signinErrors) {
        this.token = token;
        this.user = user;
        this.signinErrors = signinErrors;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public UserGQO getUser() {
        return user;
    }
    public void setUser(UserGQO user) {
        this.user = user;
    }

    public Collection<UserSigninErrorGQO> getSigninErrors() {
        return signinErrors;
    }
    public void setSigninErrors(Collection<UserSigninErrorGQO> signinErrors) {
        this.signinErrors = signinErrors;
    }

}