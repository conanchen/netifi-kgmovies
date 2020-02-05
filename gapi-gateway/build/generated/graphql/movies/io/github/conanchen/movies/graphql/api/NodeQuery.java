package io.github.conanchen.movies.graphql.api;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public interface NodeQuery {

    NodeGQO node(String id) throws Exception;

}