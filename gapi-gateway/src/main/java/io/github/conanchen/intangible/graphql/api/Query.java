package io.github.conanchen.intangible.graphql.api;

import io.github.conanchen.intangible.graphql.model.BrandGQO;
import io.github.conanchen.intangible.graphql.model.BrandsConnectionGQO;

public interface Query {

    BrandsConnectionGQO allBrands(String after, Integer first, String before, Integer last) throws Exception;

    BrandGQO brand(String id, String brandID) throws Exception;

}