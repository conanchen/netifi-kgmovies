package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;

public class UserRegisterErrorGQO implements DisplayableErrorGQO {

    private UserRegisterErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public UserRegisterErrorGQO() {
    }

    public UserRegisterErrorGQO(UserRegisterErrorCodeGQO code, Collection<String> field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public UserRegisterErrorCodeGQO getCode() {
        return code;
    }
    public void setCode(UserRegisterErrorCodeGQO code) {
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