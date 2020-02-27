package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface SecurityVulnerabilitiesQuery {

    @javax.validation.constraints.NotNull
    SecurityVulnerabilityConnectionGQO securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystemGQO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderGQO orderBy, String Package, Collection<SecurityAdvisorySeverityGQO> severities) throws Exception;

}