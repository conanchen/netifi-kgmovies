package io.github.conanchen.intangible.graphql.api;

import java.util.*;
import io.github.conanchen.intangible.graphql.model.*;

public interface BrandQuery {

    BrandGQO brand(String id, String brandID) throws Exception;

}