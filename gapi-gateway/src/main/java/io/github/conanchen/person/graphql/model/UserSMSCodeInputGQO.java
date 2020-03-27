package io.github.conanchen.person.graphql.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserSMSCodeInputGQO {

    @javax.validation.constraints.NotNull
    private String email;

    public UserSMSCodeInputGQO() {
    }

    public UserSMSCodeInputGQO( String email) {
        this.email = email;
    }

}