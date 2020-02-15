package io.github.conanchen.shoppingcart.graphql.model;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.api.*;

public interface DisplayableErrorGQO {

    Collection<String> getField();

    String getMessage();

}