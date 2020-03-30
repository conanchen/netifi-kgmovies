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
public class EmployeeRoleGQO implements NodeGQO{


    private PersonGQO person;

    private String number;

    private OrgRoleNameGQO roleName;

    private OrganizationGQO hostingOrganization;

    private java.util.Date startDate;

    private java.util.Date endDate;
    @lombok.NonNull
    private String id;

    public EmployeeRoleGQO() {
    }

    public EmployeeRoleGQO( PersonGQO person,  String number,  OrgRoleNameGQO roleName,  OrganizationGQO hostingOrganization,  java.util.Date startDate,  java.util.Date endDate,  String id) {
        this.person = person;
        this.number = number;
        this.roleName = roleName;
        this.hostingOrganization = hostingOrganization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
    }

}