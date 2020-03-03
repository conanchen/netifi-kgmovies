package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;

public class UserSigninErrorGQO implements DisplayableErrorGQO {

    private UserSigninErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public UserSigninErrorGQO() {
    }

    public UserSigninErrorGQO(UserSigninErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public UserSigninErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(UserSigninErrorCodeGQO code) {
        this.code = code;
    }

    public Collection<String> getField() {
        return field;
    }
    public void setField(Collection<String> field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}