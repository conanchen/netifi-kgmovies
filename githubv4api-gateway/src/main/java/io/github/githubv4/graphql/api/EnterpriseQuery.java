package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface EnterpriseQuery {

    EnterpriseGQO enterprise(String invitationToken, String slug) throws Exception;

}