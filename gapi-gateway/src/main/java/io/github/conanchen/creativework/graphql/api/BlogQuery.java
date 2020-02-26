package io.github.conanchen.creativework.graphql.api;

import io.github.conanchen.creativework.graphql.model.BlogGQO;

public interface BlogQuery {

    BlogGQO blog(String id, String blogId) throws Exception;

}