package io.github.conanchen.place.graphql.model;

import java.util.*;
import io.github.conanchen.place.graphql.api.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class StoreGQO implements ThingGQO, OrganizationGQO, LocalBusinessGQO, NodeGQO{


    private String openingHours;

    private String paymentAccepted;

    private String priceRange;

    private String name;

    private String alternateName;

    private String description;

    private java.util.Date dateCreated;

    private java.util.Date dateModified;

    private Collection<OrganizationGQO> parentOrganization;

    private Collection<OrganizationGQO> subOrganizations;

    private Collection<OrganizationGQO> departments;

    private Collection<EmployeeRoleGQO> employees;

    private Collection<PersonGQO> followers;

    private Collection<MemberRoleGQO> members;

    private Collection<ActionGQO> potentialActions;

    private Collection<OrgRoleNameGQO> hasOrgRoleName;

    private Integer followernum;
    @lombok.NonNull
    private String id;

    public StoreGQO() {
    }

    public StoreGQO( String openingHours,  String paymentAccepted,  String priceRange,  String name,  String alternateName,  String description,  java.util.Date dateCreated,  java.util.Date dateModified,  Collection<OrganizationGQO> parentOrganization,  Collection<OrganizationGQO> subOrganizations,  Collection<OrganizationGQO> departments,  Collection<EmployeeRoleGQO> employees,  Collection<PersonGQO> followers,  Collection<MemberRoleGQO> members,  Collection<ActionGQO> potentialActions,  Collection<OrgRoleNameGQO> hasOrgRoleName,  Integer followernum,  String id) {
        this.openingHours = openingHours;
        this.paymentAccepted = paymentAccepted;
        this.priceRange = priceRange;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followers = followers;
        this.members = members;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.followernum = followernum;
        this.id = id;
    }

}