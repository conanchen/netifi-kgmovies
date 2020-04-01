package io.github.conanchen.taskproject.graphql.model;

import java.util.*;
import io.github.conanchen.message.graphql.model.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.taskproject.graphql.api.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ProjectGQO implements ThingGQO, OrganizationGQO, ConversationalThingGQO, NodeGQO{


    private String name;

    private String alternateName;

    private String description;

    private Collection<OrganizationGQO> parentOrganization;

    private Collection<OrganizationGQO> subOrganizations;

    private Collection<OrganizationGQO> departments;

    private Collection<EmployeeRoleGQO> employees;

    private Collection<PersonGQO> followers;

    private Collection<MemberRoleGQO> members;

    private Collection<ActionGQO> potentialActions;

    private Collection<OrgRoleNameGQO> hasOrgRoleName;

    private Collection<ConversationGQO> availableConversations;

    private ConversationGQO defaultConversation;

    private Collection<TaskGQO> hasPart;

    private PartyGQO sponsor;

    private PersonGQO manager;
    @lombok.NonNull
    private String id;

    public ProjectGQO() {
    }

    public ProjectGQO( String name,  String alternateName,  String description,  Collection<OrganizationGQO> parentOrganization,  Collection<OrganizationGQO> subOrganizations,  Collection<OrganizationGQO> departments,  Collection<EmployeeRoleGQO> employees,  Collection<PersonGQO> followers,  Collection<MemberRoleGQO> members,  Collection<ActionGQO> potentialActions,  Collection<OrgRoleNameGQO> hasOrgRoleName,  Collection<ConversationGQO> availableConversations,  ConversationGQO defaultConversation,  Collection<TaskGQO> hasPart,  PartyGQO sponsor,  PersonGQO manager,  String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followers = followers;
        this.members = members;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
        this.hasPart = hasPart;
        this.sponsor = sponsor;
        this.manager = manager;
        this.id = id;
    }

}