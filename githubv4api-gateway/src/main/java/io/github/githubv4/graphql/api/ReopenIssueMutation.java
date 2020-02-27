package io.github.githubv4.graphql.api;

import java.util.*;
import io.github.githubv4.graphql.model.*;

public interface ReopenIssueMutation {

    ReopenIssuePayloadGQO reopenIssue(ReopenIssueInputGQO input) throws Exception;

}