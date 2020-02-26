package io.github.conanchen.action.graphql.api;

import java.util.*;
import io.github.conanchen.action.graphql.model.*;

public interface DeleteActionQuery {

    DeleteActionGQO deleteAction(String id, String actionId) throws Exception;

}