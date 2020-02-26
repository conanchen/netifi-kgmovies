package io.github.conanchen.shoppingcart.graphql.model;

import java.util.Collection;

public interface DisplayableErrorGQO {

    Collection<String> getField();

    String getMessage();

}