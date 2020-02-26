package io.github.conanchen.intangible.graphql.api;

import io.github.conanchen.intangible.graphql.model.BrandsConnectionGQO;

public interface AllBrandsQuery {

    BrandsConnectionGQO allBrands(String after, Integer first, String before, Integer last) throws Exception;

}