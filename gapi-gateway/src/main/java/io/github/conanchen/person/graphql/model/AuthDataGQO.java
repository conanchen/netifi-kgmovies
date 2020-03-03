package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class AuthDataGQO {

    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String password;

    public AuthDataGQO() {
    }

    public AuthDataGQO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}