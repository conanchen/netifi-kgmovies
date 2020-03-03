package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.ConversationalThingGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

import java.util.Collection;

public class GeneralOrganizationGQO implements ThingGQO, OrganizationGQO, ConversationalThingGQO, PartyGQO, NodeGQO {

    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    private Collection<OwnershipGQO> owns;
    private Collection<ConversationGQO> availableConversations;
    private ConversationGQO defaultConversation;
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
    @javax.validation.constraints.NotNull
    private String id;

    public GeneralOrganizationGQO() {
    }

    public GeneralOrganizationGQO(String name, String alternateName, String description, Collection<OwnershipGQO> owns, Collection<ConversationGQO> availableConversations, ConversationGQO defaultConversation, Collection<OrganizationGQO> parentOrganization, Collection<OrganizationGQO> subOrganizations, Collection<OrganizationGQO> departments, Collection<EmployeeRoleGQO> employees, EmployeeRoleConnectionGQO employeesPage, Collection<PersonGQO> followers, Collection<MemberRoleGQO> members, MemberRoleConnectionGQO membersPage, Collection<ActionGQO> potentialActions, Collection<OrgRoleNameGQO> hasOrgRoleName, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.owns = owns;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
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

    public Collection<OwnershipGQO> getOwns() {
        return owns;
    }

    public void setOwns(Collection<OwnershipGQO> owns) {
        this.owns = owns;
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

    @Override
    public MemberRoleConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
        return null;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}