package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class UserSMSCodePayloadGQO {

    private String token;
    private UserGQO user;
    @javax.validation.constraints.NotNull
    private Collection<UserSMSCodeErrorGQO> smsCodeErrors;

    public UserSMSCodePayloadGQO() {
    }

    public UserSMSCodePayloadGQO(String token, UserGQO user, Collection<UserSMSCodeErrorGQO> smsCodeErrors) {
        this.token = token;
        this.user = user;
        this.smsCodeErrors = smsCodeErrors;
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

    public Collection<UserSMSCodeErrorGQO> getSmsCodeErrors() {
        return smsCodeErrors;
    }
    public void setSmsCodeErrors(Collection<UserSMSCodeErrorGQO> smsCodeErrors) {
        this.smsCodeErrors = smsCodeErrors;
    }

}