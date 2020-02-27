package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface EnterpriseAdministratorInvitationQuery {

    EnterpriseAdministratorInvitationGQO enterpriseAdministratorInvitation(String enterpriseSlug, EnterpriseAdministratorRoleGQO role, String userLogin) throws Exception;

}