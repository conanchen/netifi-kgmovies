package io.github.conanchen.person.graphql.model;

import io.github.conanchen.zommon.graphql.model.DisplayableErrorGQO;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
@Data
@Builder
public class UserSMSCodeErrorGQO implements DisplayableErrorGQO{


    private UserSMSCodeErrorCodeGQO code;
    @javax.validation.constraints.NotNull
    private Collection<String> field;
    @javax.validation.constraints.NotNull
    private String message;

    public UserSMSCodeErrorGQO() {
    }

    public UserSMSCodeErrorGQO( UserSMSCodeErrorCodeGQO code,  Collection<String> field,  String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

}