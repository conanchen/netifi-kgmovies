package io.github.conanchen.gobject.graphql.api;

import io.github.conanchen.gobject.graphql.model.ImageObjectGQO;

public interface ImageObjectQuery {

    ImageObjectGQO imageObject(String id, String gID) throws Exception;

}