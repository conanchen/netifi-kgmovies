package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface CloseIssueMutation {

    CloseIssuePayloadGQO closeIssue(CloseIssueInputGQO input) throws Exception;

}