package io.github.conanchen.personorg.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;
import io.github.conanchen.zommon.graphql.model.ThingGQO;

public class DefaultOrganizationGQO implements ThingGQO, OrganizationGQO, PartyGQO, NodeGQO{

    @javax.validation.constraints.NotNull
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
    @javax.validation.constraints.NotNull
    private String id;

    public DefaultOrganizationGQO() {
    }

    public DefaultOrganizationGQO(String name, String alternateName, String description, Collection<OrganizationGQO> parentOrganization, Collection<OrganizationGQO> subOrganizations, Collection<OrganizationGQO> departments, Collection<PersonGQO> employees, Collection<PersonGQO> followees, Collection<ConversationGQO> availableConversations, ConversationGQO defaultConversation, Collection<ActionGQO> potentialActions, Collection<MembershipGQO> members, MembershipConnectionGQO membersPage, String id) {
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

    public Collection<PersonGQO> getEmployees() {
        return employees;
    }
    public void setEmployees(Collection<PersonGQO> employees) {
        this.employees = employees;
    }

    public Collection<PersonGQO> getFollowees() {
        return followees;
    }
    public void setFollowees(Collection<PersonGQO> followees) {
        this.followees = followees;
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

    public Collection<ActionGQO> getPotentialActions() {
        return potentialActions;
    }
    public void setPotentialActions(Collection<ActionGQO> potentialActions) {
        this.potentialActions = potentialActions;
    }

    public Collection<MembershipGQO> getMembers() {
        return members;
    }
    public void setMembers(Collection<MembershipGQO> members) {
        this.members = members;
    }

    public MembershipConnectionGQO getMembersPage() {
        return membersPage;
    }
    public void setMembersPage(MembershipConnectionGQO membersPage) {
        this.membersPage = membersPage;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public MembershipConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}