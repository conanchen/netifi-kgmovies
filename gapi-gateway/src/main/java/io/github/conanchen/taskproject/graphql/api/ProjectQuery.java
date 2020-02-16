package io.github.conanchen.taskproject.graphql.api;

import java.util.*;
import io.github.conanchen.taskproject.graphql.model.*;

public interface ProjectQuery {

    ProjectGQO project(String id, String projectID) throws Exception;

}