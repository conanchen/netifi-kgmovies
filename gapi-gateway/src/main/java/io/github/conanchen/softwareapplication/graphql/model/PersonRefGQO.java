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
public class PersonRefGQO {


    private String id;

    private String identifier;

    private String name;

    private String alternateName;

    private String description;

    private Collection<OwnershipRefGQO> owns;

    private String personalID;

    private String familyName;

    private String givenName;

    private UserRefGQO hasUser;

    public PersonRefGQO() {
    }

    public PersonRefGQO( String id,  String identifier,  String name,  String alternateName,  String description,  Collection<OwnershipRefGQO> owns,  String personalID,  String familyName,  String givenName,  UserRefGQO hasUser) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.owns = owns;
        this.personalID = personalID;
        this.familyName = familyName;
        this.givenName = givenName;
        this.hasUser = hasUser;
    }

}