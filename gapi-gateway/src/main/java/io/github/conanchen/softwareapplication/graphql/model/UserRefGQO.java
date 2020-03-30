package io.github.conanchen.softwareapplication.graphql.model;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.softwareapplication.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class UserRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private String username;

    private String password;

    private String bio;

    private PersonRefGQO isUserOf;

    public UserRefGQO() {
    }

    public UserRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  String username,  String password,  String bio,  PersonRefGQO isUserOf) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.isUserOf = isUserOf;
    }

}