package io.github.conanchen.intangible.graphql.api;

import io.github.conanchen.intangible.graphql.model.BrandConnectionGQO;

public interface AllBrandQuery {

    BrandConnectionGQO allBrand(String after, Integer first, String before, Integer last) throws Exception;

}