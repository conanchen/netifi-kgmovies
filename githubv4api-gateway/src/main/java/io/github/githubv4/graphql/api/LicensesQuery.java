package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface LicensesQuery {

    @javax.validation.constraints.NotNull
    Collection<LicenseGQO> licenses() throws Exception;

}