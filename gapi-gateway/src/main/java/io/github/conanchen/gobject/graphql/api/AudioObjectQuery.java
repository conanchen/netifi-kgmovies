package io.github.conanchen.gobject.graphql.api;

import io.github.conanchen.gobject.graphql.model.AudioObjectGQO;

public interface AudioObjectQuery {

    AudioObjectGQO audioObject(String id, String gID) throws Exception;

}