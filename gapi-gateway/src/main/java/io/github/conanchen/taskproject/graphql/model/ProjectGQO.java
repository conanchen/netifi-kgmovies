package io.github.conanchen.taskproject.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;
import io.github.conanchen.personorg.graphql.model.MembershipConnectionGQO;
import io.github.conanchen.personorg.graphql.model.MembershipGQO;
import io.github.conanchen.personorg.graphql.model.OrganizationGQO;
import io.github.conanchen.personorg.graphql.model.PartyGQO;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class ProjectGQO implements ThingGQO, OrganizationGQO, NodeGQO{

    private String name;
    private String alternateName;
    private String description;
    private Collection<OrganizationGQO> parentOrganization;
    private Collection<OrganizationGQO> subOrganizations;
    private Collection<OrganizationGQO> departments;
    private Collection<PersonGQO> employees;
    private Collection<PersonGQO> followees;
    private Collection<ConversationGQO> availableConversations;
    private ConversationGQO defaultConversation;
    private Collection<ActionGQO> potentialActions;
    private Collection<MembershipGQO> members;
    private MembershipConnectionGQO membersPage;
    private Collection<TaskGQO> hasPart;
    private PartyGQO sponsor;
    private PersonGQO manager;
    @javax.validation.constraints.NotNull
    private String id;

    public ProjectGQO() {
    }

    public ProjectGQO(final String name, final String alternateName, final String description, final Collection<OrganizationGQO> parentOrganization, final Collection<OrganizationGQO> subOrganizations, final Collection<OrganizationGQO> departments, final Collection<PersonGQO> employees, final Collection<PersonGQO> followees, final Collection<ConversationGQO> availableConversations, final ConversationGQO defaultConversation, final Collection<ActionGQO> potentialActions, final Collection<MembershipGQO> members, final MembershipConnectionGQO membersPage, final Collection<TaskGQO> hasPart, final PartyGQO sponsor, final PersonGQO manager, final String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.followees = followees;
        this.availableConversations = availableConversations;
        this.defaultConversation = defaultConversation;
        this.potentialActions = potentialActions;
        this.members = members;
        this.membersPage = membersPage;
        this.hasPart = hasPart;
        this.sponsor = sponsor;
        this.manager = manager;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(final String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }

    public Collection<OrganizationGQO> getParentOrganization() {
        return parentOrganization;
    }
    public void setParentOrganization(final Collection<OrganizationGQO> parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public Collection<OrganizationGQO> getSubOrganizations() {
        return subOrganizations;
    }
    public void setSubOrganizations(final Collection<OrganizationGQO> subOrganizations) {
        this.subOrganizations = subOrganizations;
    }

    public Collection<OrganizationGQO> getDepartments() {
        return departments;
    }
    public void setDepartments(final Collection<OrganizationGQO> departments) {
        this.departments = departments;
    }

    public Collection<PersonGQO> getEmployees() {
        return employees;
    }
    public void setEmployees(final Collection<PersonGQO> employees) {
        this.employees = employees;
    }

    public Collection<PersonGQO> getFollowees() {
        return followees;
    }
    public void setFollowees(final Collection<PersonGQO> followees) {
        this.followees = followees;
    }

    public Collection<ConversationGQO> getAvailableConversations() {
        return availableConversations;
    }
    public void setAvailableConversations(final Collection<ConversationGQO> availableConversations) {
        this.availableConversations = availableConversations;
    }

    public ConversationGQO getDefaultConversation() {
        return defaultConversation;
    }
    public void setDefaultConversation(final ConversationGQO defaultConversation) {
        this.defaultConversation = defaultConversation;
    }

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(final Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public Collection<MembershipGQO> getMembers() {
        return members;
    }
    public void setMembers(final Collection<MembershipGQO> members) {
        this.members = members;
    }

    public MembershipConnectionGQO getMembersPage() {
        return membersPage;
    }
    public void setMembersPage(final MembershipConnectionGQO membersPage) {
        this.membersPage = membersPage;
    }

    public Collection<TaskGQO> getHasPart() {
        return hasPart;
    }
    public void setHasPart(final Collection<TaskGQO> hasPart) {
        this.hasPart = hasPart;
    }

    public PartyGQO getSponsor() {
        return sponsor;
    }
    public void setSponsor(final PartyGQO sponsor) {
        this.sponsor = sponsor;
    }

    public PersonGQO getManager() {
        return manager;
    }
    public void setManager(final PersonGQO manager) {
        this.manager = manager;
    }

    public String getId() {
        return id;
    }
    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public MembershipConnectionGQO membersPage(String after, Integer first, Integer before,
        String last, String personId) throws Exception {
      // TODO Auto-generated method stub
      return null;
    }

}