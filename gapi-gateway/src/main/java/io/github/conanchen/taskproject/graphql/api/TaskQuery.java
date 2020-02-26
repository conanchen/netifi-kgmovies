package io.github.conanchen.taskproject.graphql.api;

import io.github.conanchen.taskproject.graphql.model.TaskGQO;

public interface TaskQuery {

    TaskGQO task(String id, String taskID) throws Exception;

}