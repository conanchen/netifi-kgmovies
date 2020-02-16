package io.github.conanchen.taskproject.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import io.github.conanchen.taskproject.graphql.api.Query;
import io.github.conanchen.taskproject.graphql.model.PersonActivityTimelineGQO;
import io.github.conanchen.taskproject.graphql.model.ProjectGQO;
import io.github.conanchen.taskproject.graphql.model.TaskGQO;



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
  public PersonActivityTimelineGQO psaTimeline(String id, String patlID) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  
}