package io.github.conanchen.person.graphql.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserRegisterInputGQO {

    @javax.validation.constraints.NotNull
    private String smscode;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String password;

    public UserRegisterInputGQO() {
    }

    public UserRegisterInputGQO( String smscode,  String email,  String password) {
        this.smscode = smscode;
        this.email = email;
        this.password = password;
    }

}