package io.github.conanchen.taskproject.graphql.api;

import java.util.*;
import io.github.conanchen.taskproject.graphql.model.*;

public interface Query {

    ProjectGQO project(String id, String projectID) throws Exception;

    TaskGQO task(String id, String taskID) throws Exception;

    PersonActivityTimelineGQO psaTimeline(String id, String patlID) throws Exception;

}