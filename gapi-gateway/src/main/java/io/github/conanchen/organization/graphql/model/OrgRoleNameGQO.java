package io.github.conanchen.organization.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.organization.graphql.api.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class OrgRoleNameGQO implements NodeGQO{


    private OrganizationGQO isRoleNameOf;

    private String group;

    private String name;

    private String alternativeHeadline;

    private String description;

    private java.util.Date createdAt;

    private PersonGQO creator;
    @lombok.NonNull
    private String id;

    public OrgRoleNameGQO() {
    }

    public OrgRoleNameGQO( OrganizationGQO isRoleNameOf,  String group,  String name,  String alternativeHeadline,  String description,  java.util.Date createdAt,  PersonGQO creator,  String id) {
        this.isRoleNameOf = isRoleNameOf;
        this.group = group;
        this.name = name;
        this.alternativeHeadline = alternativeHeadline;
        this.description = description;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

}