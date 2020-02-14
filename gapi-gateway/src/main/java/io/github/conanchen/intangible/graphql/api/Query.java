package io.github.conanchen.intangible.graphql.api;

import java.util.*;
import io.github.conanchen.intangible.graphql.model.*;

public interface Query {

    BrandsConnectionGQO allBrands(String after, Integer first, String before, Integer last) throws Exception;

    BrandGQO brand(String id, String brandID) throws Exception;

}