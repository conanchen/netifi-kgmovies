package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;

public class UserSMSCodeInputGQO {

    @javax.validation.constraints.NotNull
    private String email;

    public UserSMSCodeInputGQO() {
    }

    public UserSMSCodeInputGQO(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}