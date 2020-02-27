package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface ViewerQuery {

    @javax.validation.constraints.NotNull
    UserGQO viewer() throws Exception;

}