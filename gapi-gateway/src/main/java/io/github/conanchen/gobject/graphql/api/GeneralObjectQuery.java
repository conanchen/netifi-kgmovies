package io.github.conanchen.gobject.graphql.api;

import io.github.conanchen.gobject.graphql.model.GeneralObjectGQO;

public interface GeneralObjectQuery {

    GeneralObjectGQO generalObject(String id, String gID) throws Exception;

}