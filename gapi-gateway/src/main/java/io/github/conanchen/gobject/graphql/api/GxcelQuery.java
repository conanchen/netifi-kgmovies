package io.github.conanchen.gobject.graphql.api;

import java.util.*;
import io.github.conanchen.gobject.graphql.model.*;

public interface GxcelQuery {

    GxcelObjectGQO gxcel(String id, String gxcelID) throws Exception;

}