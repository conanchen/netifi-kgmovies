package io.github.conanchen.gobject.graphql.api;

import java.util.*;
import io.github.conanchen.gobject.graphql.model.*;

public interface ImageObjectQuery {

    ImageObjectGQO imageObject(String id, String gID) throws Exception;

}