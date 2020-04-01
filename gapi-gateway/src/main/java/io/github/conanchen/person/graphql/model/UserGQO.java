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
public class UserGQO implements NodeGQO{

    @lombok.NonNull
    private String username;

    private String name;

    private String bio;
    @lombok.NonNull
    private java.lang.String bioHTML;
    @lombok.NonNull
    private PersonGQO isUserOf;
    @lombok.NonNull
    private String id;

    public UserGQO() {
    }

    public UserGQO( String username,  String name,  String bio,  java.lang.String bioHTML,  PersonGQO isUserOf,  String id) {
        this.username = username;
        this.name = name;
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.isUserOf = isUserOf;
        this.id = id;
    }

}