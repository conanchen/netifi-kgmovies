package io.github.conanchen.taskproject.graphql.api;

import java.util.*;
import io.github.conanchen.person.graphql.model.*;
import io.github.conanchen.organization.graphql.model.*;
import io.github.conanchen.acl.graphql.model.*;
import io.github.conanchen.shoppingfulfill.graphql.model.*;
import io.github.conanchen.taskproject.graphql.model.*;
import io.github.conanchen.place.graphql.model.*;
import io.github.conanchen.action.graphql.model.*;
import io.github.conanchen.shoppingcart.graphql.model.*;
import io.github.conanchen.zommon.graphql.model.*;
import io.github.conanchen.shoppingdoor.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import graphql.relay.Connection;

public interface Query {
// KK
    ProjectGQO project(String id, String projectID, DataFetchingEnvironment env) throws Exception;
    TaskGQO task(String id, String taskID, DataFetchingEnvironment env) throws Exception;
    IssueGQO issue(String id, String issueID, DataFetchingEnvironment env) throws Exception;
    PersonActivityTimelineGQO psaTimeline(String id, String patlID, DataFetchingEnvironment env) throws Exception;
}