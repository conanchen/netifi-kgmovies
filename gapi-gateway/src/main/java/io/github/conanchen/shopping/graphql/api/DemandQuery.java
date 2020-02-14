package io.github.conanchen.shopping.graphql.api;

import java.util.*;
import io.github.conanchen.shopping.graphql.model.*;

public interface DemandQuery {

    DemandGQO demand(String id, String demandID) throws Exception;

}