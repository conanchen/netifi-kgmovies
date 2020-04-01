package io.github.conanchen.taskproject.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import io.github.conanchen.taskproject.graphql.api.Query;
import io.github.conanchen.taskproject.graphql.model.IssueGQO;
import io.github.conanchen.taskproject.graphql.model.PersonActivityTimelineGQO;
import io.github.conanchen.taskproject.graphql.model.ProjectGQO;
import io.github.conanchen.taskproject.graphql.model.TaskGQO;
import org.springframework.stereotype.Service;


@Service
public class TaskprojectQueriesResolver implements Query, GraphQLQueryResolver {

    @Override
    public ProjectGQO project(String id, String projectID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public TaskGQO task(String id, String taskID, DataFetchingEnvironment env) throws Exception {
        return null;
    }

    @Override
    public IssueGQO issue(String id, String issueID, DataFetchingEnvironment env) throws Exception {
        IssueGQO issueGQO = IssueGQO.builder()
                .id("issue1")
                .name("name1")
                .alternateName("alternamte")
                .build();

        return issueGQO;
    }

    @Override
    public PersonActivityTimelineGQO psaTimeline(String id, String patlID, DataFetchingEnvironment env) throws Exception {
        return null;
    }
}