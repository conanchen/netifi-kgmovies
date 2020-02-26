package io.github.conanchen.place.graphql.api;

import java.util.*;
import io.github.conanchen.place.graphql.model.*;

public interface EldercareFindQuery {

    EldercareGQO eldercareFind(String id, String lbsID) throws Exception;

}