package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface RateLimitQuery {

    RateLimitGQO rateLimit(Boolean dryRun) throws Exception;

}