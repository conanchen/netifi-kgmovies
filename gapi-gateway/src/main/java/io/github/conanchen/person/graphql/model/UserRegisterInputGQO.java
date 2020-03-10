package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class UserRegisterInputGQO {

    @javax.validation.constraints.NotNull
    private String smscode;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String password;

    public UserRegisterInputGQO() {
    }

    public UserRegisterInputGQO(String smscode, String email, String password) {
        this.smscode = smscode;
        this.email = email;
        this.password = password;
    }

    public String getSmscode() {
        return smscode;
    }
    public void setSmscode(String smscode) {
        this.smscode = smscode;
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