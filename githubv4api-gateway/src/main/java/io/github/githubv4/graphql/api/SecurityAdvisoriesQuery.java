package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface SecurityAdvisoriesQuery {

    @javax.validation.constraints.NotNull
    SecurityAdvisoryConnectionGQO securityAdvisories(String after, String before, Integer first, SecurityAdvisoryIdentifierFilterGQO identifier, Integer last, SecurityAdvisoryOrderGQO orderBy, java.util.Date publishedSince, java.util.Date updatedSince) throws Exception;

}