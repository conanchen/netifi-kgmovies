package io.github.conanchen.taskproject.graphql.api;

import java.util.*;
import io.github.conanchen.taskproject.graphql.model.*;

public interface TaskQuery {

    TaskGQO task(String id, String taskID) throws Exception;

}