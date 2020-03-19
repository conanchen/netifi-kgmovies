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
public class UserGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String username;

    private String name;

    private String bio;
    @javax.validation.constraints.NotNull
    private java.lang.String bioHTML;
    @javax.validation.constraints.NotNull
    private PersonGQO isUserOf;
    @javax.validation.constraints.NotNull
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