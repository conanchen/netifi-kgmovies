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
public class PersonGQO implements PartyGQO, NodeGQO{

    @javax.validation.constraints.NotNull
    private String personalID;
    @javax.validation.constraints.NotNull
    private String name;

    private String alternateName;

    private String description;

    private Collection<OwnershipGQO> owns;

    private String familyName;

    private String givenName;

    private java.util.Date birthDate;

    private PlaceGQO birthPlace;

    private String gender;

    private String email;

    private Collection<PersonGQO> follows;

    private Collection<PersonGQO> followees;

    private Collection<MemberRoleGQO> membersOf;

    private MemberRoleConnectionGQO membersOfPage;

    private UserGQO hasUser;

    private Collection<ContactPointGQO> hasContactPoint;
    @javax.validation.constraints.NotNull
    private String id;

    public PersonGQO() {
    }

    public PersonGQO( String personalID,  String name,  String alternateName,  String description,  Collection<OwnershipGQO> owns,  String familyName,  String givenName,  java.util.Date birthDate,  PlaceGQO birthPlace,  String gender,  String email,  Collection<PersonGQO> follows,  Collection<PersonGQO> followees,  Collection<MemberRoleGQO> membersOf,  MemberRoleConnectionGQO membersOfPage,  UserGQO hasUser,  Collection<ContactPointGQO> hasContactPoint,  String id) {
        this.personalID = personalID;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.owns = owns;
        this.familyName = familyName;
        this.givenName = givenName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.email = email;
        this.follows = follows;
        this.followees = followees;
        this.membersOf = membersOf;
        this.membersOfPage = membersOfPage;
        this.hasUser = hasUser;
        this.hasContactPoint = hasContactPoint;
        this.id = id;
    }

}