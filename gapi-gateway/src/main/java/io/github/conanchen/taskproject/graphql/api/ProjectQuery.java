package io.github.conanchen.taskproject.graphql.api;

import io.github.conanchen.taskproject.graphql.model.ProjectGQO;

public interface ProjectQuery {

    ProjectGQO project(String id, String projectID) throws Exception;

}