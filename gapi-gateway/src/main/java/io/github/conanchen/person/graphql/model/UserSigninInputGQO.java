package io.github.conanchen.person.graphql.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserSigninInputGQO {

    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String password;

    public UserSigninInputGQO() {
    }

    public UserSigninInputGQO( String email,  String password) {
        this.email = email;
        this.password = password;
    }

}