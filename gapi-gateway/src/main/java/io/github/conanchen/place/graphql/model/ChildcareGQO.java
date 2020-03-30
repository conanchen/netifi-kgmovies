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
public class ChildcareGQO implements OrganizationGQO, LocalBusinessGQO, NodeGQO{


    private String openingHours;

    private String paymentAccepted;

    private String priceRange;

    private Collection<OrganizationGQO> parentOrganization;

    private Collection<OrganizationGQO> subOrganizations;

    private Collection<OrganizationGQO> departments;

    private Collection<EmployeeRoleGQO> employees;

    private Collection<PersonGQO> followers;

    private Collection<MemberRoleGQO> members;

    private Collection<ActionGQO> potentialActions;

    private Collection<OrgRoleNameGQO> hasOrgRoleName;
    @lombok.NonNull
    private String id;

    public ChildcareGQO() {
    }

    public ChildcareGQO( String openingHours,  String paymentAccepted,  String priceRange,  Collection<OrganizationGQO> parentOrganization,  Collection<OrganizationGQO> subOrganizations,  Collection<OrganizationGQO> departments,  Collection<EmployeeRoleGQO> employees,  Collection<PersonGQO> followers,  Collection<MemberRoleGQO> members,  Collection<ActionGQO> potentialActions,  Collection<OrgRoleNameGQO> hasOrgRoleName,  String id) {
        this.openingHours = openingHours;
        this.paymentAccepted = paymentAccepted;
        this.priceRange = priceRange;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followers = followers;
        this.members = members;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.id = id;
    }

}