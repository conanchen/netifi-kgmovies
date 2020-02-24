package io.github.conanchen.gobject.graphql.api;

import java.util.*;
import io.github.conanchen.gobject.graphql.model.*;

public interface Query {

    GxcelObjectGQO gxcel(String id, String gxcelID) throws Exception;

    GeneralObjectGQO generalObject(String id, String gID) throws Exception;

    ImageObjectGQO imageObject(String id, String gID) throws Exception;

    AudioObjectGQO audioObject(String id, String gID) throws Exception;

    VideoObjectGQO videoObject(String id, String gID) throws Exception;

    GObjectGQO gobject(String id, String gobjectID) throws Exception;

}