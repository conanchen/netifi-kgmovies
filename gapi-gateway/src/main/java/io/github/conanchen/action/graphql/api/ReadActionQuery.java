package io.github.conanchen.action.graphql.api;

import java.util.*;
import io.github.conanchen.action.graphql.model.*;

public interface ReadActionQuery {

    ReadActionGQO readAction(String id, String actionId) throws Exception;

}