package io.github.conanchen.personorg.graphql.model;

import java.util.Collection;
import io.github.conanchen.action.graphql.model.ActionGQO;
import io.github.conanchen.message.graphql.model.ConversationGQO;

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