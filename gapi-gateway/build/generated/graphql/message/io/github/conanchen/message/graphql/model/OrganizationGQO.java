package io.github.conanchen.message.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class OrganizationGQO implements NodeGQO{

    @javax.validation.constraints.NotNull
    private String name;
    private String alternateName;
    private String description;
    private Collection<OrganizationGQO> parentOrganization;
    private Collection<OrganizationGQO> subOrganizations;
    private Collection<OrganizationGQO> departments;
    private Collection<PersonGQO> employees;
    private Collection<PersonGQO> members;
    private Collection<PersonGQO> followees;
    private Collection<CreateActionGQO> potentialActions0;
    private Collection<UpdateActionGQO> potentialActions1;
    private ConversationGQO defaultConversation;
    @javax.validation.constraints.NotNull
    private String id;

    public OrganizationGQO() {
    }

    public OrganizationGQO(String name, String alternateName, String description, Collection<OrganizationGQO> parentOrganization, Collection<OrganizationGQO> subOrganizations, Collection<OrganizationGQO> departments, Collection<PersonGQO> employees, Collection<PersonGQO> members, Collection<PersonGQO> followees, Collection<CreateActionGQO> potentialActions0, Collection<UpdateActionGQO> potentialActions1, ConversationGQO defaultConversation, String id) {
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.parentOrganization = parentOrganization;
        this.subOrganizations = subOrganizations;
        this.departments = departments;
        this.employees = employees;
        this.members = members;
        this.followees = followees;
        this.potentialActions0 = potentialActions0;
        this.potentialActions1 = potentialActions1;
        this.defaultConversation = defaultConversation;
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

    public Collection<PersonGQO> getMembers() {
        return members;
    }
    public void setMembers(Collection<PersonGQO> members) {
        this.members = members;
    }

    public Collection<PersonGQO> getFollowees() {
        return followees;
    }
    public void setFollowees(Collection<PersonGQO> followees) {
        this.followees = followees;
    }

    public Collection<CreateActionGQO> getPotentialActions0() {
        return potentialActions0;
    }
    public void setPotentialActions0(Collection<CreateActionGQO> potentialActions0) {
        this.potentialActions0 = potentialActions0;
    }

    public Collection<UpdateActionGQO> getPotentialActions1() {
        return potentialActions1;
    }
    public void setPotentialActions1(Collection<UpdateActionGQO> potentialActions1) {
        this.potentialActions1 = potentialActions1;
    }

    public ConversationGQO getDefaultConversation() {
        return defaultConversation;
    }
    public void setDefaultConversation(ConversationGQO defaultConversation) {
        this.defaultConversation = defaultConversation;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}