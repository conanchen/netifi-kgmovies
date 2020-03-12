package io.github.conanchen.intangible.graphql.api;

import io.github.conanchen.intangible.graphql.model.BrandConnectionGQO;
import io.github.conanchen.intangible.graphql.model.BrandGQO;

public interface Query {

    BrandConnectionGQO allBrand(String after, Integer first, String before, Integer last) throws Exception;

    BrandGQO brand(String id, String brandID) throws Exception;

}