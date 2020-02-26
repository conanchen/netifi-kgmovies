package io.github.conanchen.gobject.graphql.api;

import io.github.conanchen.gobject.graphql.model.GxcelObjectGQO;

public interface GxcelQuery {

    GxcelObjectGQO gxcel(String id, String gxcelID) throws Exception;

}