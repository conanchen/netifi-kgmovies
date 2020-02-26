package io.github.conanchen.organization.graphql.model;

import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.person.graphql.model.PersonGQO;

import java.util.Collection;

public interface OrganizationGQO {

    Collection<OrganizationGQO> getParentOrganization();

    Collection<OrganizationGQO> getSubOrganizations();

    Collection<OrganizationGQO> getDepartments();

    Collection<PersonGQO> getEmployees();

    Collection<PersonGQO> getFollowees();

    Collection<ActionGQO> getPotentialActions();

    Collection<MembershipGQO> getMembers();

    MembershipConnectionGQO getMembersPage();

     MembershipConnectionGQO membersPage(String after, Integer first, Integer before, String last, String personId) throws Exception ;
}