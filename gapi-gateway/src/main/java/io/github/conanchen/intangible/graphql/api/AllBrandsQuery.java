package io.github.conanchen.intangible.graphql.api;

import java.util.*;
import io.github.conanchen.intangible.graphql.model.*;

public interface AllBrandsQuery {

    BrandsConnectionGQO allBrands(String after, Integer first, String before, Integer last) throws Exception;

}