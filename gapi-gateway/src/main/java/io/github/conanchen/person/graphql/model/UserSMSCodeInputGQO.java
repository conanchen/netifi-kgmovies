package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

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