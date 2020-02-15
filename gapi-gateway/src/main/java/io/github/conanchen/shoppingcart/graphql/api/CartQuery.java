package io.github.conanchen.shoppingcart.graphql.api;

import java.util.*;
import io.github.conanchen.shoppingcart.graphql.model.*;

public interface CartQuery {

    CartGQO cart(String id, CurrencyInputGQO currency) throws Exception;

}