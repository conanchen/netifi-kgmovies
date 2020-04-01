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
public class MemberRoleGQO implements NodeGQO{


    private PersonGQO member;

    private OrgRoleNameGQO roleName;

    private OrganizationGQO hostingOrganization;

    private String membershipNumber;

    private java.util.Date startDate;

    private java.util.Date endDate;

    private java.util.Date createdAt;

    private PersonGQO creator;
    @lombok.NonNull
    private String id;

    public MemberRoleGQO() {
    }

    public MemberRoleGQO( PersonGQO member,  OrgRoleNameGQO roleName,  OrganizationGQO hostingOrganization,  String membershipNumber,  java.util.Date startDate,  java.util.Date endDate,  java.util.Date createdAt,  PersonGQO creator,  String id) {
        this.member = member;
        this.roleName = roleName;
        this.hostingOrganization = hostingOrganization;
        this.membershipNumber = membershipNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.creator = creator;
        this.id = id;
    }

}