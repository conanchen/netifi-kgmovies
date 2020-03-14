package io.github.conanchen.taskproject.graphql.api;

import io.github.conanchen.taskproject.graphql.model.IssueGQO;
import io.github.conanchen.taskproject.graphql.model.PersonActivityTimelineGQO;
import io.github.conanchen.taskproject.graphql.model.ProjectGQO;
import io.github.conanchen.taskproject.graphql.model.TaskGQO;

public interface Query {

    ProjectGQO project(String id, String projectID) throws Exception;

    TaskGQO task(String id, String taskID) throws Exception;

    IssueGQO issue(String id, String issueID) throws Exception;

    PersonActivityTimelineGQO psaTimeline(String id, String patlID) throws Exception;

}