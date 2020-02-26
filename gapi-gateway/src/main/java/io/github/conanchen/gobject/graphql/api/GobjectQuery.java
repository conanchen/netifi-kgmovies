package io.github.conanchen.gobject.graphql.api;

import io.github.conanchen.gobject.graphql.model.GObjectGQO;

public interface GobjectQuery {

    GObjectGQO gobject(String id, String gobjectID) throws Exception;

}