package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class UserRegisterPayloadGQO {

    private String token;
    private UserGQO user;
    @javax.validation.constraints.NotNull
    private Collection<UserRegisterErrorGQO> registerErrors;

    public UserRegisterPayloadGQO() {
    }

    public UserRegisterPayloadGQO(String token, UserGQO user, Collection<UserRegisterErrorGQO> registerErrors) {
        this.token = token;
        this.user = user;
        this.registerErrors = registerErrors;
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

    public Collection<UserRegisterErrorGQO> getRegisterErrors() {
        return registerErrors;
    }
    public void setRegisterErrors(Collection<UserRegisterErrorGQO> registerErrors) {
        this.registerErrors = registerErrors;
    }

}