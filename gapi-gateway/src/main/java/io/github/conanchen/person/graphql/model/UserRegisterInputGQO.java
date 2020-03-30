package io.github.conanchen.person.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.person.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class UserRegisterInputGQO {

    @lombok.NonNull
    private String smscode;
    @lombok.NonNull
    private String email;
    @lombok.NonNull
    private String password;

    public UserRegisterInputGQO() {
    }

    public UserRegisterInputGQO( String smscode,  String email,  String password) {
        this.smscode = smscode;
        this.email = email;
        this.password = password;
    }

}