package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface MergePullRequestMutation {

    MergePullRequestPayloadGQO mergePullRequest(MergePullRequestInputGQO input) throws Exception;

}