package io.github.conanchen.gobject.graphql.api;

import java.util.*;
import io.github.conanchen.gobject.graphql.model.*;

public interface GobjectQuery {

    GObjectGQO gobject(String id, String gobjectID) throws Exception;

}