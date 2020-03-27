package io.github.conanchen.taskproject.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import io.github.conanchen.taskproject.graphql.api.Query;
import io.github.conanchen.taskproject.graphql.model.IssueGQO;
import io.github.conanchen.taskproject.graphql.model.PersonActivityTimelineGQO;
import io.github.conanchen.taskproject.graphql.model.ProjectGQO;
import io.github.conanchen.taskproject.graphql.model.TaskGQO;
import org.springframework.stereotype.Service;


@Service
public class TaskprojectQueriesResolver implements Query, GraphQLQueryResolver {

    @Override
    public ProjectGQO project(String id, String projectID) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TaskGQO task(String id, String taskID) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IssueGQO issue(String id, String issueID) throws Exception {
        IssueGQO issueGQO = new IssueGQO();
        issueGQO.setId("issue1");
        issueGQO.setName("name1");
        issueGQO.setAlternateName("alternamte");
        return issueGQO;
    }

    @Override
    public PersonActivityTimelineGQO psaTimeline(String id, String patlID) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }


}