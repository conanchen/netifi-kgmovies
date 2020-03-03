package io.github.conanchen.taskproject.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.ConversationalThingGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class ProjectGQO implements ThingGQO, OrganizationGQO, ConversationalThingGQO, NodeGQO {

    private String name;
    private String alternateName;
    private String description;
    private Collection<OrganizationGQO> parentOrganization;
    private Collection<OrganizationGQO> subOrganizations;
    private Collection<OrganizationGQO> departments;
    private Collection<EmployeeRoleGQO> employees;
    private EmployeeRoleConnectionGQO employeesPage;
    private Collection<PersonGQO> followers;
    private Collection<MemberRoleGQO> members;
    private MemberRoleConnectionGQO membersPage;
    private Collection<ActionGQO> potentialActions;
    private Collection<OrgRoleNameGQO> hasOrgRoleName;
    private Collection<ConversationGQO> availableConversations;
    private ConversationGQO defaultConversation;
    private Collection<TaskGQO> hasPart;
    private PartyGQO sponsor;
    private PersonGQO manager;
    @javax.validation.constraints.NotNull
    private String id;

    public ProjectGQO() {
    }

    public ProjectGQO(String name, String alternateName, String description, Collection<OrganizationGQO> parentOrganization, Collection<OrganizationGQO> subOrganizations, Collection<OrganizationGQO> departments, Collection<EmployeeRoleGQO> employees, EmployeeRoleConnectionGQO employeesPage, Collection<PersonGQO> followers, Collection<MemberRoleGQO> members, MemberRoleConnectionGQO membersPage, Collection<ActionGQO> potentialActions, Collection<OrgRoleNameGQO> hasOrgRoleName, Collection<ConversationGQO> availableConversations, ConversationGQO defaultConversation, Collection<TaskGQO> hasPart, PartyGQO sponsor, PersonGQO manager, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.employeesPage = employeesPage;
        this.followers = followers;
        this.members = members;
        this.membersPage = membersPage;
        this.potentialActions = potentialActions;
        this.hasOrgRoleName = hasOrgRoleName;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
        this.hasPart = hasPart;
        this.sponsor = sponsor;
        this.manager = manager;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<OrganizationGQO> getParentOrganization() {
        return parentOrganization;
    }
    public void setParentOrganization(Collection<OrganizationGQO> parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public Collection<OrganizationGQO> getSubOrganizations() {
        return subOrganizations;
    }
    public void setSubOrganizations(Collection<OrganizationGQO> subOrganizations) {
        this.subOrganizations = subOrganizations;
    }

    public Collection<OrganizationGQO> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<OrganizationGQO> departments) {
        this.departments = departments;
    }

    public Collection<EmployeeRoleGQO> getEmployees() {
        return employees;
    }

    @Override
    public EmployeeRoleConnectionGQO employeesPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
        return null;
    }

    public void setEmployees(Collection<EmployeeRoleGQO> employees) {
        this.employees = employees;
    }

    public EmployeeRoleConnectionGQO getEmployeesPage() {
        return employeesPage;
    }

    public void setEmployeesPage(EmployeeRoleConnectionGQO employeesPage) {
        this.employeesPage = employeesPage;
    }

    public Collection<PersonGQO> getFollowers() {
        return followers;
    }

    public void setFollowers(Collection<PersonGQO> followers) {
        this.followers = followers;
    }

    public Collection<MemberRoleGQO> getMembers() {
        return members;
    }

    public void setMembers(Collection<MemberRoleGQO> members) {
        this.members = members;
    }

    public MemberRoleConnectionGQO getMembersPage() {
        return membersPage;
    }

    public void setMembersPage(MemberRoleConnectionGQO membersPage) {
        this.membersPage = membersPage;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }

    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public Collection<OrgRoleNameGQO> getHasOrgRoleName() {
        return hasOrgRoleName;
    }

    public void setHasOrgRoleName(Collection<OrgRoleNameGQO> hasOrgRoleName) {
        this.hasOrgRoleName = hasOrgRoleName;
    }

    public Collection<ConversationGQO> getAvailableConversations() {
        return availableConversations;
    }

    public void setAvailableConversations(Collection<ConversationGQO> availableConversations) {
        this.availableConversations = availableConversations;
    }

    public ConversationGQO getDefaultConversation() {
        return defaultConversation;
    }
    public void setDefaultConversation(ConversationGQO defaultConversation) {
        this.defaultConversation = defaultConversation;
    }

    public Collection<TaskGQO> getHasPart() {
        return hasPart;
    }
    public void setHasPart(Collection<TaskGQO> hasPart) {
        this.hasPart = hasPart;
    }

    public PartyGQO getSponsor() {
        return sponsor;
    }
    public void setSponsor(PartyGQO sponsor) {
        this.sponsor = sponsor;
    }

    public PersonGQO getManager() {
        return manager;
    }
    public void setManager(PersonGQO manager) {
        this.manager = manager;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public MemberRoleConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}