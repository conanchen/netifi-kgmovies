package io.github.conanchen.zommon.graphql.model;

import java.util.Collection;

public interface DisplayableErrorGQO {

    Collection<String> getField();

    String getMessage();

}