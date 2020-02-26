package io.github.conanchen.gobject.graphql.api;

import io.github.conanchen.gobject.graphql.model.VideoObjectGQO;

public interface VideoObjectQuery {

    VideoObjectGQO videoObject(String id, String gID) throws Exception;

}